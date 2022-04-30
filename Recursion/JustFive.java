import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class JustFive {

	public static void main(String[] args) {
		getJustFive();
	}

	static public int size = 0;

	static public JustFive getJustFive() {
		ArrayList<JustFive> justFiveInstances = null;
		if (justFiveInstances == null) {
			justFiveInstances = new ArrayList<>();
		}

		if (justFiveInstances.size() < 5) {
			justFiveInstances.add(new JustFive());
			return justFiveInstances.get(size - 1);
		}

		throw new IndexOutOfBoundsException("Out of size");
	}
}

