//program to merge two arrays
package anudip;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		// creating scanner class
		Scanner sc = new Scanner(System.in);
		// initializing variables
		int[] arr1 = new int[5];
		int[] arr2 = new int[4];
		int i;
		int n = arr1.length + arr2.length;
		int[] arr3 = new int[n];
		// printing arr1 elements
		System.out.println("enter arr1 elemnts");
		for (i = 0; i < arr1.length; i++)
			arr1[i] = sc.nextInt();
		// printing arr2 elements
		System.out.println("enter arr2 elements");
		for (i = 0; i < arr2.length; i++)
			arr2[i] = sc.nextInt();
		// Implementing merging logic
		for (i = 0; i < arr1.length; i++)
			arr3[i] = arr1[i];
		for (i = 0; i < arr2.length; i++)
			arr3[arr1.length + i] = arr2[i];
		// printing merged array
		System.out.println("merged array is");
		for (i = 0; i < n; i++)
			System.out.println(arr3[i] + " ");
	}
}
