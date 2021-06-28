package javas.Lab1;

import java.util.Scanner;

class WordGame {
	public static void main(String[] args) {

		// Defines scanner.
		Scanner myObj = new Scanner(System.in);

		// Asks for name, age, city name, college name, profession, animal, and pet
		// name.
		System.out.print("Enter name: ");
		String name = myObj.nextLine();

		System.out.print("Enter age: ");

		String age = myObj.nextLine();

		System.out.print("Enter name of a city: ");
		String city = myObj.nextLine();

		System.out.print("Enter name of a college: ");
		String college = myObj.nextLine();

		System.out.print("Enter profession: ");
		String profession = myObj.nextLine();

		System.out.print("Enter type of animal: ");
		String animal = myObj.nextLine();

		System.out.print("Enter pet's name: ");
		String pname = myObj.nextLine();

		// Returns output.
		System.out.print("There once was a person named  " + name + "  who \n lived in  " + city + ". At the age of " + age
				+ ", \n " + name + " went to college at " + college + "." + name
				+ "\ngraduated and went to work as a \n" + profession + ". Then, " + name + " adopted a(n)\n "
				+ animal + " named " + pname + ". They both lived \nhappily ever after!\n");

	}
}
