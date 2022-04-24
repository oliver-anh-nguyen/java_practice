
public final class Stack {

	class Node {
		public Node nextNode;
		public String data;

		public Node(String data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	Node head;
	int size = 0;

	public static void main(String[] array) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println("Stack: " + stack.toString());
		try {
			stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stack.push("C");
		System.out.println("Stack: " + stack.toString());
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(String data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.nextNode = head;
			head = node;
		}
		size++;
	}

	public String pop() throws Exception {
		if (head == null) {
			throw new Exception("Empty");
		}
		Node curr = head;
		head = curr.nextNode;
		curr.nextNode = null;
		size--;
		return curr.data;
	}

	public String peek() throws Exception {
		if (head == null) {
			throw new Exception("Empty");
		}
		return head.data;
	}

	@Override
	public String toString() {
		String result = "";
		Node temp = head;
		do {
			if (temp.nextNode != null) {
				result += temp.data  + " ";
			} else {
				result += temp.data;
			}
			temp = temp.nextNode;
		} while(temp != null);
		return result;
	}
}
