package javas.Lab1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		try (Scanner keyboard = new Scanner(System.in)) {

			// Gets input.
			System.out.println("Enter the num:");

			// Defines Variables.
			int num = keyboard.nextInt();
			int sum = 0;

			// Finds the sum.
			for (int i = 1; i <= num; ++i) {
				sum += i;
			}

			// Returns output.
			System.out.println("Sum = " + sum);
		}
	}
}
