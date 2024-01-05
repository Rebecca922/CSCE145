/*
 * Jiarong Xu
 */
public class Frame {
//instance Variables
	private double size;
	private FrameType type;
	//default constructor
	public Frame()
	{
		this.size = 18.5;
		this.type = FrameType.Diamond;
	}
	//Parameterized
	public Frame(double aS, String aT)
	{
		this.setSize(aS);
		this.setType(aT);
	}
	//getter
	public double getSize()
	{
		return this.size;
	}
	public FrameType getType()
	{
		return this.type;
	}
	//setter
	public void setSize(double aS)
	{
		if(aS >= 18.5 && aS <= 60)
			this.size = aS;
		else
			this.size = 18.5;
	}
	/*
	public FrameType type(String aS)
	{
		if(aS.equalsIgnoreCase("Diamond")) 
			return FrameType.Diamond;
	else if(aS.equalsIgnoreCase("Step-Through")) 
		return FrameType.Step_Through;
	else if(aS.equalsIgnoreCase("Truss")) 
		return FrameType.Truss;
	else if(aS.equalsIgnoreCase("Penny-Farthing")) 
		return FrameType.Penny_Farthing;
	else
		return FrameType.Diamond;
	}
	
	public void setType(String aS)
	{
		FrameType aT = type(aS);
		if(aT == FrameType.Diamond)
			this.type = FrameType.Diamond;
		else if(aT == FrameType.Step_Through) 
			this.type = FrameType.Step_Through;
		else if(aT == FrameType.Truss)
			this.type = FrameType.Truss;
		else if(aT == FrameType.Penny_Farthing)
			this.type = FrameType.Penny_Farthing;
		else
			this.type = FrameType.Diamond;
	}
	*/
	
	public void setType(String aT)
	{
		if(aT.equalsIgnoreCase("Diamond")) 
				this.type = FrameType.Diamond;
		else if(aT.equalsIgnoreCase("Step-Through")) 
			this.type = FrameType.Step_Through;
		else if(aT.equalsIgnoreCase("Truss")) 
			this.type = FrameType.Truss;
		else if(aT.equalsIgnoreCase("Penny-Farthing")) 
			this.type = FrameType.Penny_Farthing;
		else
			this.type = FrameType.Diamond;
	}
	
	//other methods
	public boolean equals(Frame a)
	{
		return a != null &&
				this.size == a.getSize() &&
				this.type == a.getType();
	}
	public String toString() {
	return "[Frame] Size: "+this.size+" Type: "+this.type;
	
}}
