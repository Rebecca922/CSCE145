/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//welcome + Create dresser
		Dresser d = new Dresser();
		System.out.println("Welcome to the dresser!\n");
				boolean quit = false;
				// start 
				while(!quit)
				{
				System.out.println("Enter 1: to add an item\n"
				+ "Enter 2: to remove an item\n"
				+ "Enter 3: to print out the dresser contents\n"
				+ "Enter 9: to quit");
	

		int i = keyboard.nextInt();
		//keyboard.next();
		if(i==1)
		{
			System.out.println("Enter the type\n"
					+ "It may be undergarment, socks, stockings, top, bottom, or cape");
			String s1 = keyboard.next();
			System.out.println("Enter a color\n"
					+ "It may be brown, pink, orange, green, blue, purple, or grey");
			String s2 = keyboard.next();
			d.addClothing(new Clothing(s1,s2));
			//System.out.println("1");
		}
		else if(i==2)
		{
			System.out.println("Enter the type\n"
					+ "It may be undergarment, socks, stockings, top, bottom, or cape");
			String s1 = keyboard.next();
			System.out.println("Enter a color\n"
					+ "It may be brown, pink, orange, green, blue, purple, or grey");
			String s2 = keyboard.next();
			d.removeClothing(new Clothing(s1,s2));
		}
		else if(i==3)
		{
			d.sortDresser();
			d.print();
		}
		else if(i==9)
		{
			quit = true;
			System.out.println("Goodbye!");
		}
		else
			System.out.println("Invalid value! Please input again!");
	}
	}

}
