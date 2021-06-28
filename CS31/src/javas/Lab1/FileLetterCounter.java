package javas.Lab1;

import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {

	public static void main(String[] args) throws IOException {

		try (Scanner input = new Scanner(System.in)) {

			// Get file name
			System.out.print("Enter file name: ");
			String fileName = input.nextLine();

			// Create file
			File file = new File(fileName + ".txt");

			// Check if file exists.
			if (!file.exists()) {
				System.out.println("The file " + fileName + ".txt does not exist.");
				System.exit(0);
			}

			// Create scanner that will open the file.
			Scanner inFile = new Scanner(file);

			// Get sought out character.
			System.out.println("Enter a single character: ");
			String charInput = input.nextLine();
			char character = charInput.charAt(0);

			// Create line variable.
			String line;

			// Create counter.
			int count = 0;

			// Declares loops to read over the letters of every line.
			while (inFile.hasNext()) {
				line = inFile.nextLine();
				for (int j = 0; j < line.length(); j++) {
					if (line.charAt(j) == character) {
						count += 1;
					}
				}
			}

			// Display character count
			System.out.println("The character " + character + " appears in the file " + count + " times.");

			// Close file
			inFile.close();
		}
	}
}
