import java.util.List;
import java.util.ArrayList;

public final class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control control = new Control();
		List<Polygon> shapes = new ArrayList<>();
		shapes.add(new Pentagon(4.0));
		shapes.add(new EquilateralTriange(5.0));
		shapes.add(new Rectangle(2, 3));
		System.out.println("Sum perimeter: " + control.computeSum(shapes));
	}

	
}

class Control {
	double computeSum(List<Polygon> shapes) {
		double sum = 0;
		for (int i=0; i<shapes.size(); i++) {
			Polygon polygon = shapes.get(i);
			sum += polygon.computePerimeter();
		}
		return sum;
	}
}

interface Polygon {
	double computePerimeter();
}

class Pentagon implements Polygon {
	double size;

	Pentagon(double size) {
		this.size = size;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 5 + size;
	}
}

class EquilateralTriange implements Polygon {
	double a;

	EquilateralTriange(double a) {
		this.a = a;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 3 * a;
	}

}

class Rectangle implements Polygon {
	double width;
	double height;

	Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (width*height) *2;
	}
}
