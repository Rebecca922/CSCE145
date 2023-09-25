/*
 * Jiarong Xu
 */
import java.util.Scanner;

public class NewAdventure {

	public static void main(String[] args) {
		//greetings + ask destination
		System.out.println("Welcome to the Choose your own adventure! \n"
				+ "Choose the Country you want to travel to. Enter \"China\" or \"America\".");
		Scanner keyboard = new Scanner(System.in);
		String s1 = keyboard.nextLine();
		// For China options
		if (s1.equalsIgnoreCase("China"))
		{
			System.out.println("How many days you have to travel to China? Please enter number only.");
			int d = keyboard.nextInt();
			keyboard.nextLine();
			
			if (d >= 3)
			{
				// for people have enough days to travel
				System.out.println("Do you want to visit the north or south part of China? Please enter \"N\" or \"S\".");
				String cns = keyboard.nextLine();
				if (cns.equalsIgnoreCase("N"))
				{
					// for people want to visit the north part of China
					System.out.println("Do you want to see the Great Wall, the Forbidden City and other most famous historical cites in China?"
							+ "\nPlease enter \"True\" or \"False\". ");
					Boolean b = keyboard.nextBoolean();
					keyboard.nextLine();
					if (b)
					//for people want to see the Great wall and the Forbidden City
					{
						System.out.println("You went to Beijing! It's the capital city of China!"
								+ " \nCongratulations on Traveling in Beijing end!");
					}
					else
						//for people do not want to see the Great wall and the Forbidden City
						System.out.println("You went to Haerbin! It's a beautiful city famous for great BBQ and "
								+ "kindness of the citizen! \nCongradulations on Traveling in Haerbin end!");
				}
				else if (cns.equalsIgnoreCase("S"))
				{			
					// for people want to visit the south part of China
					System.out.println("Do you want to see the most modern city or try the best food? Please enter \"Food\" or \"Modern city\".");
					String cs = keyboard.nextLine();
					// for people want to go to the modern city in South China
					if (cs.equalsIgnoreCase("Modern city"))
					{
						System.out.println("You went to Shanghai! It's the business center city of China!"
								+ " \nCongratulations on Traveling in Shanghai end!");
					}
					else if (cs.equalsIgnoreCase("Food"))
						// for people want to go for the food in South China
					{
						System.out.println("You went to Chendu! It's known as the most livable city in China with best food!"
								+ " \nCongratulations on Traveling in Chengdu end!");
					}
					else 
						// for people type in wrong
						System.out.println("You need to follow the instruction."
								+ " \nAchieve Get Lost end!");
				}
				else
					// for people type in wrong
					System.out.println("You need to follow the instruction."
							+ " \nAchieve Get Lost end!");
			}
			else
				System.out.println("The round flght from Washington D.C. to Beijing China without connecting is about 40 hours.\n"
						+ "If you have less than three days to travel, you can just go home.\n"
						+ "Achieve GO HOME end.");
		}
		else if (s1.equalsIgnoreCase("America"))
			// for people want to travel inside America
			{
			System.out.println("Do you want to visit the north, south or central part of America? Please enter \"N\" or \"S\" or \"C\".");
			String ans = keyboard.nextLine();
			
			if (ans.equalsIgnoreCase("N"))
				// for people want to travel North in America
			{
				System.out.println("You went to New York! It's the most morden city in America!"
						+ " \nCongratulations on Traveling in New York end!");
			}
			else if (ans.equalsIgnoreCase("S"))
				// for people want to travel South in America
			{
				System.out.println("You went to Orlando! It's the city has most Theme Park in America!"
						+ " \nCongratulations on Traveling in Orlando end!");
			}
			else if (ans.equalsIgnoreCase("C"))
				// for people want to travel Central of America
			{
				System.out.println("You went to Chicago! It has one of the most pretty city constructer in America!"
						+ " \nCongratulations on Traveling in Chicago end!");
			}
			else 
				System.out.println("You need to follow the instruction."
						+ " \nAchieve Get Lost end!");
			}
	
		else
		{
			// for people type in wrong
		
			System.out.println("You need to follow the instruction."
					+ " \nAchieve Get Lost end!");
		}
	}

}
