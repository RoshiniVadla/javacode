//program using arrays
package anudip;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		int i = 0;
		int total = 0;
		float percentage;
		int marks[] = new int[6];
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the student marks");
		for (; i < marks.length;) {
			marks[i] = sc.nextInt();
			if (marks[i] <= 35)

				b = false;

			i++;
		}
		if (b) {
			for (i = 0; i < marks.length; i++) {
				total += marks[i];
			}
			System.out.println("student is pass");
			percentage = total / 6;
			System.out.println("student result is:" + "\n total is:" + total + "\n percentage is:" + percentage);
		}

		else
			System.out.println("student is fail");
	}

}
