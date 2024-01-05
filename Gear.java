package lB;

public class Gear {
	private double diameter;
	private int cogs;
	public Gear()
	{
		this.diameter = 1.0;
		this.cogs = 2;
	}
	public Gear(double aD, int aC)//error1: didn't use setter to check
	{
		this.diameter = aD;
		this.cogs = aC;
	}
	public double getDiameter()
	{
		return diameter;//error 2 this.
	}
	public void setDiameter(double aD)
	{
		if(aD > 0.0)
		{
			this.diameter = aD;
		}
		else
		{
			this.diameter = 1.0;
		}
	}
	public int getCogs()
	{
		return cogs;//error 3 this.
	}
	public void setCogs(int aC)
	{
		if(aC >=2)
		{
			this.cogs = aC;
		}
		else
		{
			this.cogs = 2;
		}
	}
		public String toString()
		{
			return "[Gear] Diameter: "+this.diameter+" Cogs: "+this.cogs;
		}
		public boolean equals(Gear aG)
		{
			return aG != null &&
					this.diameter == aG.getDiameter() &&
					this.cogs == aG.getCogs();
		}
	}

public class Machine
{
private String name;
private Gear bigGear;
private Gear mediumGear;
private Gear smallGear;

public Machine()
{
this.name = "none";
this.bigGear = new Gear(16.0,32);
this.mediumGear = new Gear(8.0,16);
this.smallGear = new Gear(4.0,8);
}
public Machine(String aN, Gear bG, Gear mG, Gear sG)
{
if(aN==null || bG == null || mG == null || sG == null)
{
this.name = "none";
this.bigGear = new Gear(16.0,32);
this.mediumGear = new Gear(8.0,16);
this.smallGear = new Gear(4.0,8);
}
else
{
this.name = aN;
this.bigGear = bG;
this.mediumGear = mG;
this.smallGear = sG;
}
}
public String getname()
{
return this.name;
}
public void setName(String aN)
{
if(aN != null)
{
this.name = aN;
}
else
{
this.name = "none";
}
}
public String toString()
{
return "[Machine] Name: "+this.name+"\n"+bigGear+"\n"+mediumGear+"\n"+smallGear+"\n";
}
public static Machine copyAndRenameMachine(String aN, Machine aM)
{
if(aM == null)
return null;
Machine ret = aM;
ret.setname(aN);
return ret;
}
}

//8. 
Machine m = new Machine();
System.out.println(m);
//reference?? or default

//9.
Gear g1, g2, g3;
g1 =g2 =g3 = new Gear();
g1.setDiameter(32);
g1.setCogs(64);
g2.setDiameter(32);
g2.setCogs(64);
g3.setDiameter(32);
g3.setCogs(64);
Machine m = new Machine("Machine02", g1, g2, g3);
System.out.println(m);
// reference? 

//10
Machine m1 = new Machine();
m1.setName("Machine01");
Machine m2 = Machine.copyAndRenameMachine("Machine02",m1);
System.out.println(m1);
System.out.println(m2);
// reference? or just different value

