
public final class Queue {
	class Node {
		public Node nextNode;
		public String data;

		public Node(String data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public static void main(String[] array) {
		Queue q = new Queue();
		q.enqueue("A");
		q.enqueue("B");
		System.out.println("Queue : " + q.toString());
		q.dequeue();
		q.dequeue();
		System.out.println("Queue : " + q.toString());
		q.enqueue("C");
		q.enqueue("D");
		q.enqueue("E");
		System.out.println("Queue : " + q.toString());
		q.enqueue("E");
		q.dequeue();
		q.dequeue();
		System.out.println("Queue : " + q.toString());
	}

	Node head;
	Node tail;
	int size = 0;

	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}

	public void enqueue(String data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.nextNode = node;
			tail = node;
		}
		size++;
	}

	public Node dequeue() {
		if (head == null) {
			return null;
		}
		Node curr = head;
		head = curr.nextNode;
		curr.nextNode = null;
		if (head == null) {
			tail = null;
		}
		size--;
		return curr;
	}

	@Override
	public String toString() {
		String result = "";
		Node temp = head;
		if (head == null) {
			return "";
		}
		do {
			if (temp.nextNode != null) {
				result += temp.data + " ";
			} else {
				result += temp.data;
			}
			temp = temp.nextNode;
		} while(temp != null);
		return result;
	}
}
