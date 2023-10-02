/*
 * Jiarong Xu
 */
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random random = new Random();
		//Greetings+introduce the rule to the user+set up default point value
		Boolean b = null;
		do {
		System.out.println("Welcome to the Rock Paper Scissors game! ");
			System.out.println("You will have an opponent with the computer in best 2 out of 3 rounds."
				+ "\nPlease put your first choice: Notes: Only put rock, paper or scissors."
				+ "\nEverthing else will be consider as the computer wins.");
		int up = 0;
		int cp = 0;
		Scanner keyboard = new Scanner(System.in);
		//create a loop which run three time
		for(int t=1; t<=3; t++)
		{
		// get the first round info
		String u1 = keyboard.next();
		
		String [] array = new String[3];
		array[0] = "Rock";
		array[1] = "Paper";
		array[2] = "Scissors";
		
		int r = random.nextInt(3);
		
		String c1 = array[r];
		System.out.println("The computer has "+c1+"!");
		
		// compare the first round results
		if(u1.equalsIgnoreCase(c1))
		{
			 
			System.out.println("It's a tie. You have " +up+" points. The computer has "+cp+" points");
		}
		else if(u1.equalsIgnoreCase("Rock"))
		{
			if(c1.equalsIgnoreCase("Paper"))
			{
				cp += 1;
				System.out.println("You loose! You have " +up+" points. The computer has "+cp+" points");
			}
			else
			{
				up += 1;
				System.out.println("You win! You have " +up+" points. The computer has "+cp+" points");
				
			}
		}
		
		else if(u1.equalsIgnoreCase("Paper"))
		{
			if(c1.equalsIgnoreCase("Scissors"))
			{
				cp += 1;
				System.out.println("You loose! You have " +up+" points. The computer has "+cp+" points");
			}
			else
			{
				up += 1;
				System.out.println("You win! You have " +up+" points. The computer has "+cp+" points");
				
			}
		}
			

		else if(u1.equalsIgnoreCase("Scissors"))
		{
			if(c1.equalsIgnoreCase("Rock"))
			{
				cp += 1;
				System.out.println("You loose! You have " +up+" points. The computer has "+cp+" points");
			}
			else
			{
				up += 1;
				System.out.println("You win! You have " +up+" points. The computer has "+cp+" points");
				
			}
		}
		else 
		{
			cp +=1;
			System.out.println("You entered an invalid value, so it counts computer wins. You have " +up+ " points. The computer has "+cp+" points");
		}
		}
		// generate the result
		if(up>cp)
		{
			System.out.println("You win the game! You have total " +up+" points. The computer has total "+cp+" points");
		}
		
		else if(up<cp)
		{
			System.out.println("You loose the game! You have total " +up+" points. The computer has total "+cp+" points");
		}
		
		else
		{
			System.out.println("The final result is a tie! Both you and the computer have total " +up+" points.");
		}

		//ask if want to do again
		System.out.println("Do you want to play again? Enter true or false");
		b = keyboard.nextBoolean();
		//keyboard.next();
		
	}while(b);// do the game loop again if the user want
	}

	
}
