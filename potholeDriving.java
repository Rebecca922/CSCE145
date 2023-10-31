/*
 * Jiarong Xu
 */
import java.util.Scanner;
import java.util.Random;
public class potholeDriving {

 // set up figures and board size
	public static final char PLAYER = 'X';
	public static final char POTHOLE = 'Y';
	public static final char EMPTY = '_';
	public static final int BOARD_SIZE = 10;
	public static final char HOME = '^';
	

	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean playAgain = false;
		
		do
		{
		boolean finish = false;
	
		System.out.println("Welcome to Pothole Driving! Get home while avoiding potholes!");
		
		//get potholes' information
		int[][] pothole = new int[5][2];
		for(int i=0; i<5; i++)
		{
		pothole[i][0] = r.nextInt(BOARD_SIZE);
		pothole[i][1] = r.nextInt(BOARD_SIZE);
		//check if it is the same one
		boolean reselect = false;
		do{
			for(int j=0; j<i; j++)
		
		{
			if((pothole[i][0]== pothole[j][0] && pothole[i][1]== pothole[j][1])||((pothole[i][0]==0 && pothole[i][1]==0))||(pothole[i][0]==9 && pothole[i][1]==9))
			{
				reselect = true;
			}
			else
				reselect = false;
			
		}
		while(reselect)
		{
			pothole[i][0] = r.nextInt(BOARD_SIZE);
			pothole[i][1] = r.nextInt(BOARD_SIZE);
		}
		}while(reselect);
		}
		
		//print pothole values to debug
		/*
		for(int i=0; i<5; i++)
		{
		System.out.print(pothole[i][0]);
		System.out.println(pothole[i][1]);
		}
		*/
		
		// set up player spot
		int px = 0;
		int py = 0;
	
		
		//create board
		char [][] board = new char[BOARD_SIZE][BOARD_SIZE];
	
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				board[i][j] = EMPTY;
			}
		}
		
		//put pothole in board
		for(int i=0;i<5;i++)
		{
			board[pothole[i][0]][pothole[i][1]] = POTHOLE;
			
		}
		
		//put player and home in board
		board[9][9] = HOME;
		board[px][py] = PLAYER;

		//draw board
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		// check home/pothole
		if(px == 9 && py == 9)
		{
			System.out.println("Yes! You win!");
			
			
		}
		// move
		// ask for x movement
		do{
			board[px][py]=EMPTY;
		
		System.out.println("Enter either a -1, 0, or 1 in the X or 9 to quit");
		int x1 = keyboard.nextInt();
		if(x1>-2 && x1<2)//check the input is valid or not
		{
		px += x1;
		}
		else if(x1 == 9)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid number! You will not move for this round toward this direction");
		}
		
		System.out.println("Enter either a -1, 0, or 1 in the Y or 9 to quit");
		int y1 = keyboard.nextInt();
		if(y1>-2 && y1<2)
		{
			py += y1;
		}
		else if(y1 == 9)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid number! You will not move for this round toward this direction");
		}

		//check if the player is still in the board
		if(px<0)
		{
			System.out.println("You are going out of the board! I change you location to stay on the edge.");
			px = 0;
		}
		if(px>9)
		{
			System.out.println("You are going out of the board! I change you location to stay on the edge.");
			px = 9;
		}
		if(py<0)
		{
			System.out.println("You are going out of the board! I change you location to stay on the edge.");
			py = 0;
		}
		if(py>9)
		{
			System.out.println("You are going out of the board! I change you location to stay on the edge.");
			py = 9;
		}
		//reassign player
		board[px][py]= PLAYER;
		// print board
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		//check win or not
		if(px==9 && py==9)
		{
			finish = true;
			System.out.println("You win the game!!\nWould you like to play again? Please enter Yes or No.");
			String answer = keyboard.next();
			if(answer.equalsIgnoreCase("Yes"))
			{
				playAgain = true;
			}
			else
			{
				System.out.println("Goodbye!");
				System.exit(0);
			}

			}
		
		// check hit the pothole or not
		for(int i=0; i<5; i++)
		{
			if(px==pothole[i][0] && py ==pothole[i][1])
			{
				finish = true;
				System.out.println("OH NO! POTHOLE! You lose!");
				System.out.println("Would you like to play again? Please enter Yes or No.");
				
				String answer = keyboard.next();

				if(answer.equalsIgnoreCase("Yes"))
				{
					playAgain = true;
				}
				else
				{
					System.out.println("Goodbye!");
					System.exit(0);
				}
			}
		}
		}while(!finish);//check finish
		}while(playAgain);//check play again

		
	}
	/*
	public void printBoard()
	{
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	public void playagain():
	{
	System.out.println("You win the game!!\n Would you like to play again? Please enter true or false");
			playAgain = keyboard.nextBoolean();
						keyboard.next();
			}
	
	
	public void check9()
	{
		if()
	}
	
	public void movement()
	{
board[px][py]=EMPTY;
		System.out.println("Enter either a -1, 0, or 1 in the X or 9 to quit");
		
		int x1 = keyboard.nextInt();
		if(x1 == 9)
		{
			System.exit(0);
		}
		px += x1;
		
		System.out.println("Enter either a -1, 0, or 1 in the Y or 9 to quit");
		int y1 = keyboard.nextInt();
		if(y1 == 9)
		{
			System.exit(0);
		}
		py += y1;
		
		board[px][py]= PLAYER;
		
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board[i].length; j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
	}
	*/

}
