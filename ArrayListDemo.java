package anudip;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
       public static void main(String[] args) {
	//creating an array list
	   ArrayList list=new ArrayList();
	//adding elements to array
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add('a');
	  list.add(3.14);
	  list.add("java");
	//printing array list
	   System.out.println(list);
	//adding elements
	   list.add(true);
	//adding element 2 at index 1
	  list.add(1,2);
	//printing arraylist
	   System.out.println(list);
	//set element at indexx 5 to 20
	   list.set(5,20);
	//printing array list again
	    System.out.println(list);
	//printing the index of element 10
	    System.out.println(list.indexOf(10));
	//adding null to arraylist
	   list.add(null);
	//checking if it contains element 4 or not
	   System.out.println(list.contains(4));
	//get element at index 1
	   System.out.println(list.get(1));
	//printing last index of element 20
	  System.out.println(list.lastIndexOf(20));
	//checking if list is empty or not
	  System.out.println(list.isEmpty());
	//printing the size of list 
	  System.out.println(list.size());
	  System.out.println(list.equals(30));
	//removing element from list
	  System.out.println(list.remove(2));
	  System.out.println(list);
	//creating another arraylist
	List l=new ArrayList();
	  System.out.println(l.isEmpty());
	//adding elements to it
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.addAll(list);
	//Printing the list
	System.out.println(l);
	
	}

}
