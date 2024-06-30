package anudip;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		 int arr[]= new int[5];
		 int i;
    Scanner sc=new Scanner(System.in);
	System.out.println("enter array elements");
	for(i=0;i<5;i++)
		arr[i]=sc.nextInt();
	     int min=arr[0];
	     int max=arr[0];
    for( i=0 ;i<5;i++)
		 {
		   if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		 }
			 System.out.println("min element of the array is:"+min);
			 System.out.println("max element of the array is :"+max);
	}

}
