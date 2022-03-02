/**
 * 
 */
package two;

import one.Airplane;
import zero.FlyingObject;

/**
 * Helicopter extends Airplane
 * @author Gabriel Horth
 * @see Airplane
 */

public class Helicopter extends Airplane {
  protected int numberOfCylinders;
  protected int creationYear;
  protected int passengerCapacity;
  
  //********************************* Constructors ****************************************************//
  
 /**
  * Default Constructor for Helicopter.
  */
  public Helicopter() {
	super();
	numberOfCylinders = 0;
	creationYear = 0;
	passengerCapacity = 0;
	
  }
  /**
   * Parameterized Constructor for Helicopter.
   * @param price 
   * @param brand
   * @param horsepower
   * @param numberOfCylinders
   * @param creationYear
   * @param passengerCapacity
   */
  public Helicopter(double price, String brand, int horsepower, int numberOfCylinders, int creationYear, int passengerCapacity) {
	super(price, brand, horsepower);
	this.numberOfCylinders = numberOfCylinders;
	this.creationYear = creationYear;
	this.passengerCapacity = passengerCapacity;
  }
  /**
   * Copy constructor for Helicopter.
   * @param toCopy Helicopter to copy
   */
  public Helicopter(FlyingObject toCopy) {
	super(toCopy);
	try {
	Helicopter cast = (Helicopter)toCopy;
	numberOfCylinders = cast.numberOfCylinders;
	creationYear = cast.creationYear;
	passengerCapacity = cast.passengerCapacity;
	}
	catch(Exception e) {System.out.println("Copy failed in Helicopter Class:\n" + e.getMessage());}
  }
  
  //********************************* Getters and Setter ************************************************//
  
  /**Getter for numberOfCylinders.
   * @return the numberOfCylinders
   */
  public int getNumberOfCylinders() {
    return numberOfCylinders;
  }
  
  /**Setter for numberOfCylinders.
   * @param numberOfCylinders the numberOfCylinders to set
   */
  public void setNumberOfCylinders(int numberOfCylinders) {
    this.numberOfCylinders = numberOfCylinders;
  }
  
  /**
   * Getter for creationYear.
   * @return the creationYear
   */
  public int getCreationYear() {
    return creationYear;
  }
  
  /**
   * Setter for creationYear.
   * @param creationYear the creationYear to set
   */
  public void setCreationYear(int creationYear) {
    this.creationYear = creationYear;
  }
  
  /**
   * Getter for passengerCapacity.
   * @return the passengerCapacity
   */
  public int getPassengerCapacity() {
    return passengerCapacity;
  }
  
  /**
   * Setter for passengerCapacity.
   * @param passengerCapacity the passengerCapacity to set
   */
  public void setPassengerCapacity(int passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
  }
  
//********************************** Overrides ********************************************************// 
  
  /**
   * toString() method for Helicopter.
   */
  @Override
  public String toString() {
	return super.toString() + "\nIt has " + numberOfCylinders + " cylinders, " + "was made in " + creationYear 
		+ ", and can carry " + passengerCapacity + " passengers.";
  }

  /**equals() method for Helicopter.
   * @return true if this object is the same as the objargument;
   * true if this object is of the same dynamic type as the objargument
   * AND has all equal attribute values; 
   * false otherwise
   */
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
	  return true;
	if (getClass() != obj.getClass())
	  return false;
	if (!super.equals(obj))
	  return false;
	Helicopter other = (Helicopter) obj;
	return creationYear == other.creationYear && numberOfCylinders == other.numberOfCylinders
		&& passengerCapacity == other.passengerCapacity;
  }  
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   * @param toCopy FlyingObject to copy
   * @return copy
   */
  @Override
  public FlyingObject copy() {
	Helicopter copy = new Helicopter(this);
	return copy;
  }
  
  
//************************************** TEST ********************************************************//  
  public static void main(String[] args) {
	
	System.out.println("Default constructor:");
	Helicopter test = new Helicopter();
	System.out.println(test);
	
	System.out.println("\nParam constructor:");
	Helicopter test2 = new Helicopter(1200000,"Boeing",8000,12,2006,10);
	System.out.println(test2);
	
	System.out.println("\ntest3 is created with the copy constructor:");
	Helicopter test3 = new Helicopter(test2);
	System.out.println(test3);
	if(test2 == test3) {System.out.println("Helicopter 2 and 3 are to same object");}
	else {System.out.println("Helicopter 2 and 3 are not the same object.");}
	System.out.println("However, do they have equal values? " + test2.equals(test3));
	
	
	System.out.println("\ntest4 is created with the param constructor:");
	Helicopter test4 = new Helicopter(1200000,"Boeing",8000,12,2006,10);
	System.out.println(test4);
	if(test2 == test4) {System.out.println("Helicopter 2 and 4 are to same object");}
	else {System.out.println("Helicopter 2 and 4 are not the same object.");}
	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
	
	
	System.out.println("\nsetPrice() on test4:");
	test4.setPrice(600000);
	System.out.println(test4);
	System.out.println("Still equal values: " + test2.equals(test4));
	
	System.out.println("\ntest5 points at test2:");
	Helicopter test5 = new Helicopter();
	test5 = test2;
	System.out.println(test5);
	if(test2 == test5) {System.out.println("Helicopter 2 and 5 are to same object");}
	else {System.out.println("Helicopter 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test5));
	
	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
	FlyingObject test6 = new Helicopter(test2);
	System.out.println(test6);
	if(test2 == test6) {System.out.println("Helicopter 2 and 6 are to same object");}
	else {System.out.println("Helicopter 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test6));
	
//	FlyingObject test5 = new FlyingObject(8); // cant do, as expected

  }

  
  
  
}
