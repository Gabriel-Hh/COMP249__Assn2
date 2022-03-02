package four;

import zero.FlyingObject;

/**
 * 
 * @author user
 *
 */
public class UAV extends FlyingObject {
  
  protected double weight; //weight in kg.

  //********************************** Constructors ****************************************************// 
  
  /**
   * Default Constructor for UAV.
   */
  public UAV() {
	weight = 0.00;
  }

  /**
   * Parameterized Constructor for UAV.
   * @param price
   * @param weight
   */
  public UAV(double price, double weight) {
	super(price);
	this.weight = (Math.round(weight*100))/100.00;
  }

  /**
   * Copy Constructor for UAV.
   * @param toCopy UAV to copy
   */
  public UAV(FlyingObject toCopy) {
	super(toCopy);
	try {
	  UAV cast = (UAV)toCopy;
	  weight = cast.weight;
	}
	catch(Exception e){System.out.println("Copy failed in UAV Class:\n" + e.getMessage());}
  }

  //********************************* Getters and Setter ************************************************//
  
  /**Getter for weight.
   * @return the weight
   */
  public double getWeight() {
    return weight;
  }

  /**Setter for weight.
   * @param weight the weight to set
   */
  public void setWeight(double weight) {
    this.weight = (Math.round(weight*100))/100.00;
  }

  //********************************** Overrides ********************************************************// 
  
  /**
   * toString() method for UAV.
   */
  @Override
  public String toString() {
	return "This " + getClass().getSimpleName() + " weighs " + weight + " kilograms and costs " + price +"$.";
  }

  /**
   * equals() method for UAV
   *  @return true if this object is the same as the objargument;
   * true if this object is of the same dynamic type as the objargument
   * AND has all equal attribute values; 
   * false otherwise
   */
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
	  return true;
	if (obj == null)
	  return false;
	if (getClass() != obj.getClass())
	  return false;
	UAV other = (UAV) obj;
	return weight == other.weight && price == other.price;
  }
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   * @param toCopy FlyingObject to copy
   * @return copy
   */
  @Override
  public FlyingObject copy() {
	UAV copy = new UAV(this);
	return copy;
  }

//************************************** TEST ********************************************************//  
  
  public static void main(String[] args) {
	
	System.out.println("Default constructor:");
	UAV test = new UAV();
	System.out.println(test);
	
	System.out.println("\nParam constructor:");
	UAV test2 = new UAV(2000,11);
	System.out.println(test2);
	
	System.out.println("\ntest3 is created with the copy constructor:");
	UAV test3 = new UAV(test2);
	System.out.println(test3);
	if(test2 == test3) {System.out.println("UAV 2 and 3 are to same object");}
	else {System.out.println("UAV 2 and 3 are not the same object.");}
	System.out.println("However, do they have equal values? " + test2.equals(test3));
	
	
	System.out.println("\ntest4 is created with the param constructor:");
	UAV test4 = new UAV(2000,11);
	System.out.println(test4);
	if(test2 == test4) {System.out.println("UAV 2 and 4 are to same object");}
	else {System.out.println("UAV 2 and 4 are not the same object.");}
	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
	
	
	System.out.println("\nsetPrice() on test4:");
	test4.setPrice(1400);
	System.out.println(test4);
	System.out.println("Still equal values: " + test2.equals(test4));
	
	System.out.println("\ntest5 points at test2:");
	UAV test5 = new UAV();
	test5 = test2;
	System.out.println(test5);
	if(test2 == test5) {System.out.println("UAV 2 and 5 are to same object");}
	else {System.out.println("UAV 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test5));
	
	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
	FlyingObject test6 = new UAV(test2);
	System.out.println(test6);
	if(test2 == test6) {System.out.println("UAV 2 and 6 are to same object");}
	else {System.out.println("UAV 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test6));
	
//	FlyingObject test5 = new FlyingObject(8); // cant do, as expected

  }
  
}
