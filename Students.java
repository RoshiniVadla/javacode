//program using tree map for inserting the student objects with role number as key
package anudip;

import java.util.TreeMap;

public class Students {

	public static void main(String[] args) {

		// creating a TreeMap to store student names and role numbers
		TreeMap<Integer, String> student = new TreeMap<Integer, String>();
		// adding the elements to map
		student.put(1, "komali");
		student.put(3, "pavani");
		student.put(5, "bhavani");
		student.put(7, "gagan");
		student.put(4, "gamya");
		student.put(2, "priyanshi");
		// checking if it allows null values
		student.put(6, null);
		// printing the student objects
		System.out.println(student);
		// checking if the map is empty or not
		System.out.println(student.isEmpty());
		// printing the size of the tree map
		System.out.println(student.size());
		// printing first key of the tree map
		System.out.println(student.firstKey());
		// printing last key of the tree map
		System.out.println(student.lastKey());
		// printing the value at key 5
		System.out.println(student.get(5));
		// removing the first entry from the tree map
		System.out.println(student.pollFirstEntry());
		// printing to make sure it removed or not
		System.out.println(student);
		// removing last entry of the tree map
		System.out.println(student.pollLastEntry());
		// printing to make sure it removed or not
		System.out.println(student);
		// printing the tail map from key 5
		System.out.println(student.tailMap(5));
		// printing the tree map
		System.out.println(student);

	}

}
