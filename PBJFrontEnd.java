/*
 * Jiarong Xu
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean restart = false;
		do {//create two instances
	// ask to input infor for sandwich 1
	System.out.println("-----------------------------------\n"
			+ "Welcome to the PBJ Sandwich Maker!\n"
			+ "-----------------------------------\n"
			+ "-----Sandwich 1-----");
	// top slice bread infor
	System.out.println("Top Slice of Bread Information\nEnter name of the bread");
	String ts1n = keyboard.nextLine();
	System.out.println("Enter the number of calories");
	int ts1c = keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
	String ts1t = keyboard.nextLine();
	// peanut butter infor
	System.out.println("Peanut Butter Information\n"
			+ "Enter name of the peanut butter");
	String p1n = keyboard.nextLine();
	System.out.println("Enter the number of calories");
	int p1c = keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
	boolean p1ic = keyboard.nextBoolean();
	keyboard.nextLine();
	//jelly infor
	System.out.println("Jelly Information\n"
			+ "Enter name of the jelly");
	String j1n = keyboard.nextLine();
	System.out.println("Enter the number of calories");
	int j1c  = keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
	String j1t = keyboard.nextLine();
	//bottom slice bread infor
	System.out.println("Bottom Slice of Bread Information\nEnter name of the bread");
	String bs1n = keyboard.nextLine();
	System.out.println("Enter the number of calories");
	int bs1c = keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
	String bs1t = keyboard.nextLine();
	PBJSandwich a = new PBJSandwich(new Bread (ts1n,ts1c,ts1t),new PeanutButter (p1n,p1c,p1ic),new Jelly (j1n,j1c,j1t), new Bread(bs1n,bs1c,bs1t));
	
	// ask to input infor for sandwich 2
		System.out.println("-----Sandwich 2-----");
		// top slice bread infor
		System.out.println("Top Slice of Bread Information\nEnter name of the bread");
		String ts2n = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int ts2c = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String ts2t = keyboard.nextLine();
		// peanut butter infor
		System.out.println("Peanut Butter Information\n"
				+ "Enter name of the peanut butter");
		String p2n = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int p2c = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
		boolean p2ic = keyboard.nextBoolean();	
		keyboard.nextLine();
		//jelly infor
		System.out.println("Jelly Information\n"
				+ "Enter name of the jelly");
		String j2n = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int j2c  = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		String j2t = keyboard.nextLine();
		//bottom slice bread infor
		System.out.println("Bottom Slice of Bread Information\nEnter name of the bread");
		String bs2n = keyboard.nextLine();
		System.out.println("Enter the number of calories");
		int bs2c = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String bs2t = keyboard.nextLine();
		PBJSandwich b = new PBJSandwich(new Bread (ts2n,ts2c,ts2t),new PeanutButter (p2n,p2c,p2ic),new Jelly (j2n,j2c,j2t), new Bread(bs2n,bs2c,bs2t));
		System.out.println("-----Sandwich 1-----"
				+ "\n"+a.toString());
		System.out.println("-----Sandwich 2-----"
				+ "\n"+b.toString());
		//check equal
		System.out.println("Are they the same sandwich? "+a.equals(b));
		// check restart or not
		System.out.println("Do you want to restart the game?");
		String s = keyboard.nextLine();
		if (s.equalsIgnoreCase("yes"))
			restart = true;
	}while(restart);
		
	}

}
