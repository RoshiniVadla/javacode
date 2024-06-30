//program to reverse a String using String object
package anudip;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		//initializing the variables
		String str;
		String rstr="";
		//creating scanner class
		Scanner sc=new Scanner(System.in);
		//reading the input from the user
	System.out.println("enter a String");
	str=sc.next();
	//for loop to reverse the String
	for( int i=str.length()-1;i>=0;i--)
	{
		rstr +=str.charAt(i);
	}
	//printing reversed String
  System.out.println("reversed string is "+rstr);
	}

}
