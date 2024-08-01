//program to sort array  elements using bubble sort
package anudip;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// initializing variables
		int i, temp;
		// creating Scanner class
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		// reading elements from the user
		System.out.println("Enter array elements:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// implementing bubble sort logic
		for (i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// printing sorted array
		System.out.println("Sorted array elements are:");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}