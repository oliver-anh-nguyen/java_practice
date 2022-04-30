import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ComputeAverage {

	public static void main(String[] args) {
		HashMap<String, String> scores = new HashMap<String, String>();
		scores.put("John William", "77.5");
		scores.put("Annette Jones", "91.0");
		scores.put("Kevin Specker", "88.8");
		ComputeAverage instance = new ComputeAverage();
		double averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
		
		scores = new HashMap<String, String>();
		averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
		
		scores = null;
		averageScore = instance.computeAverage(scores);
		System.out.println("Average score: " + averageScore);
	}

	public double computeAverage(HashMap<String, String> scores) {
		if (scores == null || scores.isEmpty())
			return 0;
		int size = scores.size();
		return computeSum(scores) / size;
	}

	public double computeSum(HashMap<String, String> scores) {
		if (scores.isEmpty() || scores == null) {
			return 0;
		}

		String keyTop = scores.keySet().iterator().next();
		double score = Double.parseDouble(scores.get(keyTop));
		scores.remove(keyTop);
		return score + computeSum(scores);
	}
	
}

