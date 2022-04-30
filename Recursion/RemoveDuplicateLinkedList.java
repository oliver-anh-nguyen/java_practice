import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDuplicateLinkedList {

	public static void main(String[] args) {
		RemoveDuplicateLinkedList mainClass = new RemoveDuplicateLinkedList();

		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		LinkedList<String> result = mainClass.removeDuplications(list);
		System.out.println("Result: " + result.toString());
	}

	// LinkedList<String> result = new LinkedList<>();
	// LinkedList<String> removeDuplications(LinkedList<String> list) {
	// 	if (list.isEmpty()) {
	// 		return list;
	// 	}
	// 	String lastItem = list.removeLast();
	// 	if (!result.contains(lastItem) && !list.contains(lastItem)) {
	// 		result.add(lastItem);
	// 	}
	// 	removeDuplications(list);
	// 	return result;
	// }

	LinkedList<String> removeDuplications(LinkedList<String> list) {
		if (list.isEmpty()) {
			return list;
		}
		LinkedList<String> result = new LinkedList<>();
		String lastItem = list.removeLast();
		if (list.size() > 0) {
			result.addAll(removeDuplications(list));
		}
		if (!result.contains(lastItem)) {
			result.add(lastItem);
		}
		return result;
	}	
}

