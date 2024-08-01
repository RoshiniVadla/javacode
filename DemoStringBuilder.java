package anudip;

//program using StringBuilder class
public class DemoStringBuilder {

	public static void main(String[] args) {
		// creating StringBuilder object
		StringBuilder strbd = new StringBuilder("hello world");
		// printing String
		System.out.println(strbd);
		// printing length of String
		System.out.println(strbd.length());
		// printing last index of a particular character in the String
		System.out.println(strbd.lastIndexOf("o"));
		System.out.println(strbd.indexOf("o"));
		System.out.println(strbd.capacity());
		// converting StringBuilder to StringBuffer
		StringBuffer strbd1 = new StringBuffer(strbd);
		System.out.println(strbd1);
		// adding the another String to the existing String
		System.out.println(strbd1.append("java"));
		// printing substring from the given index
		System.out.println(strbd1.substring(4));
		// printing the hashcode of the String
		System.out.println(strbd1.hashCode());
		// checking if the String is empty or not
		System.out.println(strbd1.isEmpty());
		// reversing the String
		System.out.println(strbd1.reverse());
		// converting it to String
		System.out.println(strbd1.toString());
		// deleting a particular character from the String
		System.out.println(strbd1.deleteCharAt(6));
	}

}
