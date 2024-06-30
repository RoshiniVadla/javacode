package anudip;
//program to demonstrate String methods
public class DemoString {

	public static void main(String[] args) {
		//declaring String using literal
		String name="anudip";
		System.out.println(name);
		//declaring String using constructor
		String course=new String("APJFSA coourse");
		System.out.println(course);
        char[] courseType= {'a','w','s'};
        //declaring String using character array
        String course1=new String(courseType);
        System.out.println(course1);
        //concating String with new String
        System.out.println(name.concat("foundation"));
        //assigning new value to String
		name="Anudip Foundation";
		System.out.println(name);
		//printing the character of string at index 4
		System.out.println(name.charAt(4));
		//comparing two strings
		System.out.println(name.compareTo(course1));
		System.out.println(name.endsWith(course));
		//checking if two Strings are equal or not
		System.out.println(name.equalsIgnoreCase(course1));
		System.out.println(name.equalsIgnoreCase(name));
		//printing the index of particular character in String
		System.out.println(name.indexOf('F'));
		//printing index of a character at last index
		System.out.println(name.lastIndexOf('n'));
		System.out.println(name.equals(course));
		//printing the length of the String
		System.out.println(name.length());
		//checking whether a string contains another String or not
		System.out.println(name.contains(course));
		
	}
}
