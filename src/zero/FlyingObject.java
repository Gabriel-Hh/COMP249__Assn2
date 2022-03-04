/**
 * Contains FlyingObject Class.
 */
package zero;

//
//Part: 2
//Written by: Gabriel Horth, 40186942
//

/** Abstract class to unite all flying objects.
 * This implementation has a common attribute price of type double.
 * It has 3 constructors that can only be called by decendent classes.
 * @author Gabriel Horth
 * @version 1.2
 * @see one.Airplane
 * @see four.UAV
 */
public abstract class FlyingObject {
  /**
   * Cost is dollars.
   */
  protected double price;
  
  //********************************** Constructors ****************************************************// 
  
  /**
   * Default Constructor for FlyingObject.
   */
  protected FlyingObject() {
	price = 00.00;
  }
  
  /**
   * Parameterized Constructor for FlyingObject.
   * @param price Cost is dollars
   */
  protected FlyingObject(double price) {
	this.price = (Math.round(price*100))/100.00;
  }
  
  /**
   * Copy Constructor for FlyingObject
   * @param toCopy FlyingObject to copy
   */
  protected FlyingObject(FlyingObject toCopy) {
	  price = toCopy.price;
}	
  
  //********************************* Getters and Setter ************************************************//
  
  /**
   * Getter for price.
   * @return price Cost is dollars
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * Setter for price.
   * @param price Cost in dollars
   */
  protected void setPrice(double price) {
    this.price = (Math.round(price*100))/100.00;
  }

  //********************************** Abstracts ********************************************************// 
  
  /**
   * Abstract toString() Method for FlyingObject.
   */
  @Override
  public abstract String toString();
  
  /**
   * Abstract equals() Method for FlyingObject.
   */
  @Override
  public abstract boolean equals(Object obj);
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   */
  public abstract FlyingObject copy(); //
  

}
