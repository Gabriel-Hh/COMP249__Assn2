/**
 * 
 */
package five;

import four.UAV;

//
//Part: 1
//Written by: Gabriel Horth, 40186942
//

/**MAV extends UAV.
 * @author Gabriel Horth
 * @version 1.1
 */
public class MAV extends UAV {
  
  /**
   * Model name.
   */
  protected String model;
  /**
   * Footprint in square centimeters.
   */
  protected double size; //in square centimeters
  
  
  //********************************** Constructors ****************************************************//
  
  /**
   * Default Constructor for MAV.
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
	if(size>300) {System.out.println("MAV size too large, has been set to 300");
	size = 300;
	}
	this.size = size;
  }

  /**Copy Constructor for MAV.
   * @param toCopy MAV to copy
   */
  public MAV(MAV toCopy) {
	super(toCopy);
	model = toCopy.model;
	size = toCopy.size;
  }

  //********************************* Getters and Setter ************************************************//
  
  /**Getter for model.
   * @return model
   */
  public String getModel() {
    return model;
  }

  /**Setter for model.
   * @param model the model to set
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**Getter for size.
   * @return size
   */
  public double getSize() {
    return size;
  }

  /**Setter for size.
   * @param size the size to set
   */
  public void setSize(double size) {
	if(size>300) {System.out.println("MAV size too large, has been set to 300");
	size = 300;
	}
	this.size = size;
  }

  //********************************** Overrides ********************************************************//
  
  /**
   * toString() method for MAV.
   */
  @Override
  public String toString() {
	return super.toString()
		+ "\nIt's model is " + model + ", with a size of " + size + " square centimeters.";
  }

  /**
   * equals() method for MAV.
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
	MAV other = (MAV) obj;
	return model == other.model && size == other.size;
  }

  
  
}
