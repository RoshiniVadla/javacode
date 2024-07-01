//program to print two dimentional array
package anudip;

public class Array2D {

	public static void main(String[] args) {
		//creating array to store elements
		int[][] arr=new int [2][2];
		//adding elements to it
		arr[0][0]=5;
		arr[0][1]=6;
		arr[1][0]=7;
		arr[1][1]=8;
		//loop to itetate over rows
		for(int i=0;i<2;i++)//rows
		{
			//loop to iterate over columns
			for(int j=0;j<2;j++)//columns
			{
				//printing the array
				System.out.println(arr[i][j]+"");				
		                System.out.println();
	                }
		}
		//initializing an array
		int [][] arr1= {{3,4,5},{6,7,8}};
		//printing number of rows and columns of array
		System.out.println("no.of rows in arr1 " +arr1.length);
                System.out.println("no.of columns in arr1 " +arr1[0].length);
	}
 }
