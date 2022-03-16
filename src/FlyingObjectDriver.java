import zero.FlyingObject;
import one.Airplane;
import two.Helicopter;
import two.Quadcopter;
import three.Multirotor;
import four.UAV;
import five.AgriculturalDrone;
import five.MAV;

import java.lang.reflect.Constructor;// Probably PROHIBITED. Not used by polymorphic copyFlyingObject() method.
									 //ONLY USED BY alternative copyFlyingObject() method.


/**
 * Driver to test methods on FlyingObjects.
 * @author Gabriel Horth
 *
 */
public class FlyingObjectDriver {
  
  /**
   * Polymorphic FlyingObject[] copy method.
   * @param toCopy array to copy
   * @return copy[] copy of toCopy[]
   */
  public static FlyingObject[] copyFlyingObjects(FlyingObject[] toCopy) {
	FlyingObject[] copy = new FlyingObject[toCopy.length];
	
	for (int i = 0; i < copy.length; i++) {
	 copy[i] = toCopy[i].copy(); 
	}
	return copy;
  }
  
  /**
   * Alternative FlyingObject[] copy method.
   * @param toCopy array to copy
   * @param weirdmethod String to distiguish method signature
   * @return copy[] copy of toCopy[]
   * 
   * 
   * NB: In this implementation the method is a constructor, therefore they all call super().
   * This defeats the purpose of this work-around and reaffirms that a polymorphic method is most appropriate.
   * 
   * However, for a non-constructor method, it could have a use case.
   * i.e. "Object.getClass().getMethod(String name,Class<?>...parameterTypes)"
   * Could be useful when you dont have access to OR can't modify a base class.
   * In this case, you could implement a new or modified method ONLY in the desired descendant classes
   * and access a method quasi-polymorphically. 
   * 
   * Method is not required in common ancestor (for non-constructor methods).
   * Method does not require "if" or "switch" statements to verifiy eligibility of objects' dynamic-class.
   * Method must be identifiable by a unique signature (shared by implemented classes only).
   */
  public static FlyingObject[] copyFlyingObjects(FlyingObject[] toCopy, String alternativeMethod) {
	  FlyingObject[] copy = new FlyingObject[toCopy.length];

		for(int i = 0; i < copy.length; i++) {
		  try {
			Constructor<?> copyConstructor = (toCopy[i].getClass().getConstructor(toCopy[i].getClass()));
			copy[i] = toCopy[i].getClass().cast(copyConstructor.newInstance(toCopy[i]));
		  } 
		  catch (NoSuchMethodException e) {System.out.println("Constructor not found: \n" + e.getMessage());}
		  catch (SecurityException e) {System.out.println("Security Violation: \n" + e.getMessage() );}
		  catch (Exception e) {System.out.println("Other Exception: \n" + e.getMessage());}
		}
		return copy;
	}
  
  /**
   * Prints to screen numbered list of array.
   * @param toPrint FlyingObject[] to print
   */
  public static void print(FlyingObject[] toPrint) {
	for(int i = 0; i < toPrint.length; i++) {
	  System.out.println((i+1) + ". " + toPrint[i] +"\n");
	}
  }

  public static void main(String[] args) {
	System.out.println("\n\n---------------------------------------------------------------------------------------");
	System.out.println("First we created a test array and displayed it contents:");
	System.out.println("---------------------------------------------------------------------------------------\n");
	FlyingObject[] testArray = new FlyingObject[15];
	testArray[0] = new Airplane(1200000,"Boeing",8040);
	testArray[1] = new Airplane(2000000,"Airbus",11560);
	testArray[2] = new Helicopter(700000,"Bell",2600,12,2015,4);
	testArray[3] = new Helicopter(1300000,"Sikorsky",6000,16,2010,12);
	testArray[4] = new Quadcopter(1600000,"Bell-Boeing",5060,12,2024,10,80);//quadcopters don't really exist yet, creationYear in future
	testArray[5] = new Quadcopter(950000,"Airbus",2100,12,2025,4,100);//quadcopters don't really exist yet, creationYear in future
	testArray[6] = new Multirotor(500000,"Bothezat",2000,12,1922,6,3);
	testArray[7] = new Multirotor(800000,"Cierva",4800,18,1948,10,3);
	testArray[8] = new UAV(500,10);
	testArray[9] = new UAV((UAV)testArray[8]);
	testArray[10] = new AgriculturalDrone(3800,400,"Volocopter",200);
	testArray[11] = new AgriculturalDrone(2000,100,"DJI",10);
	testArray[12] = new MAV(200,1,"Entomopter",225);
	testArray[13] = new MAV(300,0.18,"Black Hornet",25);
	testArray[14] = new Airplane(1200000,"Boeing",8040);
	
	print(testArray);
	
	
//	Multirotor -> Airplane cast
	Airplane test = new Airplane((Airplane)testArray[6]);
	System.out.println(test);
	
	
	System.out.println("\n\n---------------------------------------------------------------------------------------");
	System.out.println("Then we made make a copy of the array through a polymorphic method, displayed below:");
	System.out.println("---------------------------------------------------------------------------------------\n");
	
	FlyingObject[] copy = copyFlyingObjects(testArray);
	print(copy);

	System.out.println("\n\n---------------------------------------------------------------------------------------");
	System.out.println("Here made a copy of the array through directed constructor access:");
	System.out.println("---------------------------------------------------------------------------------------\n");
	
	FlyingObject[] copy2 = copyFlyingObjects(testArray,"alternative method");
	print(copy2);
	
//	FlyingObject othertest = new FlyingObject(); // <THIS WILL NOT WORK, CANNOT INSTANTIATE AN ABSTRACT CLASS.>
  }

}