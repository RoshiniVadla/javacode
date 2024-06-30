//program using stack to store cites based on literacy
package anudip;

import java.util.Stack;

public class Cities {

	public static void main(String[] args) {
		//initializing stack
		 Stack<String> cities=new Stack<String>();
		 //push cities into the stack
		 
		 cities.push("Aizawl");
		 cities.push("Kochi");
		 cities.push("Thiruvananthapuram");
		 cities.push("Chennai");
		 cities.push("Mumbai");
		 cities.push("Pune");
		 cities.push("Bangalore");
		 cities.push("Delhi");
		 cities.push("Hyderabad");
		 System.out.println("cities based on literacy");
		 //printing stack elements 
		 System.out.println(cities);
		 //checking the top elements
		 System.out.println(cities.peek());
		 //deleting the element from stack
		 System.out.println(cities.pop());
		 //printing stack elements
		 System.out.println(cities);
		 //again checking top element
		 System.out.println(cities.peek());
		 //searching for a city in the stack
		 System.out.println(cities.search("Kochi"));
		 System.out.println(cities);
		 
	}

}
