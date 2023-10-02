/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class ABelowAverageWinter {

	public static void main(String[] args) {
		double [] array = new double[10]; //create temperature array
		System.out.println("Welcome to the below average temperature tester program.");
		// get the number for the array
		for(int i1=0; i1<10; i1++)
		{
			int d1 = i1+1;
			System.out.println("Please enter the temperature for day "+d1);
			Scanner keyboard = new Scanner(System.in);
			array[i1]= keyboard.nextDouble();
			//keyboard.next();
		}
		// get the sum
		double sum = 0;
		for(int i2=0; i2<10; i2++)
		{
			sum += array[i2];
		}
		//get the average
		double a = sum/10;
		System.out.println("The average temperature was "+a+
				"\nThe days that were below average were");
		//get the one that's under average
		for(int i3=0; i3<10; i3++)
		{
			if(array[i3]< a)
			{
				int d2 = i3+1;
				System.out.println("Day "+d2+" with "+array[i3]);// print results
			}
		}
		
		

	}

}
