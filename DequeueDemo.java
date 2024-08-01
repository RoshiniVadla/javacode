package anudip;

import java.util.ArrayDeque;

public class DequeueDemo {

	public static void main(String[] args) {
		// creating ArrayDeque object using String
		ArrayDeque<String> ad = new ArrayDeque<String>();
		// adding elements to it
		ad.add("red");
		ad.add("blue");
		ad.add("black");
		ad.add("yellow");
		ad.add("green");
		// printing elements
		System.out.println(ad);
		// print top element of queue
		System.out.println(ad.peek());
		// deleting element from queue
		System.out.println(ad.poll());
		System.out.println(ad.peek());
		// printing the elements
		System.out.println(ad);
		// adding element into queue
		ad.add("white");
		// adding element into queue at first end
		ad.addFirst("purple");
		// //adding element into queue at last end
		ad.addLast("brown");
		// printing the elements
		System.out.println(ad);
	}

}
