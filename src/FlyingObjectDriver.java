import zero.FlyingObject;
import one.Airplane;
import two.Helicopter;
import two.Quadcopter;
import three.Multirotor;
import four.UAV;
import five.AgriculturalDrone;
import five.MAV;


//
//Part: 1
//Written by: Gabriel Horth, 40186942
//

/**
 * Driver to test methods on FlyingObjects for Part 1.
 * @author Gabriel Horth
 * @version 1.1
 *
 */
public class FlyingObjectDriver {

  /**
   * Prints to screen a numbered list of FlyingObjects in array.
   * @param toPrint array to print
   */
  public static void print(FlyingObject[] toPrint) {
	for(int i = 0; i < toPrint.length; i++) {
	  System.out.println((i+1) + ". " + toPrint[i] + "\n");
	}
  }

  /**
   * Finds and displays least and most expensive UAV.
   * @param toSearch FlyingObject[] to search
   */
  public static void findLeastAndMostExpensiveUAV(FlyingObject[] toSearch) {
	double currentMinPrice = Double.MAX_VALUE;
	double currentMaxPrice = -(Double.MAX_VALUE-1);
	int minIndex = -1;
	int maxIndex = -1;
	
	System.out.println("Commencing search... ");
	for(int i = 0; i < toSearch.length; i++) {
	  if(UAV.class.isInstance(toSearch[i])) {
		double price = toSearch[i].getPrice();
		if(price < currentMinPrice) {
		  minIndex = i;
		  currentMinPrice = price;
		}
		if(price > currentMaxPrice) {
		  maxIndex = i;
		  currentMaxPrice = price;
		}
	  }
	}
	if(minIndex != -1 && maxIndex != -1) {
	  System.out.println("Array searched sucessfully:\n"
		  + "\nThe least expensive UAV is item no." +(minIndex+1) + ".\n"
		  + toSearch[minIndex]);
	  System.out.println(
		    "\nThe most expensive UAV is item no. " + (maxIndex+1) + ".\n"
		   + toSearch[maxIndex]);
	}
	else {System.out.println("Error, array contained no UAVs.");}
  }
  
  /**
   * Executable to run the required tests for part 1.
   * @param args
   */
  public static void main(String[] args) {
	
	System.out.println("\t\t\tWELCOME TO THE PART 1 DRIVER\n");

	FlyingObject[] testArray1 = new FlyingObject[15];
	testArray1[0] = new Airplane(1200000,"Boeing",8040);
	testArray1[1] = new Airplane(2000000,"Airbus",11560);
	testArray1[2] = new Helicopter(700000,"Bell",2600,12,2015,4);
	testArray1[3] = new Helicopter(1300000,"Sikorsky",6000,16,2010,12);
	testArray1[4] = new Quadcopter(1600000,"Bell-Boeing",5060,12,2024,10,80);//quadcopters don't really exist yet
	testArray1[5] = new Quadcopter(950000,"Airbus",2100,12,2025,4,100);//quadcopters don't really exist yet
	testArray1[6] = new Multirotor(500000,"Bothezat",2000,12,1922,6,3);
	testArray1[7] = new Multirotor(800000,"Cierva",4800,18,1948,10,3);
	testArray1[8] = new UAV(500,10);
	testArray1[9] = new UAV((UAV)testArray1[8]);
	testArray1[10] = new AgriculturalDrone(3800,400,"Volocopter",200);
	testArray1[11] = new AgriculturalDrone(2000,100,"DJI",10);
	testArray1[12] = new MAV(200,1,"Entomopter",225);
	testArray1[13] = new MAV(300,0.18,"Black Hornet",25);
	testArray1[14] = new Airplane(1200000,"Boeing",8044);
	
	FlyingObject[] testArray2 = new FlyingObject[15];
	testArray2[0] = new Airplane(1200000,"Boeing",8040);
	testArray2[1] = new Airplane(2000000,"Airbus",11560);
	testArray2[2] = new Helicopter(700000,"Bell",2600,12,2015,4);
	testArray2[3] = new Helicopter(1300000,"Sikorsky",6000,16,2010,12);
	testArray2[4] = new Quadcopter(1600000,"Bell-Boeing",5060,12,2024,10,80);//quadcopters don't really exist yet
	testArray2[5] = new Quadcopter(950000,"Airbus",2100,12,2025,4,100);//quadcopters don't really exist yet
	testArray2[6] = new Multirotor(500000,"Bothezat",2000,12,1922,6,3);
	testArray2[7] = new Multirotor(800000,"Cierva",4800,18,1948,10,3);
	testArray2[8] = new Airplane((Airplane)testArray2[0]);
	testArray2[9] = new Airplane((Airplane)testArray2[1]);
	testArray2[10] = new Helicopter((Helicopter)testArray2[2]);
	testArray2[11] = new Helicopter((Helicopter)testArray2[3]);
	testArray2[12] = new Quadcopter((Quadcopter)testArray2[4]);
	testArray2[13] = new Quadcopter((Quadcopter)testArray2[5]);
	testArray2[14] = new Airplane(1200000,"Boeing",8044);
	
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Here are the objects in our first test array:");
	System.out.println("----------------------------------------------------------------------\n");
	print(testArray1);
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("Let's test the attribute equality of a few items:");
	System.out.println("----------------------------------------------------------------------\n");
	
	System.out.println("Is item 1 equal to item 2? " + testArray1[0].equals(testArray1[1]) + "\n");
	
	System.out.println("Is item 1 equal to item 3? " + testArray1[0].equals(testArray1[2]) + "\n");
	
	System.out.println("Is item 1 equal to item 15? " + testArray1[0].equals(testArray1[14]) + "\n");
	
	System.out.println("Is item 9 equal to item 10? " + testArray1[8].equals(testArray1[9]) + "\n");
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("Here is a second test array with no UAVs:");
	System.out.println("----------------------------------------------------------------------\n");
	print(testArray2);
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("We will test our findLeastAndMostExpensiveUAV() method on both arrays: ");
	System.out.println("----------------------------------------------------------------------\n");
	
	System.out.println("\nArray 1:");
	System.out.println("_________");
	findLeastAndMostExpensiveUAV(testArray1);
	
	System.out.println("\nArray 2:");
	System.out.println("_________");
	findLeastAndMostExpensiveUAV(testArray2);
	
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("TEST COMPLETE. Program closing...");
	System.out.println("----------------------------------------------------------------------\n");
	
  }


}
