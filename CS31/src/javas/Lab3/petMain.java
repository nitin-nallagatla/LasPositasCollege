package javas.Lab3;

public class petMain {
	public static void main(String[] args) {

		// Creating object and then calling no-arg constructor.
		Pet myPet = new Pet();
		// Creating object and then calling parameterized constructor.
		Pet myOtherPet = new Pet("Sparda", "Cat", 32);

		// Returns all fields of myOtherPet.
		myOtherPet.getName();
		myOtherPet.getAnimal();
		myOtherPet.getAge();

		// Sets all fields of myPet.
		myPet.setName("Zanza");
		myPet.setAnimal("Dog");
		myPet.setAge(45);

		// Gets all fields of myPet.
		myPet.getName();
		myPet.getAnimal();
		myPet.getAge();
	}
}
