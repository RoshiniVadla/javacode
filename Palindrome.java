package anudip;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// initializing the variables
		int n, r, temp;
		int rev;
		// taking input from the user
		System.out.println("enter a number");
		// creating the scanner class
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		// setting initial values as 0
		rev = r = 0;
		temp = n;
		// condition to check if temp is greater than 0
		while (temp > 0) {
			// if it is it performs the below logic
			r = temp % 10;
			rev = rev * 10 + r;
			temp /= 10;

		}
		// printing the reversed number
		System.out.println("reversed number is:" + rev);
		// condition to check if the given number is equal to reversed number or not
		if (n != rev)
			// if it is not it prints the below statement
			System.out.println("it is not palindrome");
		else
			// otherwise it prints the number is Palindrome
			System.out.println("it is palindrome");
	}

}
