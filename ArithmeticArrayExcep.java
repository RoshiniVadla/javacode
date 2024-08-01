//program to handle exceptions with try ,catch and finally blocks
package anudip;

public class ArithmeticArrayExcep {

	public static void main(String[] args) {
		// initializing variables
		int a, b, c;
		a = 10;
		b = 10;
		// printing a statement to indicate start of program
		System.out.println("start of the program");
		// try block to catch exceptions
		try {
			// statement which can throw ArithmeticException
			c = a / b;
			System.out.println(c);
			// initializing array
			int arr[] = { 1, 2, 3 };
			// printing array elements which can throw ArrayIndexOutOfboundException
			System.out.println(arr[5]);

		} // catch block to handle ArrayIndexOutOfboundException
		catch (ArrayIndexOutOfBoundsException aoe) {
			System.out.println("array exception caught");
		} // catch block to handle ArithmeticException
		catch (ArithmeticException ae) {
			System.out.println("exception caught");
		} // finally block which can execute necessary statements
		finally {
			System.out.println("end of the program");
		}

	}

}
