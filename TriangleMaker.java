/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		//greetings & get the size number
		System.out.println("Welcome to Triangle Maker! Enter the size of the triangle. Please only enter number.");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		keyboard.nextLine();
		// start drawing when the number is correct
		if (n > 0)
		{
		 for(int i1 = 1; i1 <= n; i1++)
		 {
			 for(int j1=1; j1 <= i1; j1++)//draw * for each line
			 {
				 System.out.print("*");
			 }
		 	 System.out.println();//keep draw lines until reach the line n
		 }
		 // drawing the * in the reverse way
		 for(int i2 = n-1; i2>0; i2--)
		 {
			 for(int j2= i2; j2>0; j2--)
			 {
				 System.out.print("*");
			 }
		 	 System.out.println();
		 	
		 }
		
		}
		else 
			System.exit(0);//end the program when number is wrong
			
	}

}
