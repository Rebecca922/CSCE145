/*
 * Jiarong Xu
 */
public class Bicycle {
//instance variables
	private String make;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Frame frame;
	//default constructor
	public Bicycle() 
	{
		this.make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.frame = new Frame();
	}
	
	//parameterized
	public Bicycle(String aM, Wheel fW, Wheel bW, Frame aF)
	{
		this.setMake(aM);
		this.setFrontWheel(fW);
		this.setBackWheel(bW);
		this.setFrame(aF);
	}
	
	//getter
	public String getMake()
	{
		return this.make;
	}
	public Wheel getFrontWheel()
	{
		return this.frontWheel;
	}
	public Wheel getBackWheel()
	{
		return this.backWheel;
	}
	public Frame getFrame()
	{
		return this.frame;
	}
	
	//setter
	public void setMake(String aN)
	{
		if(aN != null)
			this.make = aN;
		else
			this.make = "none";
	}
	public void setFrontWheel(Wheel aW)
	{
		this.frontWheel = aW;
	}
	
	public void setBackWheel(Wheel aW)
	{
		this.backWheel = aW;
	}
	
	// set class-be detailed
	public void setFrame(Frame aF)
	{
		this.frame = new Frame();
		this.frame.setSize(aF.getSize());
		//frame.setType(aF.getType());
		 if(aF.getType() == FrameType.Diamond)
		 
			this.frame.setType("Diamond");
		else if(aF.getType() == FrameType.Step_Through) 
			this.frame.setType("Step-Through");
		else if(aF.getType() == FrameType.Truss) 
			this.frame.setType("Truss");
		else if(aF.getType() == FrameType.Penny_Farthing) 
			this.frame.setType("Penny-Farthing");

	}
	
	// other methods
	public boolean equals(Bicycle a)
	{
		return a != null &&
				this.make.equalsIgnoreCase(a.make)&&
				this.frontWheel.equals(a.getFrontWheel())&&
				this.backWheel.equals(a.getBackWheel())&&
				this.frame.equals(a.getFrame());
	}
	public String toString()
	{
		return "[Bicycle] Make: "+this.getMake()+" Front Wheel: "+this.getFrontWheel().toString()+" "
				+ "\nBack Wheel: "+this.getBackWheel().toString()+" Frame: "+this.getFrame().toString();
	}
}