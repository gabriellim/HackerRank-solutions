import java.util.LinkedList;

public class LinkedListUS {

	// Properties
	Node head;
	int count;

	// Constructors
	// public LinkedList() {
	// 	this.head = null;
	// 	this.count = 0;
	// }

	public LinkedListUS(Node newHead) {
		this.head = newHead;
		this.count = 1;
	}

	// Methods

	// Add 
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}

		current.setNext(temp);
		count += 1;
	}

	// Get
	public int get(int index) {
		if (index <= 0) {
			return -1;
		}

		Node current = head;
		for (int i = 1; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	// Size
	public int size() {
		return this.count;
	}

	// isEmpty
	public boolean isEmpty() {
		return this.head == null;
	}

	// Remove
	public void remove() {
		// Remove from back of the list
		Node current = head;

		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}

		current.setNext(null);
		count -= 1;
	}

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Alice");
		System.out.println(linkedList);
		linkedList.add("Alison");
		System.out.println(linkedList);
	}
}