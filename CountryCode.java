//program using hash map to insert country with its code as key
package anudip;

import java.util.HashMap;

public class CountryCode {

	public static void main(String[] args) {
		// creating the HashMap object to store country names and codes
		HashMap<Integer, String> countries = new HashMap<Integer, String>();
		// adding elements to the HashMap
		countries.put(91, "india");
		countries.put(1, "usa");
		countries.put(44, "uk");
		countries.put(52, "mexico");
		countries.put(86, "china");
		// printing the hash map
		System.out.println(countries);
		// checking if it allows null value or not
		countries.put(0, null);
		// printing the hash map
		System.out.println(countries);
		// checking if it is empty or not
		System.out.println(countries.isEmpty());
		// removing the entry from the map
		System.out.println(countries.remove(1, "usa"));
		// printing to make sure it removed or not
		System.out.println(countries);
		// printing the entry set of the HashMap
		System.out.println(countries.entrySet());
		// printing the key set of the map
		System.out.println(countries.keySet());
		// printing the values
		System.out.println(countries.values());
		// checking if it contains the value"uk" or not
		System.out.println(countries.containsValue("uk"));
		// printing the size
		System.out.println(countries.size());

	}

}
