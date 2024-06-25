
package anudip;
import java.util.Scanner;
public class TEmpConverter
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean convertion=true;
	while(convertion)
	{
	System.out.println("enter a temperature in celsius ");
	int temp=sc.nextInt();
	int  f=(9/5)*temp+32;
	System.out.println("converted temperature in fohrenheit is "+f);
	if(f<32)
	{
		System.out.println("very cold");
	}
	else if(f>=32&&f<=50)
	{
		System.out.println("cold");
	}
	else if(f>=50&&f<=70)
	{
		System.out.println("mild");
	}
	else if(f>=70)
	{
		System.out.println("warm");
	}
	System.out.println("want to change temperature yes or no ?");
	String response=sc.next();
	if(response.equalsIgnoreCase("no")||response.equalsIgnoreCase("n"))		
	{
		convertion=false;
	}
	if(response.equalsIgnoreCase("yes")||response.equalsIgnoreCase("y"))
	{
	    convertion=true;
	}
}
}
}
