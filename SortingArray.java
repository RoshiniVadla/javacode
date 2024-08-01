package anudip;

//program to sort an array in ascending order
public class SortingArray {

	public static void main(String[] args) {
		// Initializing variables
		int arr[] = { 35, 56, 73, 43, 26, 78, 98 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				// checking if element is greater than its previous element
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;// swapping elements
				}
			}
		}
		System.out.println("sorted array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// printing sorted array
		}
	}
}
