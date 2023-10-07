/*
 * Jiarong Xu
 */
package src;
import java.util.Scanner;
public class matrixAddition {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//greeting+ get the first matrix
		System.out.println("Welcome to the matrix adder program!"
				+ "\nPlease enter the length and width of the first matrix");
		//get the length and width
		int l1 = keyboard.nextInt();
		//keyboard.next();
		int w1 = keyboard.nextInt();
		//keyboard.next();
		int[][] array1 = new int[l1][w1];
		for(int i=0; i<l1; i++)
			{
			for(int j=0; j<w1; j++)
				{
				System.out.println("Enter value at index "+i+" "+j);
				array1[i][j] = keyboard.nextInt();
				//keyboard.next();
				}
			}

		//get the second matrix
		System.out.println("Please enter the length and width of the second matrix");
				//get the length and width
		int l2 = keyboard.nextInt();
		//keyboard.next();
		int w2 = keyboard.nextInt();
		//keyboard.next();
		int[][] array2 = new int[l2][w2];

		for(int i=0; i<l2; i++)
			{
			for(int j=0; j<w2; j++)
			{
				System.out.println("Enter value at index"+i+" "+j);
					array2[i][j] = keyboard.nextInt();
					//keyboard.next();
		}
			}
		//check same size or not
		if(l2 == l1 && w2 == w1)
		{
			// get result
			int [][] array3 = new int [l1][w1];
			
			for(int i=0; i<l1; i++)
			{
			for(int j=0; j<w1; j++)
				{
				array3[i][j] = array1[i][j]+ array2[i][j];
				}
			}
			
			//print first matrix
			for(int i=0; i<l1; i++)
			{
			for(int j=0; j<w1; j++)
				{
				System.out.print(array1[i][j]+" ");
				}
			System.out.println();
			}
			
			System.out.println("+");
			
			//print second matrix
			for(int i=0; i<l1; i++)
			{
			for(int j=0; j<w1; j++)
				{
				System.out.print(array2[i][j]+" ");
				}
			System.out.println();
			}
			System.out.println("=");
			
			//print result
			for(int i=0; i<l1; i++)
			{
			for(int j=0; j<w1; j++)
				{
				System.out.print(array3[i][j]+" ");
				}
			System.out.println();
			}
		}
		
		else
		{
			System.out.println("Invalid Dimensions. These cannot be added.");
			System.exit(0);		
			}
		
		}
		

	}


