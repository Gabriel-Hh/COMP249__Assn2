/**
 * 
 */
package two;

/**
 * @author user
 *
 */
public class Quadcopter extends Helicopter {

  /**
   * 
   */
  public Quadcopter() {
	// TODO Auto-generated constructor stub
  }

  /**
   * @param price
   * @param brand
   * @param horsepower
   * @param numberOfCylinders
   * @param creationYear
   * @param passengerCapacity
   */
  public Quadcopter(double price, String brand, int horsepower, int numberOfCylinders, int creationYear,
	  int passengerCapacity) {
	super(price, brand, horsepower, numberOfCylinders, creationYear, passengerCapacity);
	// TODO Auto-generated constructor stub
  }

  /**
   * @param toCopy
   */
  public Quadcopter(Helicopter toCopy) {
	super(toCopy);
	// TODO Auto-generated constructor stub
  }

}
