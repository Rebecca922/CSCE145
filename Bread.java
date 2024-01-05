/*
 * Jiarong Xu
 */
//define
public class Bread {
	// instance variables
	private String name;
	private int calories;
	private breadType type;
	//Constructor
	public Bread()
	{
		this.name = "none";
		this.calories = 50;
		this.type = breadType.WholeGrain;
	}
	//parameterized
	public Bread(String aN, int aC, String aT)
	{
	this.setName(aN);
	this.setCalories(aC);
	this.setType(aT);
	}
	//accessors
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public breadType getType()
	{
		return this.type;
	}
	//mutator
	public void setName(String aN)
	{
		if (aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC>=50 && aC<=250)
			this.calories =aC;
		else
			this.calories = 50;
	}
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Honey Wheat"))
				this.type = breadType.HoneyWheat;
		else if(aT.equalsIgnoreCase("White"))
				this.type = breadType.White;
		else if(aT.equalsIgnoreCase("Whole Grain"))
			this.type = breadType.WholeGrain;
		else if(aT.equalsIgnoreCase("Whole Wheat"))
			this.type = breadType.WholeWheat;
		else
			this.type = breadType.WholeGrain;
	}
	//other methods
	public boolean equals(Bread a)
	{
		return a != null &&
				this.getName().equalsIgnoreCase(a.getName()) &&
				this.getCalories() == a.getCalories() &&
				this.getType() == a.getType();				
	}
	public String print(breadType aT)
	{
		if(aT == breadType.HoneyWheat)
			return "Honey Wheat";
		else if(aT == breadType.White)
			return "White";
		else if(aT == breadType.WholeWheat)
			return "Whole Wheat";
		else 
			return "Whole Grain";
	}
	public String toString()
	{
		return "Bread\nName: "+this.name+"\nCalories: "+this.calories+"\nType: "+print(this.type);
	}
	
	
}
