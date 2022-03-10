import zero.FlyingObject;
//import one.Airplane;
//import two.Helicopter;
//import two.Quadcopter;
//import three.Multirotor;
import four.UAV;
//import five.AgriculturalDrone;
import five.MAV;


//
//Part: 1
//Written by: Gabriel Horth, 40186942
//

/**
 * Driver to test methods on FlyingObjects for Part 1.
 * @author Gabriel Horth
 * @version 1.1.01
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

	FlyingObject[] testArray1 = new FlyingObject[2];
	testArray1[0] = new UAV(500,10);
	testArray1[1] = new MAV(500,10,"Entomopter",225);

	
	
	
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Here are the objects in our first test array:");
	System.out.println("----------------------------------------------------------------------\n");
	print(testArray1);
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("Let's test the attribute equality of a few items:");
	System.out.println("----------------------------------------------------------------------\n");
	
	System.out.println("Is item 9 equal to item 13? " + testArray1[0].equals(testArray1[1]) + "\n");
	
	System.out.println("Is item 13 equal to item 9? " + testArray1[1].equals(testArray1[0]) + "\n");
	
	
	
	System.out.println("\n----------------------------------------------------------------------");
	System.out.println("TEST COMPLETE. Program closing...");
	System.out.println("----------------------------------------------------------------------\n");
	
  }


}
