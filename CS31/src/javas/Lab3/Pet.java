package javas.Lab3;

public class Pet {

	// Initializes variables.
	private String name;
	private String animal;
	private int age;

	// Creates no-arg constructor.
	public Pet() {

	}

	// Creates parameterized constructor.
	public Pet(String inputName, String inputAnimal, int inputAge) {
		this.setName(inputName);
		this.setAnimal(inputAnimal);
		this.setAge(inputAge);
	}

	// Creates name setter.
	public void setName(String name) {
		this.name = name;
	}

	// Creates animal setter.
	public void setAnimal(String animal) {
		this.animal = animal;
	}

	// Creates age setter.
	public void setAge(int age) {
		this.age = age;
	}

	// Creates name getter.
	public String getName() {
		System.out.println(name);
		return name;
	}

	// Creates animal getter.
	public String getAnimal() {
		System.out.println(animal);
		return animal;
	}

	// Creates age getter.
	public int getAge() {
		System.out.println(age);
		return age;
	}
}
