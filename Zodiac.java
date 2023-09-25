/*
 * Jiarong Xu
 */
import java.util.Scanner;

public class Zodiac {

	public static void main(String[] args) {
		//Greetings and get month and date data
		System.out.println("Welcome! What is your Zodiac?  Enter your birthday -- Month followed by Day as numbers.");
		Scanner keyboard = new Scanner(System.in);
		int m = keyboard.nextInt();
		int d = keyboard.nextInt();
		keyboard.nextLine();
		//Group the data by month
		// then group the data by date and print the result
		if (m == 1)
				{
				if (d >= 1 && d <= 19)
						System.out.println("You are a Capricorn!");//Capricorn = December 22 to January 19
				
				else if (d > 19 && d <= 31)
						System.out.println("You are a Aquarius!");//Aquarius = January 20 to February 18
				
				else 
					System.out.println("Invalid Day!");//only 31 days in this month
				}
		
		else if (m == 2)
				{
				if (d >= 1 && d <= 18)
					System.out.println("You are a Aquarius!");//Aquarius = January 20 to February 18
			
				else if (d > 18 && d <= 29)
					System.out.println("You are a Pisces!");//Pisces = February 19 to March 20
			
				else 
				System.out.println("Invalid Day!");//only 29 days in month
				}
		
		else if (m == 3)
				{
				if (d >= 1 && d <= 20)
					System.out.println("You are a Pisces!");//Pisces = February 19 to March 20
			
				else if (d > 20 && d <= 31)
					System.out.println("You are a Aries!");//Aries = March 21 to April 19
			
				else 
				System.out.println("Invalid Day!");//only 31 days in this month 		
				}
		
		else if (m == 4)
				{
				if (d >= 1 && d <= 19)
					System.out.println("You are a Aries!");//Aries = March 21 to April 19
			
				else if (d > 19 && d <= 30)
					System.out.println("You are a Taurus!");//Taurus = April 20 to May 20
			
				else 
				System.out.println("Invalid Day!");	//only 30 days in this month
				}
		
		else if (m == 5)
				{
				if (d >= 1 && d <= 20)
					System.out.println("You are a Taurus!");//Taurus = April 20 to May 20
			
				else if (d > 20 && d <= 31)
					System.out.println("You are a Gemini!");//Gemini = May 21 to June 20
			
				else 
				System.out.println("Invalid Day!");	//only 31 days in this month
				}
		
		else if (m == 6)
				{
				if (d >= 1 && d <= 20)
					System.out.println("You are a Gemini!");//Gemini = May 21 to June 20
			
				else if (d > 20 && d <= 30)
					System.out.println("You are a Cancer!");//Cancer = June 21 to July 22
			
				else 
				System.out.println("Invalid Day!");	//only 30 days in this month
				}
		
		else if (m == 7)
				{
				if (d >= 1 && d <= 22)
					System.out.println("You are a Cancer!");//Cancer = June 21 to July 22
			
				else if (d > 22 && d <= 31)
					System.out.println("You are a Leo!");//Leo = July 23 to August 22
			
				else 
				System.out.println("Invalid Day!");//only 31 days in this month
				}
		
		else if (m == 8)
				{
				if (d >= 1 && d <= 22)
					System.out.println("You are a Leo!");//Leo = July 23 to August 22
			
				else if (d > 22 && d <= 31)
					System.out.println("You are a Virgo!");//Virgo = August 23 to September 22
			
				else 
				System.out.println("Invalid Day!");	//only 31 days in this month
				}
		
		else if (m == 9)
				{
				if (d >= 1 && d <= 22)
					System.out.println("You are a Virgo!");//Virgo = August 23 to September 22
			
				else if (d > 22 && d <= 30)
					System.out.println("You are a Libra!");//Libra = September 23 to October 22
			
				else 
				System.out.println("Invalid Day!");	//only 30 days in this month
				}
		
		else if (m == 10)
				{
				if (d >= 1 && d <= 22)
					System.out.println("You are a Libra!");//Libra = September 23 to October 22
			
				else if (d > 22 && d <= 31)
					System.out.println("You are a Scorpio!");//Scorpio = October 23 to November 21
	
				else 
				System.out.println("Invalid Day!");	//only 31 days in this month
				}
				
		else if (m == 11)
				{
				if (d >= 1 && d <= 21)
					System.out.println("You are a Scorpio!");//Scorpio = October 23 to November 21
			
				else if (d > 21 && d <= 30)
					System.out.println("You are a Sagittarius!");//Sagittarius = November 22 to December 21
			
				else 
				System.out.println("Invalid Day!");	//only 30 days in this month
				}
		
		else if (m == 12)
				{
				if (d >= 1 && d <= 21)
					System.out.println("You are a Sagittarius!");//Sagittarius = November 22 to December 21
			
				else if (d > 21 && d <= 31)
					System.out.println("You are a Capricorn!");//Capricorn = December 22 to January 19
			
				else 
				System.out.println("Invalid Day!");	//only 31 days in this month
				}
		
		else 
			System.out.println("Invalid Month!");//only 12 months in a year

			


	}

}
