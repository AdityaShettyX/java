package labsession;

import java.util.*;

//java program to iterate a linked list
public class Iteratinglinkedlist {

	public static void main(String[] args) {
		//creating Scanner object
		Scanner sc = new Scanner(System.in);
		// creating a object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Inserting some Integer values to our LinkedList
		linkedList.add(40);
		linkedList.add(44);
		linkedList.add(80);
		linkedList.add(9);
		
		
		// using @iterateUsingForLoop method
		iterateUsingForLoop(linkedList);
	}

	// method for iterating the element of Linkedlist
	public static void iterateUsingForLoop(LinkedList<Integer> linkedList) {

		System.out.print("Iterating the LinkedList using a simple for loop : ");

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");//printing output
		}

	}

}
