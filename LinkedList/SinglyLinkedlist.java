
public final class SinglyLinkedlist {

	public static void main(String[] args) {
		SinglyLinkedlist list = new SinglyLinkedlist();
		list.addNode(0);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.printNodes();

		list.removeNode(5);
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
	
	class Node {
		public Node nextNode;
		public int value;

		public Node(int value) {
			this.value = value;
			this.nextNode = null;
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
			tail = node;
		}
	}
	
	public boolean removeNode(int value) {
		Node temp = head;
		Node prev = null;

		if (head == null) {
			return false;
		}

		// if value is head
		if (temp.value == value) {
			head = head.nextNode;
			return true;
		}

		// search value
		do {
			prev = temp;
			temp = temp.nextNode;
		} while(temp != null && temp.value != value);

		// if not found
		if (temp == null) {
			return false;
		}

		prev.nextNode = temp.nextNode;

		// if value is tail
		if (temp.nextNode == null) {
			tail = prev;
		}
		
		return true;
	}
	
	public void printNodes() {
		System.out.print("[");

		Node temp = head;

		do {
			if (temp.nextNode != null) {
				System.out.print(temp.value + " ");
			} else {
				System.out.print(temp.value);
			}
			
			temp = temp.nextNode;
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
		if (head == null) {
			return;
		}

		Node temp = head;
		Node prev;

		do {
			prev = temp;
			temp = temp.nextNode;
		} while(temp.nextNode != null);

		prev.nextNode = null;
		tail = prev;
	}
}
