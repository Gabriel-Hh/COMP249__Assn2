package zero;
/** Abstract class to unite all flying objects.
 * This implementation has a common attribute price of type double.
 * It has 3 constructors that can only be called by decendent classes.
 * This solves the problem of copying an array of type FlyingObject[],
 * while respecting the essence of inheritance from an abstract class.
 * @author Gabriel Horth
 * @see Airplane
 * @see UAV
 */
public abstract class FlyingObject {
  protected double price;
  
  protected FlyingObject() {
	price = 00.00;
  }
  
  protected FlyingObject(double price) {
	this.price = (Math.round(price*100))/100.00;
  }
  
  protected FlyingObject(FlyingObject toCopy) {
	  price = toCopy.price;
}	
  
  public double getPrice() {
    return price;
  }

  protected void setPrice(double price) {
    this.price = price;
  }

  @Override
  public abstract String toString();
  
  @Override
  public abstract boolean equals(Object obj);
  

}
