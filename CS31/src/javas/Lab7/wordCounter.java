package javas.Lab7;

import java.util.Scanner;

public class wordCounter {
	public static void main(String[] args) {

		// Initializes scanner, gets input string, and calls wordSize.
		Scanner s = new Scanner(System.in);

		System.out.print("Input your string: ");
		String input = s.nextLine();

		wordSize(input);
	}

	// Returns the number of words. 
	public static int wordSize(String str) {
		
		// Removes trailing and leading songs.
		str = str.strip();

		// Splits string by spaces and stores in new char array.
		String[] strSplit = str.split(" ");

		// Initializes counter.
		int result = 0;
		
		// Counts words, and returns output (unless size is 0, in which case it returns 0).
		if (str.length() > 0) {
			for (String i : strSplit) {
				result++;
			}
		}
		else
			result = 0;

		// Outputs result.
		System.out.println(result);

		return result;
	}
}
