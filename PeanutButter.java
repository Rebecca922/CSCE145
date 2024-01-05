/*
 * Jiarong Xu
 */
//define
public class PeanutButter {
//instance variables
	private String name;
	private int Calories;
	private boolean isCrunchy;
	//Constructor
	public PeanutButter()
	{
		this.name = "none";
		this.Calories = 100;
		this.isCrunchy = false;
			}
	// parameterized
	public PeanutButter(String aN, int aC, boolean aIC)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setIC(aIC);
	}
	//getter
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.Calories;
	}
	public boolean getIsCrunchy()
	{
		return this.isCrunchy;
	}
	//setter
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC >= 100 && aC <= 300)
			this.Calories = aC;
		else
			this.Calories = 100;
	}
	public void setIC(boolean aIC)
	{
		if(aIC)
			this.isCrunchy = true;
		else
			this.isCrunchy= false;
	}
	// other methods
	public boolean equals(PeanutButter a)
	{
		return a != null &&
				this.getName().equalsIgnoreCase(a.getName()) &&
				this.getCalories() == a.getCalories() &&
				this.getIsCrunchy() == a.getIsCrunchy();
	}
	public String toString()
	{
		return "Peanut Butter\nName: "+this.name+"\nCalories: "+this.Calories+"\nIs Crunchy: "+this.isCrunchy;
		
	}
	
}
