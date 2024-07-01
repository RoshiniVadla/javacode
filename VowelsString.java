package anudip;
import java.util.Scanner;
import java.util.StringTokenizer;
public class VowelsString {

	public static void main(String[] args) {
      //intializing variables
	String str;
	int vcount=0;
	int ccount=0;
	int wcount=0;	
	//creating scanner class object
	    Scanner sc=new Scanner(System.in);	
	//taking input from user
	       System.out.println("enetr a string");
	       str=sc.nextLine();	
	// creating String Tokenizer object to count the number of words in the sentence
	      StringTokenizer token=new StringTokenizer(str," ");
	      wcount=token.countTokens();//counting the words
	//loop to count the vowels and consonents in the sentence
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
		
	// condition to check if the character is vowel or not
	     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	      {
		  vcount++;//if it is vowel count will be increased by 1
	      }
		//conditon to check if the character is consonent
	    else if(ch>='a' && ch<='z')
	      {
		  ccount++;//if it is consonent count will be increased by 1
	      }
	}
		//printing the numbeer of vowels in the sentence
	System.out.println("number of vowels :"+vcount);
		//printing the number of consonents in the sentence
	System.out.println("number of consonents:"+ccount);
		//printing the number of words in the sentence
	System.out.println("number of words:"+wcount);	
	}
}
