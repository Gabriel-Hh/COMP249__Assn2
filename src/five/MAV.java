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
  private String model;
  /**
   * Footprint in square centimeters.
   */
  private double size; //in square centimeters
  
  
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
	if(size>300) {System.out.println("MAV size too large, has been set to 300");}
	size = 300;
	this.size = size;
  }

  /**Copy Constructor for MAV.
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
   * ToString() method for MAV.
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
