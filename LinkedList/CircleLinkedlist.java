
public class CircleLinkedlist {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.addNode(0);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		
		list.printNodes();
		
		list.removeNode(0);
		list.printNodes();
		
		list.addFirst(-1);
		list.printNodes();
		
		list.addLast(6);
		list.printNodes();
		
		list.removeFirst();
		list.printNodes();
		
		list.removeLast();
		list.printNodes();
	}

}

class Node {
	public Node nextNode;
	public int value;

	public Node(int value) {
		this.value = value;
		this.nextNode = null;
	}
}

class CircularLinkedList {
	Node head;
	Node tail;
	
	public void addNode(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			node.nextNode = head;
			tail = node;
		}
	}
	
	public boolean removeNode(int value) {
		Node temp = head;
		Node prev = null;

		// if head null
		if (temp == null) {
			return false;
		}

		// if value at first
		if (temp.value == value) {
			head = head.nextNode;
			tail.nextNode = head;
			return true;
		}

		// search value
		do {
			prev = temp;
			temp = temp.nextNode;
		} while (temp.nextNode != head && temp.value != value);

		// if value not found
		if (temp.nextNode == head && temp.value != value) {
			return false;
		}

		prev.nextNode = temp.nextNode;
		
		// if value at last
		if (temp.nextNode == head && temp.value == value) {
			tail = prev;
		}

		return true;
	}
	
	public void addFirst(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.nextNode = head;
			head = node;
			tail.nextNode = node;
		}
	}
	
	public void addLast(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			node.nextNode = head;
			tail = node;
		}
	}
	
	public void removeFirst() {
		if (head == null) {
			return;
		}
		head = head.nextNode;
	}
	
	public void removeLast() {
		Node temp = head;
		Node prev = null;

		do {
			prev = temp;
			temp = temp.nextNode;
		} while(temp.nextNode != head);

		prev.nextNode = temp.nextNode;
		tail = prev;
	}

	public void printNodes() {
		System.out.print("[");
		
		Node temp = head;
		do {
			System.out.print(temp.value + " ");
			temp = temp.nextNode;
		} while(temp.nextNode != head);
		System.out.print(temp.value);
		System.out.print("]");
		System.out.println();
	}
}
