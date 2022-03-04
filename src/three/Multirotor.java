package three;

import two.Helicopter;

//
//Part: 1
//Written by: Gabriel Horth, 40186942
//

/**
 * Multirotor extends Helicopter.
 * @author Gabriel Horth
 * @version 1.1
 *
 */
public class Multirotor extends Helicopter {
  
  /**
   * Cummulative rotor count.
   */
  protected int numberOfRotors;

  //********************************* Constructors ****************************************************//
  
  /**
   * Default constructor for Multirotor.
   */
  public Multirotor() {
	super();
	numberOfRotors = 0;
  }

  /**
   * Parametrized constructor for Multirotor.
   * @param price
   * @param brand
   * @param horsepower
   * @param numberOfCylinders
   * @param creationYear
   * @param passengerCapacity
   * @param numberOfRotors
   */
  public Multirotor(double price, String brand, int horsepower, int numberOfCylinders, int creationYear,
	  int passengerCapacity, int numberOfRotors) {
	super(price, brand, horsepower, numberOfCylinders, creationYear, passengerCapacity);
	this.numberOfRotors = numberOfRotors;
  }

  /**
   * Copy constructor for Multirotor.
   * @param toCopy Multirotor to copy.
   */
  public Multirotor(Multirotor toCopy) {
	super(toCopy);
	numberOfRotors = toCopy.numberOfRotors;
  }

  //********************************* Getters and Setter ************************************************//
  
  /**Getter for numberOfRotors.
   * @return numberOfRotors
   */
  public int getNumberOfRotors() {
    return numberOfRotors;
  }

  /**Setter for numberOfRotors.
   * @param numberOfRotors the numberOfRotors to set
   */
  public void setNumberOfRotors(int numberOfRotors) {
    this.numberOfRotors = numberOfRotors;
  }

//********************************** Overrides ********************************************************// 
  
  /**
   * toString() method for Multirotor.
   */
  @Override
  public String toString() {
	return super.toString() 
		+ "\nIt has " + numberOfRotors + " rotors.";
  }

  /**equals() method for Multirotor.
   * @return true if this object is the same as the objargument;
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
	Multirotor other = (Multirotor) obj;
	return numberOfRotors == other.numberOfRotors;
  }

//************************************** TEST ********************************************************//  
//  public static void main(String[] args) {
//	
//	System.out.println("Default constructor:");
//	Multirotor test = new Multirotor();
//	System.out.println(test);
//	
//	System.out.println("\nParam constructor:");
//	Multirotor test2 = new Multirotor(1200000,"Boeing",8000,12,2006,10,2);
//	System.out.println(test2);
//	
//	System.out.println("\ntest3 is created with the copy constructor:");
//	Multirotor test3 = new Multirotor(test2);
//	System.out.println(test3);
//	if(test2 == test3) {System.out.println("Multirotor 2 and 3 are to same object");}
//	else {System.out.println("Multirotor 2 and 3 are not the same object.");}
//	System.out.println("However, do they have equal values? " + test2.equals(test3));
//	
//	
//	System.out.println("\ntest4 is created with the param constructor:");
//	Multirotor test4 = new Multirotor(1200000,"Boeing",8000,12,2006,10,2);
//	System.out.println(test4);
//	if(test2 == test4) {System.out.println("Multirotor 2 and 4 are to same object");}
//	else {System.out.println("Multirotor 2 and 4 are not the same object.");}
//	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
//	
//	
//	System.out.println("\nsetPrice() on test4:");
//	test4.setPrice(600000);
//	System.out.println(test4);
//	System.out.println("Still equal values: " + test2.equals(test4));
//	
//	System.out.println("\ntest5 points at test2:");
//	Multirotor test5 = new Multirotor();
//	test5 = test2;
//	System.out.println(test5);
//	if(test2 == test5) {System.out.println("Multirotor 2 and 5 are to same object");}
//	else {System.out.println("Multirotor 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test5));
//	
//	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
//	FlyingObject test6 = new Multirotor(test2);
//	System.out.println(test6);
//	if(test2 == test6) {System.out.println("Multirotor 2 and 6 are to same object");}
//	else {System.out.println("Multirotor 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test6));
//	
////	FlyingObject test5 = new FlyingObject(8); // cant do, as expected
//
//  }
  
}
