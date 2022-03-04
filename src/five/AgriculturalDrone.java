/**
 * 
 */
package five;

import four.UAV;

/**AgriculturalDrone extends UAV.
 * @author Gabriel Horth
 *
 */
public class AgriculturalDrone extends UAV {

  protected String brand;
  protected int carryCapacity; //in kg
  
  //********************************** Constructors ****************************************************// 
  
  /**
   * Default Constructor for AgricultoralDrone.
   */
  public AgriculturalDrone() {
	super();
	brand = "Unknown";
	carryCapacity = 0;
  }

  /**Parameterized Constructor for AgriculturalDrone.
   * @param price
   * @param weight
   */
  public AgriculturalDrone(double price, double weight, String brand, int carryCapacity) {
	super(price, weight);
	this.brand = brand;
	this.carryCapacity = carryCapacity;
  }

  /**Copy COnstructor for AgriculturalDrone.
   * @param toCopy AgriculturalDrone to copy
   */
  public AgriculturalDrone(AgriculturalDrone toCopy) {
	super(toCopy);
	brand = toCopy.brand;
	carryCapacity = toCopy.carryCapacity;
  }
  
  //********************************* Getters and Setter ************************************************//

  /**Getter for brand.
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**Setter for brand.
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**Getter for carryCapacity.
   * @return the carryCapacity
   */
  public int getCarryCapacity() {
    return carryCapacity;
  }

  /**Setter for carryCapacity.
   * @param carryCapacity the carryCapacity to set
   */
  public void setCarryCapacity(int carryCapacity) {
    this.carryCapacity = carryCapacity;
  }

//********************************** Overrides ********************************************************//
  
  /**
   * toString() for AgriculturalDrone.
   */
  @Override
  public String toString() {
	return super.toString()
		+ "\nIt is manufactured by " + brand + " and can carry upto " + carryCapacity + " kilograms.";
  }

  /**
   * equals() method for AgriculturalDrone.
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
	AgriculturalDrone other = (AgriculturalDrone) obj;
	return brand == other.brand && carryCapacity == other.carryCapacity;
  }
  
//************************************** TEST ********************************************************//  
  
//  public static void main(String[] args) {
//	
//	System.out.println("Default constructor:");
//	AgriculturalDrone test = new AgriculturalDrone();
//	System.out.println(test);
//	
//	System.out.println("\nParam constructor:");
//	AgriculturalDrone test2 = new AgriculturalDrone(50000,400,"John Deere",200);
//	System.out.println(test2);
//	
//	System.out.println("\ntest3 is created with the copy constructor:");
//	AgriculturalDrone test3 = new AgriculturalDrone(test2);
//	System.out.println(test3);
//	if(test2 == test3) {System.out.println("AgriculturalDrone 2 and 3 are to same object");}
//	else {System.out.println("AgriculturalDrone 2 and 3 are not the same object.");}
//	System.out.println("However, do they have equal values? " + test2.equals(test3));
//	
//	
//	System.out.println("\ntest4 is created with the param constructor:");
//	AgriculturalDrone test4 = new AgriculturalDrone(50000,400,"John Deere",200);
//	System.out.println(test4);
//	if(test2 == test4) {System.out.println("AgriculturalDrone 2 and 4 are to same object");}
//	else {System.out.println("AgriculturalDrone 2 and 4 are not the same object.");}
//	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
//	
//	
//	System.out.println("\nsetPrice() on test4:");
//	test4.setPrice(1400);
//	System.out.println(test4);
//	System.out.println("Still equal values: " + test2.equals(test4));
//	
//	System.out.println("\ntest5 points at test2:");
//	AgriculturalDrone test5 = new AgriculturalDrone();
//	test5 = test2;
//	System.out.println(test5);
//	if(test2 == test5) {System.out.println("AgriculturalDrone 2 and 5 are to same object");}
//	else {System.out.println("AgriculturalDrone 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test5));
//	
//	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
//	FlyingObject test6 = new AgriculturalDrone(test2);
//	System.out.println(test6);
//	if(test2 == test6) {System.out.println("AgriculturalDrone 2 and 6 are to same object");}
//	else {System.out.println("AgriculturalDrone 2 and 5 are not the same object.");}
//	System.out.println("Do they have equal values? " + test2.equals(test6));
	
//	FlyingObject test5 = new FlyingObject(8); // cant do, as expected

//  }

}
