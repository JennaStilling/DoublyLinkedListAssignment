package linkedListPD;

public class Node<E> {
	private E element;
	private Node<E> previous;
	private Node<E> next;
	
	public Node(E element, Node<E> previous, Node<E> next) {
		this.element = element;
		this.previous = previous;
		this.next = next;
	}
	
	//returns:
	//		data of node
	public E getElement() {
		return element;
	}
	
	//returns:
	//		previous node
	public Node<E> getPrevious() {
		return previous;
	}
	
	//returns:
	//		next node
	public Node<E> getNext() {
		return next;
	}
	
	//element	-	data for Node to hold
	public void setElement(E element) {
		this.element = element;
	}
	
	//previous	-	previous node to set
	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}
	
	//next		-	next node to set
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
