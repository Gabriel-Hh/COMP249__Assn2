/**
 * 
 */
package two;

import zero.FlyingObject;

//
//Part: 2
//Written by: Gabriel Horth, 40186942
//

/**Quadcopter extends Helicopter.
 * @author Gabriel Horth
 * @see Helicopter
 *
 */
public class Quadcopter extends Helicopter {
  
  protected int maxFlyingSpeed; //in km/h
  
  //********************************* Constructors ****************************************************//
  
  /**
   * Default Constructor for Quadcopter.
   */
  public Quadcopter() {
	super();
	maxFlyingSpeed = 0;
  }

  /**Parameterized Constructor for Quadcopter.
   * @param price
   * @param brand
   * @param horsepower
   * @param numberOfCylinders
   * @param creationYear
   * @param passengerCapacity
   * @param maxFlyingSpeed
   */
  public Quadcopter(double price, String brand, int horsepower, int numberOfCylinders, int creationYear,int passengerCapacity,int maxFlyingSpeed) {
	super(price, brand, horsepower, numberOfCylinders, creationYear, passengerCapacity);
	this.maxFlyingSpeed = maxFlyingSpeed;
  }

  /**Copy Constructor for Quadcopter.
   * @param toCopy Quadcopter to copy
   */
  public Quadcopter(Quadcopter toCopy) {
	super(toCopy);
	maxFlyingSpeed = toCopy.maxFlyingSpeed;
  }

  //********************************* Getters and Setter ************************************************//
  
  /**Getter for maxFlyingSpeed.
   * @return the maxFlyingSpeed
   */
  public int getMaxFlyingSpeed() {
    return maxFlyingSpeed;
  }

  /**Setter for maxFlyingSpeed.
   * @param maxFlyingSpeed the maxFlyingSpeed to set
   */
  public void setMaxFlyingSpeed(int maxFlyingSpeed) {
    this.maxFlyingSpeed = maxFlyingSpeed;
  }

//********************************** Overrides ********************************************************//
  
  /**
   * toString() method for Quadcopter.
   */
  @Override
  public String toString() {
	return super.toString() + 
		"\nIt has a maximum flying speed of " + maxFlyingSpeed + " km/h.";
  }

  /**
   * equals() method for Quadcopter.
   *  @return true if this object is the same as the objargument;
   * true if this object is of the same dynamic type as the objargument
   * AND has all equal attribute values; 
   * false otherwise
   */
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
	  return true;
	if (!super.equals(obj))
	  return false;
	if (getClass() != obj.getClass())
	  return false;
	Quadcopter other = (Quadcopter) obj;
	return maxFlyingSpeed == other.maxFlyingSpeed;
  }
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   * @param toCopy FlyingObject to copy
   * @return copy
   */
  @Override
  public FlyingObject copy() {
	Quadcopter copy = new Quadcopter(this);
	return copy;
  }

//************************************** TEST ********************************************************//  
//  public static void main(String[] args) {
//	
//	System.out.println("Default constructor:");
//	Quadcopter test = new Quadcopter();
//	System.out.println(test);
//	
//	System.out.println("\nParam constructor:");
//	Quadcopter test2 = new Quadcopter(1200000,"Boeing",8000,12,2006,10,60);
//	System.out.println(test2);
//	
//	System.out.println("\ntest3 is created with the copy constructor:");
//	Quadcopter test3 = new Quadcopter(test2);
//	System.out.println(test3);
//	if(test2 == test3) {System.out.println("Quadcopter 2 and 3 are to same object");}
//	else {System.out.println("Quadcopter 2 and 3 are not the same object.");}
//	System.out.println("However, do they have equal values? " + test2.equals(test3));
//	
//	
//	System.out.println("\ntest4 is created with the param constructor:");
//	Quadcopter test4 = new Quadcopter(1200000,"Boeing",8000,12,2006,10,60);
//	System.out.println(test4);
//	if(test2 == test4) {System.out.println("Quadcopter 2 and 4 are to same object");}
//	else {System.out.println("Quadcopter 2 and 4 are not the same object.");}
//	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
//	
//	
//	System.out.println("\nsetPrice() on test4:");
//	test4.setPrice(600000);
//	System.out.println(test4);
//	System.out.println("Still equal values: " + test2.equals(test4));
//	
//	System.out.println("\ntest5 points at test2:");
//	Quadcopter test5 = new Quadcopter();
//	test5 = test2;
//	System.out.println(test5);
//	if(test2 == test5) {System.out.println("Quadcopter 2 and 5 are to same object");}
//	else {System.out.println("Quadcopter 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test5));
//	
//	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
//	FlyingObject test6 = new Quadcopter(test2);
//	System.out.println(test6);
//	if(test2 == test6) {System.out.println("Quadcopter 2 and 6 are to same object");}
//	else {System.out.println("Quadcopter 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test6));
//	
////	FlyingObject test5 = new FlyingObject(8); // cant do, as expected
//
//  }
  
}
