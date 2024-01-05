/*
 * Jiarong Xu
 */

public class PBJSandwich {
	// instance variable
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	//constructor
	public PBJSandwich()
	{
		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	//para
	public PBJSandwich(Bread aB, PeanutButter aP, Jelly aJ, Bread bB)
	{
		this.setTopSlice(aB);
		this.setPeanutButter(aP);
		this.setJelly(aJ);
		this.setBottomSlice(bB);
	}
	//getter
	public Bread getTopSlice()
	{
		return this.topSlice;
	}
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	public Jelly getJelly()
	{
		return this.jelly;
	}
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	//setter
	public void setTopSlice(Bread aB)
	{
		if(aB != null)
			this.topSlice = aB;
	/*	else 
			this.topSlice = new Bread();*/
	}
	public void setPeanutButter(PeanutButter aP)
	{
		if(aP != null)
			this.peanutButter = aP;
		
	}
	public void setJelly(Jelly aJ)
	{
		if(aJ != null)
			this.jelly = aJ;
	}
	public void setBottomSlice(Bread aB)
	{
		if(aB != null)
			this.bottomSlice = aB;
	}
	// other methods
	public boolean equals(PBJSandwich a)
	{
		return a != null &&
				this.getTopSlice().equals(a.getTopSlice())&&
				this.getPeanutButter().equals(a.getPeanutButter())&&
				this.getJelly().equals(a.getJelly())&&
				this.getBottomSlice().equals(a.getBottomSlice());
	}
	public String toString()
	{
		return "PBJ Sandwich\nTop Slice: \n"+this.getTopSlice().toString()+"\nPeanut Butter: \n"+this.getPeanutButter().toString()+"\nJelly: \n"+this.getJelly().toString()+"\nBottom Slice: \n"+this.getBottomSlice().toString();
	}

}
