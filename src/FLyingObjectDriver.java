import zero.FlyingObject;
import one.Airplane;
import two.Helicopter;
import two.Quadcopter;
import three.Multirotor;
import four.UAV;
import five.AgriculturalDrone;
import five.MAV;

//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;



/**
 * Driver to test methods on FLyingObjects.
 * @author Gabriel Horth
 *
 */
public class FLyingObjectDriver {

public static void main(String[] args) {
  
  FlyingObject[] testArray = new FlyingObject[15];
  testArray[0] = new Airplane(1200000,"Boeing",8040);
  testArray[1] = new Airplane();
  testArray[2] = new Helicopter();
  testArray[3] = new Helicopter();
  testArray[4] = new Quadcopter();
  testArray[5] = new Quadcopter();
  testArray[6] = new Multirotor();
  testArray[7] = new Multirotor();
  testArray[8] = new UAV();
  testArray[9] = new UAV();
  testArray[10] = new AgriculturalDrone();
  testArray[11] = new AgriculturalDrone();
  testArray[12] = new MAV();
  testArray[13] = new MAV();
  testArray[14] = new Airplane(testArray[0]);
  
//  try {
//	Constructor<?> copyConstructor = (testArray[0].getClass().getConstructor(FlyingObject.class));
//	testArray[14] = (FlyingObject) copyConstructor.newInstance(testArray[0]);
//	System.out.println(testArray[14]);
//	
//	
//  } catch (NoSuchMethodException e) {
//	System.out.println("Constructor not found: \n");
//	e.printStackTrace();
//  } catch (SecurityException e) {
//	System.out.println("Security Violation: \n");
//	e.printStackTrace();
//  }
  
  int i = 1;
  for(FlyingObject flyer: testArray) {
  System.out.println(i + ". " +flyer+"\n");
  i++;
  }
  
}


}
