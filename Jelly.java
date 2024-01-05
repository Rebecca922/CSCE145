/*
 * Jiarong Xu
 */
//define
public class Jelly {
	//instance variables
	private String name;
	private int calories;
	private FruitType type;
	//constructor
	public Jelly()
	{
		this.name = "none";
		this.calories = 50;
		this.type = FruitType.Grape;
	}
	//para
	public Jelly(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);
	}
	// accessor
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public FruitType getType()
	{
		return this.type;
	}
	// mutator
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC>=50 && aC<=200)
			this.calories = aC;
		else
			this.calories = 50;
	}
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Apple"))
			this.type = FruitType.Apple;
	else if(aT.equalsIgnoreCase("Blackberry"))
			this.type = FruitType.Blackberry;
	else if(aT.equalsIgnoreCase("Tomato"))
		this.type = FruitType.Tomato;
	else if(aT.equalsIgnoreCase("Blueberry"))
		this.type = FruitType.Blueberry;
	else
		this.type = FruitType.Grape;
	}
	
	// other method
	public boolean equals(Jelly a)
	{
		return a != null &&
				this.getName().equalsIgnoreCase(a.getName())&&
				this.getCalories() == a.getCalories() &&
				this.getType() == a.getType();
				}
	
	public String print(FruitType aT)
	{
		if(aT == FruitType.Apple)
			return "Apple";
		else if(aT == FruitType.Blackberry)
			return "Black Berry";
		else if(aT == FruitType.Blueberry)
			return "Blue Berry";
		else if(aT == FruitType.Tomato)
			return "Tomato";
		else 
			return "Grape";
	}
	
	public String toString()
	{
		return "Jelly\nName: "+this.name+"\nCalories: "+this.calories+"\nFruit Type: "+print(this.getType());
	}
}
