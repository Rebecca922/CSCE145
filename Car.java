/*
 * Jiarong Xu
 */
public class Car extends Vehicle{
	//instance variable
	private double gasMileage;
	private int numberOfPassenger;
	//constructor
	public Car()
	{
		super();
		this.gasMileage = 1.0;
		this.numberOfPassenger = 1;
	}
	//para
	public Car(String aMN, int aCN, String aON, double aGM, int aNOP)
	{
		super(aMN, aCN, aON);
		this.setGasMileage(aGM);
		this.setNumberOfPassenger(aNOP);
	}
	//getter and setter
	public double getGasMileage() {
		return gasMileage;
	}
	public void setGasMileage(double gasMileage) {
		if(gasMileage >= 0.0)
			this.gasMileage = gasMileage;
		else
			this.gasMileage = 1.0;
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		if(numberOfPassenger >= 0)
			this.numberOfPassenger = numberOfPassenger;
		else
			this.numberOfPassenger = 1;
	}
	// other methods
	public boolean equals(Car a)
	{
		return a != null &&
				super.equals(a) &&
				this.getGasMileage() == a.getGasMileage() &&
				this.getNumberOfPassenger() == a.getNumberOfPassenger();
	}
	public String toString()
	{
		return super.toString()+"Gas Mileage: "+this.getGasMileage()
				+ "\nNumber of Passengers: "+this.getNumberOfPassenger()+"\n";
	}
	
}
