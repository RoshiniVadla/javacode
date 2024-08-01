package anudip;

import java.util.Scanner;

public class Student {
	// initializing the variables

	int s_id;
	int c_id;
	String s_name;
	String c_name;

	// method to get the information about the student
	public void s_details() {
		// taking input from the user
		System.out.println("enter student details");
		// creating the scanner class object
		Scanner sc = new Scanner(System.in);
		s_id = sc.nextInt();
		c_id = sc.nextInt();
		s_name = sc.next();
		c_name = sc.next();
		// printing the details of the student
		System.out.println("student id is:" + s_id);

		System.out.println("course id is:" + c_id);

		System.out.println("student name is:" + s_name);
		System.out.println("course name is:" + c_name);

	}

	public static void main(String args[]) {
		// creating object for the class student
		Student s = new Student();
		// calling the method using object
		s.s_details();
	}
}
