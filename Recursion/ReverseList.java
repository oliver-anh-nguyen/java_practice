import java.util.List;
import java.security.DrbgParameters.Reseed;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		ReverseList mainClass = new ReverseList();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		List<String> result = mainClass.reverseListRecursively(list);
		System.out.println("result: " + result.toString());
	}

	private List<String> reverseListRecursively(List<String> list) {
		if (list.isEmpty()) {
			return list;
		}
		List<String> reversed = new ArrayList<>();
		String lastItem = list.remove(list.size()-1);
		reversed.add(lastItem);
		reversed.addAll(reverseListRecursively(list));
		return reversed;
	}
}

