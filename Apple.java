/*
 * Jiarong Xu
 */
//define class	+ create instance variables
public class Apple {
	private AppleType type;
	private double weight;
	private double price;
	
// set up default-constructors
	public Apple()
	{
		this.type = AppleType.Gala;
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	//parameterized consructor
	public Apple(String aT, double aW, double aP)
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	// accessors
	public AppleType getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	//mutators
	// check the type is valid or not
	
	public AppleType type(String aT)
	{
		if(aT != null &&
				aT.equalsIgnoreCase("RedDelicious") || aT.equalsIgnoreCase("GoldenDelicious")
				|| aT.equalsIgnoreCase("Gala") || aT.equalsIgnoreCase("GrannySmith") )
		{
			return AppleType.valueOf(aT);
		}
		else
			return  AppleType.Gala;
		
	}
	/*
	public boolean isValid(String aT)
	{
		return aT != null &&
				aT.equalsIgnoreCase("Red Delicious") || aT.equalsIgnoreCase("Golden Delicious")
				|| aT.equalsIgnoreCase("Gala") || aT.equalsIgnoreCase("Granny Smith") ;
				
	}
	*/
	
	//set up type
	public void setType(String aT)
	{
		this.type = type(aT);
		
		/*
		if(isValid(aT))
			this.type = AppleType.aT;
		else
			this.type = AppleType.Gala;
			*/
		
		/*
		String [] type = new String [4];
		type[0] = "Red Delicious";
		type[1] = "Golden Delicious";
		type[2] = "Gala";
		type[3] = "Granny Smith";
		
		if(
				for(int i=0; i<4; i++)
					type[i] == aT;)
					//can't put for loop in if statement

	if(aT.equalsIgnoreCase("Red Delicious") || aT.equalsIgnoreCase("Golden Delicious")
				|| aT.equalsIgnoreCase("Gala") || aT.equalsIgnoreCase("Granny Smith") )
			this.type = aT;
		else
			this.type = "Gala";
		this.type = aT;
		*/
	}
	
	public void setWeight(double aW)
	{
		if(aW>=0 && aW<=2)
			this.weight = aW;
		else
			this.weight = 0.0;
	}
	
	public void setPrice(double aP)
	{
		if(aP>=0)
			this.price = aP;
		else
			this.price = 0.0;
	}
	
	//other methods
	public String toString()
	{
		return "Type: " + this.type+" Weight "+this.weight+" Price "+this.price+" ";
	}
	
	public boolean equals(Apple b)// this.equals(b) to compare this and b
	{
		/*
		if(this.type == b.type)
		{
			if(this.weight == b.weight)
			{
				if(this.price == b.price)
					{
					return true;
					}
				else
					return false;
			}
			else 
				return false;
		}
		else
			return false;
			*/
		return (b!= null) &&
			 this.type == b.type &&
			 this.weight == b.weight &&
			 this.price == b.price;
			
	}
		
					
						
	}
	

