/*
 * Jiarong Xu
 */
public class Dresser {
	//instance variables
	private Clothing [][] clothes;
	public static final int DRAWER = 5;
	public static final int ITEMS = 10;
	
	//init
	public Dresser()
	{
		init();
	}
	

	public void init()
	{
		clothes = new Clothing[DRAWER][ITEMS];
	}
	

	//other methods
// get drawer number
	public int getDrawer(Clothing aC)
	{
	 if (aC.getType() == ClothType.Undergarment)
		 return 0;
	 else if(aC.getType() == ClothType.Socks || aC.getType() == ClothType.Stockings)
		 return 1;
	 else if(aC.getType() == ClothType.Top)
		 return 2;
	 else if(aC.getType() == ClothType.Bottom)
		 return 3;
	 else
		 return 4;

	}
	 public void addClothing(Clothing aC)
	 {
		 //System.out.println("a");
		 //check aC is null or not
		 if(aC == null)
			 return;
		/* int d;//check which drawer it is in
		 if (aC.getType() == ClothType.Undergarment)
			 d = 0;
		 else if(aC.getType() == ClothType.Socks || aC.getType() == ClothType.Stockings)
			 d = 1;
		 else if(aC.getType() == ClothType.Top)
			 d = 2;
		 else if(aC.getType() == ClothType.Bottom)
			 d = 3;
		 else
			 d = 4;*/
		 // check whether the drawer is full or not
		 if (clothes[getDrawer(aC)][ITEMS-1] != null)
				return;
		 // fill in the drawer
		 for(int i=0; i<clothes[getDrawer(aC)].length-1; i++)
		 {
			 if(clothes[getDrawer(aC)][i] == null)
					 {
				 clothes[getDrawer(aC)][i] = aC;
				 //System.out.println("a");
				 this.sortDresser();
				 break;
					 }
		 }

		 //System.out.println("a");
				 }
	 
	 public void removeClothing(Clothing aC)
	 { 
		 //check aC is null or not
	 if(aC == null)
		 return;
	 for(int i=0; i<clothes[getDrawer(aC)].length-1; i++)
	 {
		 if(clothes[getDrawer(aC)][i].equals(aC))
				 {
			 clothes[getDrawer(aC)][i] = null;
			 this.sortDresser();
			 return;
				 }
	 }
	 System.out.println("Can't find the cloth");
	 }
	 
	 /*
	 public void print()
	 {
		 for(int j=0; j<clothes.length-1; j++)
		 {
		 System.out.println("Drawer "+j);
		 for(int i=0; i<clothes[j].length-1; i++)
		 {
			 if(clothes[j][i] != null)
			 { 
				 System.out.println(clothes[j][i].toString());
			 System.out.println("1");
			 }
		 }
		 System.out.println();
		 }
	 }
	 */
	 public void print() {
		    for (int j = 0; j < clothes.length; j++) {
		        System.out.println("Drawer " + j);
		        for (int i = 0; i < clothes[j].length; i++) {
		            if (clothes[j][i] != null) {
		                System.out.println(clothes[j][i].toString());
		              //  System.out.println("1");
		            }
		        }
		        System.out.println();
		    }
		}

	 public void sortDresser()
	 {
		 boolean swapped = true;
		 while(swapped)
		 {
			 swapped = false;
			 for(int j=0; j<clothes.length-1;j++)
			 {
				 for(int i=0; i<clothes[j].length-1;i++)
				 {
					 if(clothes[j][i] == null || clothes[j][i+1] == null)
						 break;
					 if(clothes[j][i] == null && clothes[j][i+1] != null)
					 {
						 Clothing temp = clothes[j][i];
						 clothes[j][i] = clothes[j][i+1];
						 clothes[j][i+1] = temp;
						 swapped = true;
					 }
				 }
			 }
		 }
	 }
	 /*
	 public void print()
	 {
		 for(Clothing[] cloth : clothes)
		 { if(cloth == null)
			 break;
		 System.out.println(cloth.toString());
		 }
	 }*/
	 
}
