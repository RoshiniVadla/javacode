package anudip;

import java.util.Scanner;

public class AtmAppliction {

	public static void main(String[] args) {
		// initializing the variables
		int amt, sumamt = 0, balance = 100000;
		// creating the scanner class object
		Scanner sc = new Scanner(System.in);
		// while condition to check if balance is zero or not
		while (balance > 0) {
			// if it is not 0 allowing the user to enter the amount to withdraw
			System.out.println("enter amount to withdraw");
			amt = sc.nextInt();
			// calculating the total amount
			sumamt += amt;
			// if condition to check if total amount is greater than 50000
			if (sumamt > 50000) {
				// if it is then prints the statement that limit exceeded
				System.out.println("limit exceeded");
				break;
			}
			// calculating the total balance after withdrawing
			balance -= amt;
			// printing the balance amount and withdrawn amount
			System.out.println("balance is:" + balance + "amount withdrawn is:" + sumamt);
		}

	}

}
