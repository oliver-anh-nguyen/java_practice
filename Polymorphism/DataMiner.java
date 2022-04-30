import java.util.List;
import java.util.ArrayList;

public class DataMiner {

	public interface Shape {
		public double computeArea();
	}
	
	class Rectangle implements Shape {
		double width;
		double height;
	
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}
	
		@Override
		public double computeArea() {
			// TODO Auto-generated method stub
			return width * height;
		}
	}
	
	class Circle implements Shape {
		double radius;
	
		public Circle(double r) {
			this.radius = r;
		}
	
		@Override
		public double computeArea() {
			// TODO Auto-generated method stub
			return Math.PI * radius * radius;
		}
	}
	
	public static void main(String[] args) {
		DataMiner data = new DataMiner();
		List<Shape> populatedList = data.populatedList();
		double average = data.computeAverageArea(populatedList);
		System.out.println("Average area: " + average);
	}

	public double computeAverageArea(List<Shape> objects) {
		if (objects == null || objects.size() == 0) {
			return 0;
		}
	
		double average = 0;
		double sumArea = 0;
	
		for (Shape shape: objects) {
			sumArea += shape.computeArea();
		}
	
		average = sumArea / objects.size();
		return average;
	}
	
	public List<Shape>populatedList() {
		List<Shape> populateList = new ArrayList<>();
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(4);
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(5, 6);
		populateList.add(c1);
		populateList.add(r1);
		populateList.add(r2);
		populateList.add(c2);
		return populateList;
	}
}



