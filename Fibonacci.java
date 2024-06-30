package anudip;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// initializing the variables
		int i, num1, num2, num3, range;
		// taking input from the user
		System.out.println("enter the range");
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		range = sc.nextInt();
		// initially setting number values
		num1 = 0;
		num2 = 1;
		// printing the numbers
		System.out.println(num1);
		System.out.println(num2);
		// for loop to display fibonacci series
		for (i = 3; i <= range; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}

	}

}
