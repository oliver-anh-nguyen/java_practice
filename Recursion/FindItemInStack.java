import java.util.List;
import java.util.Stack;

public class FindItemInStack {

	public static void main(String[] args) {
		FindItemInStack stack = new FindItemInStack();
		Stack<Integer> mainStacks = stack.mainStacks;
		mainStacks.add(1);
		mainStacks.add(2);
		mainStacks.add(3);
		mainStacks.add(4);
		mainStacks.add(5);
		mainStacks.add(6);
		int n = 7;
		boolean isFound = stack.find(n);
		System.out.printf("is %d found: " + isFound, n);
		System.out.println();
	}

	Stack<Integer> mainStacks = new Stack<>();
	Stack<Integer> tempStacks = new Stack<>();

	public boolean find(Integer num) {
		if (mainStacks.isEmpty()) {
			return false;
		}
		Integer lastItem = mainStacks.pop();
		if (lastItem == num) {
			return true;
		}
		return find(num);
	}
}

