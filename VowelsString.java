package anudip;
import java.util.Scanner;
import java.util.StringTokenizer;
public class VowelsString {

	public static void main(String[] args) {
	String str;
	int vcount=0;
	int ccount=0;
	int wcount=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr a string");
	str=sc.nextLine();
	StringTokenizer token=new StringTokenizer(str," ");
	wcount=token.countTokens();
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		vcount++;
	}
	else if(ch>='a' && ch<='z')
	{
		ccount++;
	}
	}
	System.out.println("number of vowels :"+vcount);
	System.out.println("number of consonents:"+ccount);
	System.out.println("number of words:"+wcount);
  }

}
