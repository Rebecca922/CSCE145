/*
 * Jiarong Xu
 */
import java.util.Scanner;

public class BinaryChanger {
	public static void main(String[] args) {
		System.out.println("Hello. Please put 2 four digits Binary numbers so we can convert it to Decimal values and add them together.");
		//Greetings + tell user what to do
		Scanner keyboard = new Scanner(System.in);
		// get the binary numbers
		String b1 = keyboard.nextLine();
		String b2 = keyboard.nextLine();
		
		//find out each digit in the first binary number
		String b11 = b1.substring(0,1);
		String b12 = b1.substring(1,2);
		String b13 = b1.substring(2,3);
		String b14 = b1.substring(3,4);
		//transfer from string to integer
		int i11 = Integer.parseInt(b11);
		int i12 = Integer.parseInt(b12);
		int i13 = Integer.parseInt(b13);
		int i14 = Integer.parseInt(b14);
		//get the decimal number
		int d11 = i11*8;
		int d12 = i12*4;
		int d13 = i13*2;
		int d14 = i14*1;
		int d1 = d11 + d12 + d13 + d14;
		
		//find out each digit in the second binary number
		String b21 = b2.substring(0,1);
		String b22 = b2.substring(1,2);
		String b23 = b2.substring(2,3);
		String b24 = b2.substring(3,4);
		//transfer from string to integer
		int i21 = Integer.parseInt(b21);
		int i22 = Integer.parseInt(b22);
		int i23 = Integer.parseInt(b23);
		int i24 = Integer.parseInt(b24);
		//get the decimal number
		int d21 = i21*8;
		int d22 = i22*4;
		int d23 = i23*2;
		int d24 = i24*1;
		int d2 = d21 + d22 + d23 + d24;
		
		int d3 = d1 + d2;
		System.out.print("The first Binary value is "+d1+" in decimal and the second Binary value is "+d2+
				" in decimal. The total of these two numbers is "+d3+". Thank you for using.");
		
		
				
				
	}

}
