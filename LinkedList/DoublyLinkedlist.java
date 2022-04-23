
public final class DoublyLinkedlist {

	public static void main(String[] args) {
		DoublyLinkedlist list = new DoublyLinkedlist();
		list.addNode(0);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.printNodesFromHead();
		list.printNodesFromTail();
		list.removeNode(0);
		list.printNodesFromHead();
	    list.printNodesFromTail();
		list.addFirst(-1);
		list.printNodesFromHead();
		list.printNodesFromTail();
		list.addLast(7);
		list.printNodesFromHead();
		list.printNodesFromTail();
		list.removeFirst();
		list.printNodesFromHead();
		list.printNodesFromTail();
		list.removeLast();
		list.printNodesFromHead();
		list.printNodesFromTail();
	}
	
	class Node {
		public Node nextNode;
		public Node prevNode;
		public int value;

		public Node(int value) {
			this.value = value;
			this.nextNode = null;
			this.prevNode = null;
		}
	}

	Node head;
	Node tail;
	
	public void addNode(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			node.prevNode = tail;
			tail = node;
		}
	}
	
	public boolean removeNode(int value) {
		Node temp = head;
		Node prev = null;

		if (head == null) {
			return false;
		}

		// if node is head
		if (temp.value == value) {
			head = temp.nextNode;
			head.prevNode = null;
			return true;
		}

		// search node
		do {
			prev = temp;
			temp = temp.nextNode;
		} while (temp != null && temp.value != value);

		// not found value
		if (temp == null) {
			return false;
		}

		prev.nextNode = temp.nextNode;

		if (temp.nextNode != null) {
			Node tmpPrev = temp.nextNode;
			tmpPrev.prevNode = prev;
		} else {
			tail = prev;
		}

		return true;
	}
	
	public void printNodesFromHead() {
		System.out.print("Head: [");

		Node temp = head;

		do {
			if (temp.nextNode != null) {
				System.out.print(temp.value + ", ");
			} else {
				System.out.print(temp.value);
			}
			temp = temp.nextNode;
		} while(temp != null);

		System.out.print("]");
		System.out.println();
	}

	public void printNodesFromTail() {
		System.out.print("Tail: [");

		Node temp = tail;

		do {
			if (temp.prevNode != null) {
				System.out.print(temp.value + ", ");
			} else {
				System.out.print(temp.value);
			}
			temp = temp.prevNode;
		} while(temp != null);

		System.out.print("]");
		System.out.println();
	}

	public void addFirst(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.nextNode = head;
			head.prevNode = node;
			head = node;
		}
	}

	public void addLast(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			node.prevNode = tail;
			tail = node;
		}
	}

	public void removeFirst() {
		if (head == null) {
			return;
		}
		head = head.nextNode;
		head.prevNode = null;
	}

	public void removeLast() {
		Node temp = head;
		Node prev = null;
		if (head == null) {
			return;
		}

		do {
			prev = temp;
			temp = temp.nextNode;
		} while(temp.nextNode != null);

		prev.nextNode = null;
		tail = prev;
	}
}
