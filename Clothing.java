/*
 * Jiarong Xu
 */
public class Clothing {
	//instance variables
	private ClothType type;
	private ColorType color;
	//Constructor
	public Clothing()
	{
		this.type = ClothType.Socks;
		this.color = ColorType.Black;
	}
	//parametized
	public Clothing(String aT, String aC)
	{
		this.setType(aT);
		this.setColor(aC);
	}
	//getter and setter 
	public ClothType getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equalsIgnoreCase("Undergarment"))
			this.type = ClothType.Undergarment;
		else if(type.equalsIgnoreCase("Strockings"))
			this.type = ClothType.Stockings;
		else if(type.equalsIgnoreCase("Top"))
			this.type = ClothType.Top;
		else if(type.equalsIgnoreCase("Bottom"))
			this.type = ClothType.Bottom;
		else if(type.equalsIgnoreCase("Cape"))
			this.type = ClothType.Cape;
		else
			this.type = ClothType.Socks;
	}
	public ColorType getColor() {
		return color;
	}
	public void setColor(String color) {
		if(color.equalsIgnoreCase("Brown"))
			this.color = ColorType.Brown;
		else if(color.equalsIgnoreCase("Red"))
			this.color = ColorType.Red;
		else if(color.equalsIgnoreCase("Pink"))
			this.color = ColorType.Pink;
		else if(color.equalsIgnoreCase("White"))
			this.color = ColorType.White;
		else if(color.equalsIgnoreCase("Orange"))
			this.color = ColorType.Orange;
		else if(color.equalsIgnoreCase("Green"))
			this.color = ColorType.Green;
		else if(color.equalsIgnoreCase("Blue"))
			this.color = ColorType.Blue;
		else if(color.equalsIgnoreCase("Purple"))
			this.color = ColorType.Purple;
		else if(color.equalsIgnoreCase("Grey"))
			this.color = ColorType.Grey;
		else 
			this.color = ColorType.Black;

}
	//other methods
	public String toString()
	{
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	
	public boolean equals(Clothing a)
	{
		return a != null &&
				this.getType() == a.getType() &&
				this.getColor() == a.getColor();
	}
	
}
