//TreeSet program to insert country names
package anudip;

import java.util.TreeSet;

public class TreeSetCountries {
	public static void main(String[] args) {
		// creating a TreeSet to store country names
		TreeSet<String> countries = new TreeSet<String>();
		// adding country names to the set
		countries.add("united states");
		countries.add("india");
		countries.add("germany");
		countries.add("china");
		countries.add("brazil");
		// printing the TreeSet in alphabetical order
		System.out.println(countries);
		// adding duplicate value to the set
		countries.add("united states");
		// printing the set to check if it accepted duplicate value or not
		System.out.println(countries);
		// printing first element of the set
		System.out.println(countries.first());
		// printing the set in reverse order
		System.out.println(countries.descendingSet());
		// prints the size of the set
		System.out.println(countries.size());
		// checking if the set contains the value Canada or not
		System.out.println(countries.contains("canada"));
		// countries.add(null);//TreeSet does not allow null values
		System.out.println(countries);
		// printing last value of the TreeSet
		System.out.println(countries.last());
	}
}
