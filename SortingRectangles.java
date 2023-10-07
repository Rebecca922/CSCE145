/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class SortingRectangles {

	public static void main(String[] args) {
		// get size
		System.out.println("Welcome. How many rectangles you want to put in?");
		Scanner keyboard = new Scanner(System.in);
		int s = keyboard.nextInt();
		while(s<0)
		{
			System.out.println("Invalid input! Please put a positive whole number:");
			int s2 = keyboard.nextInt();
			s = s2;
		}

		//keyboard.next();
		double [][] rarray =new double [s][2];
		
		//create rectangles array
		for(int i=0; i<s; i++)
		{
			System.out.println("What is the length of the No."+(i+1)+" rectangle?");
			rarray[i][0] = keyboard.nextDouble();
			
			//keyboard.next();
			System.out.println("What is the width of the No."+(i+1)+" rectangle?");
			rarray[i][1] = keyboard.nextDouble();
			//keyboard.next();	
				}
		
		//create areas array
		double [] aarray = new double[s];
		for(int i=0; i<s; i++)
		{
			aarray[i] = rarray[i][0] * rarray[i][1];
		}
		
		//ask the sort way
		System.out.println("Which way do you want to sort the array? Please enter ascending or descending.");
		String order = keyboard.next();
		if(s==0)
		{
			System.out.println("The program cannot sort an empty array.");
		}
		
		
		// sort the areas array from smallest to largest
		else if(order.equalsIgnoreCase("ascending"))
		{
		for(int i=0; i<s; i++)
		{
			int smallest = i;
			for(int j=i+1; j<s; j++)
			{
				if(aarray[j]<aarray[smallest])
				{
					smallest = j;
				}
			}//why
				if (smallest != i)
				{
					//swap
					double temp = aarray[i];
					aarray[i] = aarray[smallest];
					aarray[smallest] = temp;
	
				}
			//if(aarray[j]< aarray[i])
		//	{
		//		double temp = aarray[i];
		//		aarray[i] = aarray[j];
		//		aarray[j] = temp;
		//	}
			}
		//display area array
		System.out.println("The area array display from biggest to smallest: ");
		for(int i=0; i<s; i++)
		{
			System.out.println(aarray[i]);
		}
		
		}
		
		// sort the areas array from largest to smallest 
		//Bubble sort
		else if(order.equalsIgnoreCase("descending"))
		{
			boolean b = true;
			while(b)
			{
				b = false;
				for(int i=0; i<s-1; i++)
			{	
				if(aarray[i]< aarray[i+1])
			{
				//swap
				double temp = aarray[i];
				aarray[i] = aarray[i+1];
				aarray[i+1] = temp;
				b = true;
			
			}
			}
			} 
		
		//selection sort largest-smallest
//				for(int i=0; i<s; i++)
//				{
//					int largest = i;
//					for(int j=i+1; j<s; j++)
//					{
//						if(aarray[j]>aarray[largest])
//						{
//							largest = j;
//						}
//					}
//						if (largest != i)
//						{
							//swap
//							double temp = aarray[i];
//							aarray[i] = aarray[largest];
//							aarray[largest] = temp;
//			
//						}
				
//					}
			//display area array
			System.out.println("The area array display from biggest to smallest: ");
			for(int i=0; i<s; i++)
			{
				System.out.println(aarray[i]);
			}
				
		}

			System.out.println("Do you wan to get the average area of the collection? "
					+ "\nPlease enter true of false.");
			boolean answer1 = keyboard.nextBoolean();
			//keyboard.next();
			if(s==0)
			{
				System.out.println("The program cannot get an average of an empty array.");
			}
			else if(answer1)
			{
			// get the rectangles' areas' sum
			double sum = 0;
			for(int i=0; i<s; i++)
			{
				sum += aarray[i];
			}
			//get the average
			double aarea = sum/s;
			System.out.println("The average area of the rectangles is "+aarea+".");
			}
			
			
			//get the minimum
			System.out.println("Do you wan to get the minimum area of the collection? "
					+ "\nPlease enter true of false.");
			boolean answer2 = keyboard.nextBoolean();
			//keyboard.next();
			if(s==0)
			{
				System.out.println("The program cannot find the minimum in an empty collection.");
			}
			else if(answer2)
			{
				double min = aarray[0];
				for(int i=1; i<aarray.length; i++)
				{
				if(aarray[i]<min)
				{
				min = aarray[i];
				}
				}
				System.out.println("The minimum area in this collection is "+min+".");
				}
			
			//get the maximum
			System.out.println("Do you wan to get the maximum area of the collection? "
					+ "\nPlease enter true of false.");
			boolean answer3 = keyboard.nextBoolean();
			//keyboard.next();
			if(s==0)
			{
				System.out.println("The program cannot find the maximum in an empty collection.");
			}
			else if(answer3)
			{
			double max = aarray[0];
			for(int i=1; i<aarray.length; i++)
			{
				if(aarray[i]> max)
						{
							max = aarray[i];
						}
			}
			System.out.println("The maximum area in this collection is "+max+".");//***		
			}

			System.exit(0);
		
		
		
		
		
		
		}

		
		

	
}
