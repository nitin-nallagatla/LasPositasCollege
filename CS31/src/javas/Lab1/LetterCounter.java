package javas.Lab1;

import java.util.Scanner;

public class LetterCounter {
	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {

			// Gets input for sentence.
			System.out.print("Enter the string to search: ");
			String sentence = in.nextLine();

			// Gets input for letter.
			System.out.print("Enter a character for which to search: ");
			String letter = in.next();

			// Defines counter variable.
			int counter = 0;

			// Calculates appearances.
			for (int i = 0; i < sentence.length(); i++) {
				char selected = letter.charAt(0);
				char letterChecker = sentence.charAt(i);
				if (selected == letterChecker) {
					counter++;
				}
			}
			System.out.print("Number of occurances of " + letter + " are/is " + counter + "\n");
		}
	}
}
