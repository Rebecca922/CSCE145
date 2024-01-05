/*
 * Jiarong Xu
 */
public class Vehicle {
// instance variables
	private String manufacturerName;
	private int cylinderNumber;
	private String ownerName;
	// construtors
	public Vehicle()
	{
		this.manufacturerName = "none";
		this.cylinderNumber = 6;
		this.ownerName = "none";
	}
	// parametized
	public Vehicle(String aMN, int aCN, String aON)
	{
		this.setManufacturerName(aMN);
		this.setCylinderNumber(aCN);
		this.setOwnerName(aON);
	}
	// getter & setter
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		if(manufacturerName != null)
			this.manufacturerName = manufacturerName;
		else
			this.manufacturerName = "none";
	}
	public int getCylinderNumber() {
		return cylinderNumber;
	}
	public void setCylinderNumber(int cylinderNumber) {
		if(cylinderNumber > 0)
			this.cylinderNumber = cylinderNumber;
		else
			this.cylinderNumber = 6;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		if(ownerName != null) 
			this.ownerName = ownerName;
		else
			this.ownerName = "none";
	}
	// other methods
	public boolean equals(Vehicle a)
	{
		return a != null &&
				this.getManufacturerName().equalsIgnoreCase(a.getManufacturerName()) &&
				this.getCylinderNumber() == a.getCylinderNumber() &&
				this.getOwnerName().equalsIgnoreCase(a.getOwnerName());
	}
	public String toString()
	{
		return "Manufacturer’s Name: "+this.manufacturerName+"\nNumber of Cylinders: " +this.cylinderNumber+"\nOwner’s Name: "+this.ownerName+"\n";
	}
}
