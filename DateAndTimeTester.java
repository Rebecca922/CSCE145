/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class DateAndTimeTester {

	//find "/", " " and ":" index
	String answer;
	int indexDate;
	int indexTime;
	int indexSpace;
	int length;
	
	public void run()
	{
		boolean playAgain = false;
		do
			{
			//welcome+inputy
			System.out.println("Welcome! Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		Scanner keyboard = new Scanner(System.in);
		answer = keyboard.nextLine();
		//find "/", " " and ":" index
		
		indexDate = answer.indexOf("/");
		indexTime = answer.indexOf(":");
		indexSpace = answer.indexOf(" ");
		length = answer.length();
		
		if(isValid(isValidTime(getHour(answer), getMinute(answer)), isValidDate(getMonth(answer), getDay(answer))))
		{
			System.out.println("The date and time is valid!");
		}
		else
		{
			System.out.println("The date and time is not valid.");
		}
		System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue.");
		String a = keyboard.nextLine();
		if(a.equalsIgnoreCase("quit"))
		{
			System.out.println("Good Bye.");
			System.exit(0);
		}
		
		// enter
		else if (a.isEmpty())
		{
			playAgain = true;
		}
		
	} while(playAgain);//if play again
	}

	//check both valid or not
	public boolean isValid(boolean isValidTime, boolean isValidDate)
	{
		return isValidTime(getHour(answer), getMinute(answer)) && isValidDate(getMonth(answer), getDay(answer)); 	
	}
	
	// check month and date valid
	public boolean isValidDate(int getMonth, int getDay)
	{
		boolean result = true;
/*		int[] monthes = new int[7];
		monthes[0]=1;
		monthes[1]=3;
		monthes[2]=5;
		monthes[3]=7;
		monthes[4]=8;
		monthes[5]=10;
		monthes[6]=12;
		for (int i=0; i++; i<7)
		{
		getMonth() = monthes[i];
		}
		*/
		int monthDay = 30;
		//check month valid or not
		if(getMonth(answer)<0 || getMonth(answer)>12)
		{
			result = false;
		//	System.out.println("invalid month");
		}
		else if(getMonth(answer)==2)
		{
			monthDay = 28;
		}
		else if(getMonth(answer)==1 || getMonth(answer)==3|| getMonth(answer)==5|| getMonth(answer)==7|| getMonth(answer)==8|| getMonth(answer)==10|| getMonth(answer)==12)
		{
			monthDay = 31;
		}
		// check day valid or not
		if (getDay(answer)<0 ||getDay(answer)>monthDay)
		{
			result = false;
	//		System.out.println("invalid day");
		}
		
		return result;
	}
	
	// check time valid or not
	public boolean isValidTime(int getHour, int getMinute)
	{
		boolean result = true;
		//check hour
		if(getHour(answer)<0 || getHour(answer)>12)
		{
			result = false;
//			System.out.println("invalid hour");
		}
		
		//check minute
		if(getMinute(answer)<0 || getMinute(answer)>60)
		{
			result = false;
	//		System.out.println("invalid min");
		}
		
		return result;
	}
	
	// get the number from string input
	public int getMonth(String answer)
	{
		String mon= answer.substring(0,indexDate); 
		int m = Integer.parseInt(mon);
		return m;
	}
	
	public int getDay(String answer)
	{
		String day = answer.substring(indexDate+1,indexSpace); 
		int d = Integer.parseInt(day);
		return d;
	}
	
	public int getHour(String answer)
	{
		String hour = answer.substring(indexSpace+1,indexTime); 
		int h = Integer.parseInt(hour);
		return h;
	}
	
	public int getMinute(String answer)
	{
		String minute= answer.substring(indexTime+1,length); 
		int min = Integer.parseInt(minute);
		return min;
	}
}
