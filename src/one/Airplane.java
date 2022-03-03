package one;

import two.Helicopter;
import zero.FlyingObject;


/**Airplane extends FlyingObject.
 * @author Gabriel Horth
 * @see FlyingObject
 * @see Helicopter
 *
 */
public class Airplane extends FlyingObject{
  
  protected String brand;
  protected int horsepower;
  
  
  //********************************** Constructors ****************************************************// 
  
  /**
   * Default Constructor for Airplane.
   */
  public Airplane() {
	super();
	this.brand = "Unknown";
	this.horsepower = 0;
  }
  
  /**
   * Parameterized Constructor for Airplane.
   * @param price
   * @param brand
   * @param horsepower
   */
  public Airplane( double price, String brand, int horsepower) {
	super(price);
	this.brand = brand;
	this.horsepower = horsepower;
  }
  
  /**
   * Copy Constructor for Airplane.
   * @param toCopy Airplaine to copy
   */
  public Airplane(FlyingObject toCopy){ 
	super(toCopy);
	try { 
	 Airplane cast = (Airplane)toCopy;
	 if(toCopy.getClass()!=Airplane.class && Airplane.class.isInstance(toCopy)) 
	 	{throw new ClassCastException(toCopy.getClass().getName()+ " was cast to " + Airplane.class.getName() );}
	 brand = cast.brand;
	 price = cast.price;
	 horsepower = cast.horsepower;
	}
	catch(ClassCastException e) {System.out.println("Warning: Upcast performed, possible data loss:\n" +e.getMessage());}
	catch(Exception e){System.out.println("Error: Copy failed in Airplane Class:\n" + e.getMessage());}
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

  /**Getter for horsepower.
   * @return the horsepower
   */
  public int getHorsepower() {
    return horsepower;
  }

  /**Setter for horsepower.
   * @param horsepower the horsepower to set
   */
  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  //********************************** Overrides ********************************************************// 
  
  /**
   * toString() method for Airplane.
   */
  @Override
  public String toString() {
	return "This " + getClass().getSimpleName() + " is manufactured by " + brand + ", has " + horsepower + " horsepower and costs " + price +"$.";
  }

  /**
   * equals() method for Airplane.
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
	Airplane other = (Airplane) obj;
	return brand == other.brand && horsepower == other.horsepower
		&& price == other.price;
  }
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   * @param toCopy FlyingObject to copy
   * @return copy
   */
  @Override
  public FlyingObject copy() {
	Airplane copy = new Airplane(this);
	return copy;
  }



//************************************** TEST ********************************************************//  
  public static void main(String[] args) {
	
	System.out.println("Default constructor:");
	Airplane test = new Airplane();
	System.out.println(test);
	
	System.out.println("\nParam constructor:");
	Airplane test2 = new Airplane(1200000,"Boeing",8000);
	System.out.println(test2);
	
	System.out.println("\ntest3 is created with the copy constructor:");
	Airplane test3 = new Airplane(test2);
	System.out.println(test3);
	if(test2 == test3) {System.out.println("Airplane 2 and 3 are to same object");}
	else {System.out.println("Airplane 2 and 3 are not the same object.");}
	System.out.println("However, do they have equal values? " + test2.equals(test3));
	
	
	System.out.println("\ntest4 is created with the param constructor:");
	Airplane test4 = new Airplane(1200000,"Boeing",8000);
	System.out.println(test4);
	if(test2 == test4) {System.out.println("Airplane 2 and 4 are to same object");}
	else {System.out.println("Airplane 2 and 4 are not the same object.");}
	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
	
	
	System.out.println("\nsetPrice() on test4:");
	test4.setPrice(600000);
	System.out.println(test4);
	System.out.println("Still equal values: " + test2.equals(test4));
	
	System.out.println("\ntest5 points at test2:");
	Airplane test5 = new Airplane();
	test5 = test2;
	System.out.println(test5);
	if(test2 == test5) {System.out.println("Airplane 2 and 5 are to same object");}
	else {System.out.println("Airplane 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test5));
	
	System.out.println("\ntest6 is of static type FlyingObject, made through copy:");
	FlyingObject test6 = new Airplane(test2);
	System.out.println(test6);
	if(test2 == test6) {System.out.println("Airplane 2 and 6 are to same object");}
	else {System.out.println("Airplane 2 and 5 are not the same object.");}
	System.out.println("Do they have equal values? " + test2.equals(test6));
	
//	FlyingObject test5 = new FlyingObject(8); // cant do, as expected

  }


  
}