/*
 * Jiarong Xu
 */
public class Wheel {
//instance variables
	private double diameter;
	private double width;
	
	//default constructors
	public Wheel()
	{
	this.diameter = 16.0;
	this.width = 1.0;
}
	//parameterized
	public Wheel(double aD, double aW) 
	{
		this.setDiameter(aD);
		this.setWidth(aW);
	}
	//getter
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getWidth()
	{
		return this.width;
	}
	//setter
	public void setDiameter(double aD)
	{
		if (aD >=16 && aD <= 55)
				this.diameter = aD;
		else
			this.diameter = 16;
	}
	public void setWidth(double aW)
	{
		if (aW >= 1 && aW <= 2.5)
			this.width = aW;
		else
			this.width = 1;
	}
	
	// more methods
	public boolean equals(Wheel a)
	{
		return a != null &&
				a.getDiameter() == this.diameter &&
				a.getWidth() == this.width;
	}
	public String toString()
	{
		return "[Wheel] Diameter "+this.diameter+" Width: "+this.width;
	}
	
}
