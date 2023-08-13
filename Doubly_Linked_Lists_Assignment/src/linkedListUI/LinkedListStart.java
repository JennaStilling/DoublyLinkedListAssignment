package linkedListUI;

import linkedListPD.DoublyLinkedList;
import linkedListTest.LinkedListTest;

public class LinkedListStart {
	public static void main (String args[]) {
		LinkedListTest testObject = new LinkedListTest(); //object to call test class
		DoublyLinkedList list = new DoublyLinkedList(); //empty doubly linked list
		
		testObject.test(list);
		
	}

}
