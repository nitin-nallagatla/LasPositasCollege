package javas.Lab1;

import java.util.Scanner;

public class Mass {
	public static void main(String[] args) {

		// Create a Scanner object.
		Scanner keyboard = new Scanner(System.in);

		// Get input.
		System.out.println("Enter the object's mass:");
		double mass = keyboard.nextDouble();

		// Closed Scanner.
		keyboard.close();

		// Defines weight using formula, and returns how heavy it is.
		double weight = mass * 9.8;
		if (weight > 1000) {
			System.out.println("It is too heavy.");
		} else if (weight < 10) {
			System.out.println("Object is too light");
		} else {
			System.out.println("Object weight is " + weight);
		}
	}
}
