//Base class Animal
class Animal {
	public void makeSound() {

	}
}

//Subclass Lion extending Animal
class Lion extends Animal {
	// Override makeSound method
	@Override
	public void makeSound() {
		System.out.println("Lion Roar's");
	}
}

//Subclass Elephant extending Animal
class Elephant extends Animal {
	// Override makeSound method
	@Override
	public void makeSound() {
		System.out.println("Elephant Trumpet's");
	}
}

//Subclass Monkey extending Animal
class Monkey extends Animal {
	// Override makeSound method
	@Override
	public void makeSound() {
		System.out.println("Monkey Chatter's");
	}
}

public class ZooManagementSystem {

	public static void main(String[] args) {
		// Creating instances of different animals
		Animal lion = new Lion();

		Animal elephant = new Elephant();

		Animal monkey = new Monkey();

		// Demonstrate polymorphism
		lion.makeSound();
		elephant.makeSound();
		monkey.makeSound();
	}

}
