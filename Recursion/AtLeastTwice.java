import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class AtLeastTwice {

	public static void main(String[] args) {
		AtLeastTwice atLeastTwice = new AtLeastTwice();
		LinkedList<String> inputList1 = new LinkedList<>();
		inputList1.add("a");
		inputList1.add("b");
		inputList1.add("b");
		LinkedList<String> inputList2 = new LinkedList<>();
		inputList2.add("a");
		inputList2.add("b");
		inputList2.add("a");
		inputList2.add("b");
		inputList2.add("c");
		inputList2.add("b");
		LinkedList<String> inputList3 = new LinkedList<>();
		inputList3.add("c");
		inputList3.add("b");
		inputList3.add("a");
		LinkedList<String> inputList4 = new LinkedList<>();
		inputList4.add("c");
		inputList4.add("c");
		inputList4.add("c");
		inputList4.add("c");
		System.out.println(atLeastTwice.atLeastTwice(inputList1).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList2).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList3).toString());
		atLeastTwice.returnList = new LinkedList<>();
		System.out.println(atLeastTwice.atLeastTwice(inputList4).toString());
	}

	LinkedList<String> returnList = new LinkedList<>();

	LinkedList<String> atLeastTwice(LinkedList<String> list) {
		if (list.isEmpty()) {
			return list;
		}
		String firstElement = list.removeFirst();
		if (!returnList.contains(firstElement) && list.contains(firstElement)) {
			returnList.add(firstElement);
		}
		atLeastTwice(list);
		return returnList;
	}
}

