import java.util.List;
import java.util.ArrayList;

public final class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeeMaker vee = new VeeMaker();
		HatMaker hat = new HatMaker();
		ParallelMaker parallel = new ParallelMaker();
		List<Maker> list = new ArrayList<>();
		list.add(hat);
		list.add(hat);
		list.add(vee);
		list.add(parallel);
		String result = "";
		for (Maker make : list) {
			result += make.getFigure() + " ";
		}
		System.out.println(result);
	}
}

class VeeMaker implements Maker {
	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "\\/";
	}
}

class ParallelMaker implements Maker {
	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "||";
	}
}

class HatMaker implements Maker {
	@Override
	public String getFigure() {
		// TODO Auto-generated method stub
		return "/\\";
	}
}


interface Maker {
	public String getFigure();
}
