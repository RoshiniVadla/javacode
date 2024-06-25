package anudip;

public class Array2D {

	public static void main(String[] args) {
		int[][] arr=new int [2][2];
		arr[0][0]=5;
		arr[0][1]=6;
		arr[1][0]=7;
		arr[1][1]=8;
		for(int i=0;i<2;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				System.out.println(arr[i][j]+"");
		        System.out.println();
	         }
		}
		int [][] arr1= {{3,4,5},{6,7,8}};
		System.out.println("no.of rows in arr1 " +arr1.length);
        System.out.println("no.of columns in arr1 " +arr1[0].length);
	}
 }