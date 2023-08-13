package linkedListTest;

import java.util.ArrayList;

import linkedListPD.DoublyLinkedList;
import linkedListPD.Node;

public class LinkedListTest {
	public void test(DoublyLinkedList<String> list) {
		System.out.println("Making the linked list: ");
		//for each node, adds data (country), either head or tail if adding to beginning or end, then the node that will be shifted forwards or backwards
		list.addFirst(new Node<>("USA", list.getHead(), list.getHead().getNext()));

		list.addLast(new Node<>("Germany", list.getTail(), list.getTail().getPrevious()));
		
		list.addFirst(new Node<>("France", list.getHead(), list.getHead().getNext()));
		
		list.addLast(new Node<>("England", list.getTail(), list.getTail().getPrevious()));
		
		list.addFirst(new Node<>("Belgium", list.getHead(), list.getHead().getNext()));
		System.out.println("Completed");
		
		//printing out first to last 
		System.out.println();
		System.out.println("From first to last node: ");
		ArrayList<String> fromFirst = list.toArrayFromFirst(); //gets the elements from each node and puts them into an array
		for (int i = 0; i < fromFirst.size(); i++)
			System.out.println(fromFirst.get(i));
		
		//printing out from last to first
		System.out.println();
		System.out.println("From last to first node: ");
		ArrayList<String> fromLast = list.toArrayFromLast(); //gets the elements from each node and puts them into an array
		for (int i = 0; i < fromLast.size(); i++)
			System.out.println(fromLast.get(i));
		
		//cloning the list
		System.out.println();
		System.out.println("Cloning list, then displaying from first to last node: ");
		DoublyLinkedList<String> clonedList = list.clone();
		ArrayList<String> clonedArray = clonedList.toArrayFromFirst(); //printing out first to last and grabbing just the elements
		for (int i = 0; i < clonedArray.size(); i++)
			System.out.println(clonedArray.get(i)); 
		
	}

}
