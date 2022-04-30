import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class SumList {

	public static void main(String[] args) {
		SumList mainClass = new SumList();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int sum = mainClass.sum(list);
		System.out.println(sum);
	}

    int sum(List<Integer> list) {
		if (list.isEmpty()) {
			return 0;
		}
		Integer last = list.remove(0);
		return last + sum(list);
 	}
}

