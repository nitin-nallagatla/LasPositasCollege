package javas.Lab2;

import java.util.Scanner;

public class ShowChar {

	// showChar class takes a string and index value and returns the character at
	// the index.
	public static void showChar(String str, int keyIndex) {
		System.out.print(str.charAt(keyIndex) + "\n");
	}

	public static void main(String[] args) {
		// Defines input and index key variables.
		String input;
		int key;

		try (Scanner s = new Scanner(System.in)) {

			// Asks for text.
			System.out.print("Enter the text: ");
			input = s.nextLine();

			// Asks for key.
			System.out.print("Enter your index key: ");
			key = s.nextInt();
		}

		// Tests for length viability.
		if (input.length() > key)
			showChar(input, key);
		else
			System.out.print("Index is greater than the length of the text\n");

	}
}
