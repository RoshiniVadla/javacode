package anudip;

import java.util.Scanner;

public class RelationalOp {

	public static void main(String[] args) {
		// initializing the variables
		int a, b;
		// taking input from the user
		System.out.println("enter a,b values");
		// creating scanner class
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		// prints the statement if a and b are equal
		System.out.println("a and b are equal" + (a == b));
		// prints the statement if a and b are not equal
		System.out.println("a and b are not equal" + (a != b));
		// prints the statement if a is greater than b
		System.out.println("a is greater than b" + (a > b));
		// prints the statement if a is less than b
		System.out.println("a is less than b" + (a < b));
		// if a is less than or equal to b then returns true or false
		System.out.println("a is less than or equal to b" + (a <= b));
		// if a is greater than or equal to b then returns true or false
		System.out.println("a is greater than or equal to b" + (a >= b));

	}

}
