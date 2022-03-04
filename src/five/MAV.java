package five;

import four.UAV;
import zero.FlyingObject;

//
//Part: 2
//Written by: Gabriel Horth, 40186942
//

/**MAV extends UAV.
 * @author Gabriel Horth
 *
 */
public class MAV extends UAV {

  private String model;
  private double size; //in square centimeters
  
  
  //********************************** Constructors ****************************************************//
  
  /**
   * Default COnstructor for MAV.
   */
  public MAV() {
	super();
	model = "Unknown";
	size = 0.00;
  }

  /**Parameterized Constructor for MAV.
   * @param price
   * @param weight
   */
  public MAV(double price, double weight, String model, double size) {
	super(price, weight);
	this.model = model;
	if(size>300) {System.out.println("MAV size too large, has been set to 300");}
	size = 300;
	this.size = size;
  }

  /**
   * @param toCopy
   */
  public MAV(MAV toCopy) {
	super(toCopy);
	  model = toCopy.model;
	  size = toCopy.size;
  }

  //********************************* Getters and Setter ************************************************//
  
  /**
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * @param model the model to set
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * @return the size
   */
  public double getSize() {
    return size;
  }

  /**
   * @param size the size to set
   */
  public void setSize(double size) {
	if(size>300) {System.out.println("MAV size too large, has been set to 300");}
	size = 300;
	this.size = size;
  }

  //********************************** Overrides ********************************************************//
  
  /**
   * 
   */
  @Override
  public String toString() {
	return super.toString()
		+ "\nIt's model is " + model + ", with a size of " + size + " square centimeters.";
  }

  /**
   * 
   */
  @Override
  public boolean equals(Object obj) {
	if (this == obj)
	  return true;
	if (!super.equals(obj))
	  return false;
	if (getClass() != obj.getClass())
	  return false;
	MAV other = (MAV) obj;
	return model == other.model && size == other.size;
  }
  
  /**
   * Polymorphic method to create a copy of a FlyingObject.
   * @param toCopy FlyingObject to copy
   * @return copy
   */
  @Override
  public FlyingObject copy() {
	MAV copy = new MAV(this);
	return copy;
  }

  
}
