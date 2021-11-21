package Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		//Class object = new Class();
		LinkedList <String> cities = new LinkedList<String>();
		//Storing the elements
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("Chennai");
		cities.add("Hyderabad");
		cities.add("New Delhi");
		cities.add("London");
		//Retrieve the elements
		for(String t: cities) {
		System.out.println(t);
		}
		System.out.println();
		//What item is stored at index 1
		System.out.println("Item stored at index 1 = " + cities.get(1));
		//Index of Paris
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		//Count total number of items in the list
		System.out.println("Total items stored in the list = " + cities.size());
}
}