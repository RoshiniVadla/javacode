package anudip;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueDemo {

	public static void main(String[] args) {
		// creating priority queue of integers
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// adding elements into queue
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		// printing the elements
		System.out.println(pq);
		// checking top element
		System.out.println(pq.peek());
		// again adding element
		pq.add(60);
		// deleting element from the queue
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		// printing the size of the queue
		System.out.println(pq.size());
	}
}
