import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		RemoveDuplicateArrayList mainClass = new RemoveDuplicateArrayList();
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("3");
		list.add("1");
		ArrayList<String> result = mainClass.removeDuplications(list);
		System.out.println("result: " + result.toString());

		list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("3");
		list.add("1");
		result = mainClass.removeDupsHead(list);
		System.out.println("result remove duplicate from head: " + result.toString());
	}

	ArrayList<String> result = new ArrayList<>();

	ArrayList<String> removeDuplications(ArrayList<String> list) {
		if (list.isEmpty()) {
			return list;
		}
		String firstItem = list.remove(0);
		if (!result.contains(firstItem) && !list.contains(firstItem)) {
			result.add(firstItem);
		}
		removeDuplications(list);
		return result;
 	}

	public ArrayList<String> removeDupsHead(List<String> input) {
		ArrayList<String> result = new ArrayList<String>();
		if (input.isEmpty()) {
			return result;
		}
		String item = input.remove(0);
		if (!input.contains(item)) {
			result.add(item);
		}
		result.addAll(removeDupsHead(input));
		return result;
	}
}

