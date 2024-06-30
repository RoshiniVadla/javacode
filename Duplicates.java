package anudip;
// program to find duplicate elements in an array

public class Duplicates {

	public static void main(String[] args) {
		//initializing variables
		int arr[]= {3,4,5,3,6, 6,7,7,8};
		int count=0;
		System.out.println("duplicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				//condition to compare elements with eachother
				if(arr[i]==arr[j])
				{
					//printing duplicate elements
					System.out.println(arr[i]);
					count++;
				
				}
				
			}
		}
		//counting duplicate elements
			System.out.println("count is"+count);

	

}
}