package anudip;

import java.util.Scanner;

public class ArithmaticOp {

	public static void main(String[] args) {
		// initializing the variables
		int a, b;
		// taking input from the user
		System.out.println("enter a,b values");
		// creating the scanner class object
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		// performing addition
		System.out.println("a+b=" + (a + b));
		// performing subtraction
		System.out.println("a-b=" + (a - b));
		// performing multiplication
		System.out.println("a*b=" + (a * b));
		// performing division
		System.out.println("a/b=" + (a / b));
	}

}
