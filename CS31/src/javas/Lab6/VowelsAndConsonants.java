package javas.Lab6;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		
		// Calls chosenInput method.
		chosenInput();
	}

	// Gets the input string and converts it to lower case.
	public static String introStatement() {
		Scanner s = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String inputString = s.nextLine();
		System.out.println();

		inputString = inputString.toLowerCase();

		return inputString;
	}

	// Prints out the menu of actions, and gets and returns the chosen action.
	public static String menu() {
		Scanner s = new Scanner(System.in);

		System.out.print("What would you like to do? \n" + "\ta: Count the number of vowels in your string.\n "
				+ "\tb: Count the number of consonants in the string.\n "
				+ "\tc: Count the number of both consonants and vowels in the string.\n "
				+ "\td: Enter another string.\n " + "\te: Exit.\n" + "Input: ");

		String action = s.nextLine();

		return action;
	}

	// Checks to see what the user picked, and executes corresponding code.
	public static void chosenInput() {

		String action = "a";

		// Repeats until user exits.
		while (action.equals("e") == false) {

			String inputString = introStatement();
			action = menu().toLowerCase();

			// Returns response to menu()'s chosen action. If 'd' is chosen or invalid input
			// given, call the function again. If 'e' is chosen, do nothing.
			if (action.equals("a")) {
				System.out.println("The number of vowels is " + countVowel(inputString) + ".\n");
			}
			
			else if (action.equals("b")) {
				System.out.println("The number of consonants is " + countConsonant(inputString) + ".\n");
			}
			
			else if (action.equals("c")) {
				System.out.println(
						"The number of vowels is " + countVowel(inputString) + " and the number of consonants is "
								+ countConsonant(inputString) + ". The total number of both is "
								+ (countVowel(inputString) + countConsonant(inputString) + ".\n"));
				}
			else if (action.equals("d")) {
				chosenInput();
			}
			
			else if (action.equals("e")) {
				System.out.println("Bye!");
				break;
			}
			
			else {
				System.out.println("I don't understand. Please try again.\n");
				chosenInput();
			}

		}
	}

	// Counts the number of vowels in a string.
	public static int countVowel(String str) {

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				counter++;
			}
		}

		return counter;
	}

	// Counts the number of consonants in a string.
	public static int countConsonant(String str) {

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u' && str.charAt(i) != '.' && str.charAt(i) != ',' && str.charAt(i) != '!' && str.charAt(i) != '\'') {
				counter++;
			}
		}

		return counter;
	}
}
