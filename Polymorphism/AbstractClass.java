import java.util.List;
import java.util.ArrayList;

public final class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		Chicken chicken = new Chicken();

		List<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(cat);
		animals.add(chicken);

		int sum = 0;
		for (Animal animal : animals) {
			sum += animal.countFingers();
		}
		System.out.println("Total finger: " + sum);
	}

	
}

class Dog extends Animal {
	@Override
	public int countFingers() {
		// TODO Auto-generated method stub
		return 4;
	}
}

class Cat extends Animal {
	@Override
	public int countFingers() {
		// TODO Auto-generated method stub
		return 4;
	}
}

class Chicken extends Animal {
	@Override
	public int countFingers() {
		// TODO Auto-generated method stub
		return 2;
	}
}

abstract class Animal {
	abstract public int countFingers();
}

// class Cow implements Animal2 {
// 	@Override
// 	public int countFingers() {
// 		// TODO Auto-generated method stub
// 		return 0;
// 	}
// }

// interface Animal2 {
// 	public int countFingers();
// }