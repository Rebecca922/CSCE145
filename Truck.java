/*
 * Jiarong Xu
 */
public class Truck extends Vehicle{
// instance variables
	private double loadCapacity;
	private double towingCapacity;
	// constructor
	public Truck()
	{
		super();
		this.loadCapacity = 1.0;
		this.towingCapacity = 1.0;
}
	//parameterized
	public Truck(String aMN, int aCN, String aON, double aLC, double aTC)
	{
		super(aMN,aCN,aON);
		this.setLoadCapacity(aLC);
		this.setTowingCapacity(aTC);
		}
	//getter and setter
	public double getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(double loadCapacity) {
		if(loadCapacity >= 0.0)
			this.loadCapacity = loadCapacity;
		else
			this.loadCapacity = 1.0;
	}
	public double getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(double towingCapacity) {
		if(towingCapacity >=0.0)
			this.towingCapacity = towingCapacity;
		else
			this.towingCapacity = 1.0;
	}
	//other methods
	public boolean equals(Truck a)
	{
		return a != null &&
				super.equals(a) &&
				this.getLoadCapacity() == a.getLoadCapacity() &&
				this.getTowingCapacity() == a.getTowingCapacity();
	}
	public String toString()
	{
		return super.toString()+"Towing Capacity: "+this.getTowingCapacity()+"\nLoad Capacity: "+this.getLoadCapacity()+"\n";
	}
	
}
