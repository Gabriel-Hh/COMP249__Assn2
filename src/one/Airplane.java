package one;
import zero.FlyingObject;


/**
 * Airplane extends FlyingObject
 * @author Gabriel Horth
 * @see FlyingObject
 * @see 
 *
 */
public class Airplane extends FlyingObject{
  
  protected String brand;
  protected int horsepower;
  
  
  //********************************** Constructors ****************************************************// 
  public Airplane() {
	super();
	this.brand = "Unknown";
	this.horsepower = 0;
  }
  
  public Airplane( double price, String brand, int horsepower) {
	super(price);
	this.brand = brand;
	this.horsepower = horsepower;
  }
  
  public Airplane(Airplane toCopy){ 
	super(toCopy);
	brand = toCopy.brand;
	price = toCopy.price;
	horsepower = toCopy.horsepower;
  }
  
  
 //********************************* Getters and Setter ************************************************// 
  /**
   * @return the brand
   */
  public String getBrand() {
    return brand;
  }

  /**
   * @param brand the brand to set
   */
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * @return the horsepower
   */
  public int getHorsepower() {
    return horsepower;
  }

  /**
   * @param horsepower the horsepower to set
   */
  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  //********************************** Overrides ********************************************************// 
  @Override
  public String toString() {
	return "This " + getClass().getSimpleName() + " is manufactured by " + brand + ", has " + horsepower + " horsepower and costs " + price +"$.";
  }

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

  //************************************** TEST ********************************************************//   
  public static void main(String[] args) {
	Airplane test = new Airplane();
	System.out.println(test);
	Airplane test2 = new Airplane(1200000,"Boeing",8000);
	System.out.println(test2);
	Airplane test3 = new Airplane(test2);
	System.out.println("test3 is created with the copy constructor");
	System.out.println(test3);
	if(test2 == test3) {System.out.println("Airplane 2 and 3 are to same object");}
	else {System.out.println("Airplane 2 and 3 are not the same object.");}
	System.out.println("However, do they have equal values? " + test2.equals(test3));
	Airplane test4 = new Airplane(1200000,"Boeing",8000);
	System.out.println("test4 is created with the param constructor");
	System.out.println(test4);
	System.out.println("Do test4 and test2 they have equal values? " + test2.equals(test4));
	System.out.println("setPrice() on test4:");
	test4.setPrice(600000);
	System.out.println(test4);
	System.out.println("Still equal values: " + test2.equals(test4));
//	FlyingObject test5 = new FlyingObject(8); // cant do, as expected

  }
}