/*
 * Jiarong Xu
 */
public class appleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the apple tester");
		System.out.println("Create default apple");
		// default apple 1
		Apple a = new Apple();
		System.out.println("Printing the default apple's value");
		System.out.println(a.toString());
		//apple 2
		System.out.println("Create another apple");
		Apple b = new Apple ();
		b.setType("GrannySmith");
		b.setWeight(0.75);
		b.setPrice(0.99);
		System.out.println("Printing the new apple's value");
		System.out.println(b.toString());
		//apple 3
		System.out.println("Create another apple");
		Apple c = new Apple ();
		b.setType("ipad");
		b.setWeight(2.5);
		b.setPrice(-200);
		System.out.println("Printing the new apple's value");
		System.out.println(c.toString());
// Check
		System.out.println("Checking the first and last apple have the same values.");
		boolean answer = a.equals(b);
		System.out.println(answer);
		

	}

}
