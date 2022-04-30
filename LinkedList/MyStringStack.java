
public final class MyStringStack {

	class Node {
		public Node nextNode;
		public String value;

		public Node(String value) {
			this.value = value;
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

	public void push(String value) {
		if (value == null) {
			return;
		}
		Node node = new Node(value);
		if (head == null) {
			head = node;
		} else {
			node.nextNode = head;
			head = node;
		}
		size++;
	}

	public String pop() {
		if (size == 0) {
			return null;
		}
		Node temp = head;
		head = temp.nextNode;
		temp.nextNode = null;
		size--;
		return temp.value;
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
