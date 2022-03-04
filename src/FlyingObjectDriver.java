import zero.FlyingObject;
import one.Airplane;
import two.Helicopter;
import two.Quadcopter;
import three.Multirotor;
import four.UAV;
import five.AgriculturalDrone;
import five.MAV;

//
//Part: 2
//Written by: Gabriel Horth, 40186942
//

/**
 * Driver to test  part-2 methods on FlyingObjects.
 * @author Gabriel Horth
 * @version 1.2
 * @see zero.FlyingObject
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
   * Prints to screen numbered list of array.
   * @param toPrint FlyingObject[] to print
   */
  public static void print(FlyingObject[] toPrint) {
	for(int i = 0; i < toPrint.length; i++) {
	  System.out.println((i+1) + ". " + toPrint[i] +"\n");
	}
  }

  /**
   * Executable that runs required test for part 2.
   * @param args no effect
   */
  public static void main(String[] args) {
	
	System.out.println("\t\t\tWELCOME TO THE PART 2 DRIVER");
	
	System.out.println("\n---------------------------------------------------------------------------------------");
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
	
	System.out.println("\n\n---------------------------------------------------------------------------------------");
	System.out.println("Then we made a copy of the array through a polymorphic method, displayed below:");
	System.out.println("---------------------------------------------------------------------------------------\n");
	
	FlyingObject[] copy = copyFlyingObjects(testArray);
	print(copy);

	System.out.println("\n\n---------------------------------------------------------------------------------------");
	System.out.println("TEST COMPLETE. Program closing..");
	System.out.println("---------------------------------------------------------------------------------------\n");
	
//	FlyingObject othertest = new FlyingObject(); // <AS EXPECTED, THIS WILL NOT WORK, CANNOT INSTANTIATE AN ABSTRACT CLASS.>
	System.exit(0);
  }

}