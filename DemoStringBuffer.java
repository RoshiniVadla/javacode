package anudip;

//program using StringBuffer class
public class DemoStringBuffer {

	public static void main(String[] args) {
		// creating StringBuffer object
		StringBuffer strb = new StringBuffer("anudip");
		// printing String
		System.out.println(strb);
		// adding another String to existing String
		strb.append("ngo");
		System.out.println(strb);
		// reversing the String
		System.out.println(strb.reverse());
		// printing the character in a string at index 3
		System.out.println(strb.charAt(3));
		System.out.println(strb.indexOf("p"));
		System.out.println(strb.capacity());
		System.out.println(strb.codePointAt(5));
		// creating another StringBuffer object
		StringBuffer strb1 = new StringBuffer("advance program in java fullstack using angular");
		System.out.println(strb1.capacity());
		strb1.charAt(23);
		// printing the String
		System.out.println(strb1);
		// comparing two Strings
		System.out.println(strb1.compareTo(strb));
		System.out.println(strb1.codePointAt(21));
		// printing the length of the String
		System.out.println(strb1.length());
		// checking if two Strings are equal or not
		System.out.println(strb1.equals(strb));
		// reversing the String
		System.out.println(strb1.reverse());
		System.out.println(strb1.indexOf("k"));
		// converting StringBuffer to StringBuilder
		StringBuilder strb2 = new StringBuilder(strb);
		System.out.println(strb2);
	}

}
