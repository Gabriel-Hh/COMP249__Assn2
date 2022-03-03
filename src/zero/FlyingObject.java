package zero;

/** Abstract class to unite all flying objects.
 * This implementation has a common attribute price of type double.
 * It has 3 constructors that can only be called by decendent classes.
 * @author Gabriel Horth
 * @see Airplane
 * @see UAV
 */
public abstract class FlyingObject {
  
  protected double price; //price in dollars
  
  //********************************** Constructors ****************************************************// 
  
  /**
   * Default Constructor for FlyingObject.
   */
  protected FlyingObject() {
	price = 00.00;
  }
  
  /**
   * Parameterized Constructor for FlyingObject.
   * @param price
   */
  protected FlyingObject(double price) {
	this.price = (Math.round(price*100))/100.00;
  }
  
  /**
   * Copy Constructor for FlyingObject
   * @param toCopy FLyingObject to copy
   * @see FlyingObjectDriver
   * @see copyFlyingObjects(FlyingObject[], String)
   * NB: Descendants' copy constructors all accept FlyingObject arg 
   * to satisfy method copyFlyingObjects(FlyingObject[], String)
   */
  protected FlyingObject(FlyingObject toCopy) {
	  price = toCopy.price;
}	
  
  //********************************* Getters and Setter ************************************************//
  
  /**
   * Getter for price.
   * @return
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * Setter for price.
   * @param price
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
   * @param toCopy FlyingObject to copy
   * @return
   */
  public abstract FlyingObject copy(); //
  

}
