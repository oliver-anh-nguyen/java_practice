import IntStack.Node;

public class StackInfo {

	public static void main(String[] args) {
		StackInfo stack = new StackInfo();
		stack.mainStack = new IntStack();
		stack.mainStack.push(4);
		stack.mainStack.push(6);
		stack.mainStack.push(2);
		stack.mainStack.push(3);
		stack.tempStack = new IntStack();
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 6: " + stack.find(6));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 1: " + stack.find(1));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 2: " + stack.find(2));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
		System.out.println("Find 5: " + stack.find(5));
		System.out.println(stack.mainStack.toString() + " - " + stack.tempStack.toString());
	}

	public IntStack mainStack; 
	public IntStack tempStack;

	public boolean find(Integer num) {
		IntStack.Node firstNode = mainStack.pop();
		if (firstNode == null) {
			return false;
		}
		
		if (firstNode.data == num) {
			mainStack.push(firstNode.data);
			return true;
		}

		boolean isFound = find(num);

		mainStack.push(firstNode.data);
		return isFound;
	}
}

