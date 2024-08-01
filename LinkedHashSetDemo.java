//program to demonstrate LinkedHashSet
package anudip;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		// creating linkedHashset to store integer values
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		// adding elements to it
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(40);
		lh.add(50);
		// printing the LinkedHashSet
		System.out.println(lh);
		// adding null value to it
		lh.add(null);
		// adding duplicate value to set
		lh.add(20);
		lh.add(null);
		// again printing LinkedHashSet
		System.out.println(lh);
		// printing the size of the set
		System.out.println(lh.size());
		// checking if the the set is empty or not
		System.out.println(lh.isEmpty());
		// checking if set contains the element 20 or not
		System.out.println(lh.contains(20));
		// removing an element from the set
		System.out.println(lh.remove(10));
		// printing the LinkedHashSet
		System.out.println(lh);
	}
}
