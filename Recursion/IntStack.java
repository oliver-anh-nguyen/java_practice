import java.util.List;
import java.util.ArrayList;

public class IntStack {
	public Node top;
	int size;
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public class Node {
		public int data;
		public Node nextNode;
		
		public Node(int data) {
			this.data = data;
			nextNode = null;
		}
	}
	
	public Node push(int data) {
		Node newNode = new Node(data);
		
		if (top == null) {
			top = newNode;
		} else {
			newNode.nextNode = top;
			top = newNode;
		}
		size++;
		return newNode;
	}
	
	public Node pop() {
		if (isEmpty()) {
			return null;
		}
		
		Node temp = top;
		top = top.nextNode;
		size--;
		return temp;
	}
	
	public Node peek() {
		if (isEmpty()) {
			return null;
		}
		return top;
	}

	@Override
	public String toString() {
		String result = "[";
		Node temp = top;
		while (temp != null){
			result += temp.data;
			temp = temp.nextNode;
			if (temp != null) {
				 result += ", ";
			}
		};
		result += "]";
		return result;
	}

}


