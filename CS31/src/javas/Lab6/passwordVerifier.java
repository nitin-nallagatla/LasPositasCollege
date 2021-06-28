package javas.Lab6;

import java.util.Scanner;

public class passwordVerifier {

	// Constructor runs bulk of the program.
	public passwordVerifier() {

		// Initializes scanner and loop variable.
		Scanner s = new Scanner(System.in);
		
		boolean retry = false;

		// Gets initial input.
		System.out.println("Please enter your new password. It should be over 6 digits long, have one upper case and lower case character, and have at least 1 digit: ");
		String input = s.nextLine();

		while (retry != true) {

			// Tests for validity, returning a variety of error messages along the way.
			if (lengthChecker(input) == true && caseChecker(input) == true && digitChecker(input) == true) {
				System.out.println("That's a valid password. ");
				retry = true;
			}
			
			else if (lengthChecker(input) == false) {
				System.out.println("The password's length should be over 6 characters.");
				System.out.println("Please enter a valid password: ");
				input = s.nextLine();
			}
			
			else if (caseChecker(input) == false) {
				System.out.println("The password should have 1 upper case and 1 lower case character.");
				System.out.println("Please enter a valid password: ");
				input = s.nextLine();
			}
			
			else if (digitChecker(input) == false) {
				System.out.println("The password should have at least 1 digit in it.");
				System.out.println("Please enter a valid password: ");
				input = s.nextLine();
			}
			
			else {
				System.out.println("Please enter a valid password: ");
				input = s.nextLine();
			}

		}
	}

	// Checks to see if string has valid length.
	public static boolean lengthChecker(String str) {

		boolean result = false;

		if (str.length() >= 6)
			result = true;

		return result;
	}

	// Checks to see if the string has 1 uppercase and 1 lowercase character.
	public static boolean caseChecker(String str) {

		boolean upperCase = false;
		boolean lowerCase = false;
		char[] strArray = str.toCharArray();

		for (char i : strArray) {
			if (Character.isUpperCase(i) == true)
				upperCase = true;
			if (Character.isLowerCase(i) == true)
				lowerCase = true;
		}

		boolean result = false;

		if (upperCase == true && lowerCase == true) {
			result = true;
		}

		return result;
	}
	
	// Checks to see if the string has a digit in it.
	public static boolean digitChecker(String str) {

		boolean result = false;

		for (int i = 0; i < str.length(); i++) {
			
			if (Character.isDigit(str.charAt(i)))
			result = true;
		
		}

		return result;
	}

}
