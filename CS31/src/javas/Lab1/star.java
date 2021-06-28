package javas.Lab1;

import java.util.Scanner;

public class star {
	public static void main(String args[]) {

		// Defines Variables
		int input, j, i, space = 1;

		// Asks for input and creates scanner.
		System.out.print("Enter the number of rows: ");

		Scanner s = new Scanner(System.in);
		input = s.nextInt();
		
		// Defines space for input purposes.
		space = input - 1;

		// Prints spaces before diamond.
		for (i = 1; i <= input; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// Decrements space
			space--;

			// Prints the stars.
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			// Prints newlines.
			System.out.println("");
		}

		// Redefines space.
		space = 1;

		// Prints space after.
		for (i = 1; i <= input - 1; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// Defines space, and creates decreasing side.
			space++;

			for (j = 1; j <= 2 * (input - i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
