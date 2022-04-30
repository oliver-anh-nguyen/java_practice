import java.util.HashMap;
import java.util.TreeMap;

public final class MyTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You"); 

		int topKey = tree_map.keySet().iterator().next();
		System.out.println("top key: " + topKey);

		String topValue = tree_map.values().iterator().next();
		System.out.println("top value: " + topValue);

		for (int key : tree_map.keySet()) {
			System.out.println("Loop key: " + key);
		}

		for (String value : tree_map.values()) {
			System.out.println("Loop value: " + value);
		}

		System.out.println("TreeMap: " + tree_map);

		HashMap<String, Integer> map = new HashMap<>();
		map.put("vishal", 10);
		map.put("sachin", 30);
        map.put("vaibhav", 20);
 
		
        // Print size and content of the Map
        System.out.println("Size of map is: "+ map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
	}
}
