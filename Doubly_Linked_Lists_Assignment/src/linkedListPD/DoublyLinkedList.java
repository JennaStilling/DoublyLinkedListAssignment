package linkedListPD;

import java.util.ArrayList;

public class DoublyLinkedList<E> {
	private int size; //size of linked list
	private Node<E> head; //head of list
	private Node<E> tail; //tail of list
	
	public DoublyLinkedList() {
		size = 0;
		
		head = new Node<E>(null, null, null);
		tail = new Node<E>(null, head, null);
		
		head.setNext(tail); //points head at tail
	}
	
	//returns:
	//		size of linked list
	public int getSize() {
		return size;
	}
	
	//returns:
	//		boolean if the list is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
	//returns:
	//		next node or null
	public Node<E> getFirst() {
		if (isEmpty())
			return null;
		else
			return head.getNext();
	}
	
	//returns:
	//		last node or null
	public Node<E> getLast() {
		if (isEmpty())
			return null;
		else
			return tail.getPrevious();
	}
	
	//node	-	node to get previous node from
	public Node<E> getPrevious(Node<E> node) {
		if (node == head)
			return null;
		else
			return node.getPrevious();
	}
	
	//node	-	node to get next node from
	public Node<E> getNext(Node<E> node) {
		if (node == tail)
			return null;
		else
			return node.getNext();
	}
	
	//location	-	head of list
	//given		-	new node to add to list
	public void addBefore(Node<E> location, Node<E> given) {
		Node<E> lastNode = getPrevious(location); //grabbing the last node of the list
		given.setPrevious(lastNode); //setting the last node as the node before the new first
		given.setNext(location); //ensuring the last node points to the head
		location.setPrevious(given); //ensuring the head points to the last node
		lastNode.setNext(given); //setting the next node of the last node of list to new node
		size++; //increasing size of list
	}
	
	//location	-	tail of list
	//given		-	new node to add to list
	public void addAfter(Node<E> location, Node<E> given) {
		Node<E> firstNode = getNext(location); //grabbing first node of the list
		given.setPrevious(location); //ensuring the tail points to the new end of list
		given.setNext(firstNode); //pointing the new end of list to the first node of the list
		firstNode.setPrevious(given); //points the first node to the new last node of list
		location.setNext(given); //ensures that the tail points to the first node
		size++;
	}
	
	//given	-	node to add to list
	public void addFirst(Node<E> given) {
		addAfter(head, given);
	}
	
	//given	-	node to add to list
	public void addLast(Node<E> given) {
		addBefore(tail, given);
	}
	
	//returns:
	//		head	head of linked list
	public Node<E> getHead() {
		return head;
	}
	
	//returns:
	//		tail	tail of linked list
	public Node<E> getTail() {
		return tail;
	}

	//returns:
	//		firstArray	-	array arranged from first node to last node
	public ArrayList<E> toArrayFromFirst() {
		ArrayList<E> firstArray = new ArrayList<E>();
		Node<E> listNode = getFirst(); //gets first node of list
		for (int i = 0; i < size; i++) {
			firstArray.add(listNode.getElement()); //adds element from node
			listNode = listNode.getNext(); //gets the next node
			
		}
		
		return firstArray;
	}

	//returns:
	//		lastArray	-	array arranged from last node to first node
	public ArrayList<E> toArrayFromLast() {
		ArrayList<E> lastArray = new ArrayList<E>();
		Node<E> listNode = getLast(); //gets last node of list
		for (int i = 0; i < size; i++) {
			lastArray.add(listNode.getElement()); //adds element from node
			listNode = listNode.getPrevious(); //gets the previous node
		}
		return lastArray;
	}
	
	//returns:
	//		listCopy	-	copied list
	public DoublyLinkedList<E> clone() {
		DoublyLinkedList<E> listCopy = new DoublyLinkedList<E>();
		Node<E> listNode = head; //gets head
		
		for (int i = 0; i < size; i++) {
			listCopy.addLast(new Node<E>(listNode.getNext().getElement(), head, tail)); //adds node to end of copied list
			listNode = listNode.getNext(); //gets next node 
		} 
		
		return listCopy;
	}
	
	
	
}
