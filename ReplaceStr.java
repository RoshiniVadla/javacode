//program to replace characters of string with x 
package anudip;
import java.util.Scanner;
public class ReplaceStr
{ 
	//method to replace the characters of string with x except last four characters
	String replaceStr(String s)  
	{
		//converting string to character array 
		char arr[] = new char[s.length()];
		arr=s.toCharArray();
		//replacing characters with 'x'
		for (int i = 0; i < arr.length- 4; i++) {
		arr[i] = 'x';
		}
		//declaring the string using character array
		String str1 = new String(arr);
		return str1;
		}
		public static void main(String[] args)
		{
		 System.out.println("Enter your mobilenumber:");
		//creating scanner class to read input from user
			Scanner sc = new Scanner(System.in);
			 String str = sc.next();
			 //creating object for class
		     ReplaceStr rp =new ReplaceStr();
		     //calling methods and printing the string
		      System.out.print(rp.replaceStr(str));
	}	
  }


