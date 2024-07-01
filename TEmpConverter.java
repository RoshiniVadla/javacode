
package anudip;
import java.util.Scanner;
public class TEmpConverter
{
	public static void main(String[] args)
	{
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		//initializing a boolean value
		boolean convertion=true;
	//loop to take user input and converting the temperature into celsius
	while(convertion)
	{
	// taking input from user
	System.out.println("enter a temperature in celsius ");
	int temp=sc.nextInt();
	//converting the temperature from celsius to fohrenheit
	int  f=(9/5)*temp+32;
	System.out.println("converted temperature in fohrenheit is "+f);
	//if condition to check if the temperature is greater than 32 
	if(f<32)
	{
		//if condition is true prints the statement
		System.out.println("very cold");
	}
	// if the condition is false it checks else if condition
	else if(f>=32&&f<=50)
	{
		//if the conditon is true it prints the statement
		System.out.println("cold");
	}
	//it again checks the condition and prints the statement
	else if(f>=50&&f<=70)
	{
		System.out.println("mild");
	}
		//again if it is not true it checks the else if condition and prints the statement
	else if(f>=70)
	{
		System.out.println("warm");
	}
	//asking user to if they want to change temperature 
	System.out.println("want to change temperature yes or no ?");
	String response=sc.next();
		//if response is no it does not go to while loop to convertion
	if(response.equalsIgnoreCase("no")||response.equalsIgnoreCase("n"))		
	{
		convertion=false;
	}
		//if responce is yes it again go to while loop to convertion of temperature
	if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"))
	{
	    convertion=true;
	}	
     }
   }
}
