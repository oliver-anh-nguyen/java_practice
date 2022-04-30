
public final class MyStringLinkedList {

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addLast("Harry");
		list.addLast("Bob");
		list.addLast("Steve");
		list.addLast("Anh");
		String min = list.findMin();
		System.out.println(min);
	}

	class Node {
		public Node nextNode;
		public String value;

		public Node(String value) {
			this.nextNode = null;
			this.value = value;
		}
	}

	Node head;
	Node tail;

	public void addLast(String value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			tail = node;
		}
	}

	public String findMin() {
		String min = null;
		if (head == null && tail == null) {
			return min;
		}
		Node temp = head;
		do {
			if (min == null) {
				min = temp.value;
			} else if (min.compareTo(temp.value) > 0) {
				min = temp.value;
			}
			temp = temp.nextNode;
		} while (temp != null);

		return min;
	}
}
