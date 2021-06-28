package javas.lab5;

import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class magic8Ball {

	public static void main(String[] args) {
		try { // Needs try and catch to work.

			// Defines the loop reseter and scanner.
			String start = "y";
			Scanner s = new Scanner(System.in);

			// Loop continues the program until user wants to quit.
			while (start.equals("y")) {
				System.out.print("Enter your yes/no query: ");
				s.nextLine();

				reader();

				System.out.print("Want to try again? [y/n]: ");
				start = s.nextLine();
			}
		}

		// Catch is necessary.
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void reader() throws IOException {

		// Accesses file, creates a buffered reader to read it, and defines the array
		// list that we'll store responses in.
		File file = new File("C:\\Users\\Nitin\\eclipse-workspace\\cs7\\CS7\\src\\javas\\lab5\\8_ball_responses.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> responses = new ArrayList<String>();

		// Generates the random line number
		double lineChoser = Math.random();
		int lineChosen = (int) (lineChoser * 12);

		// Initializes empty string variable we'll use to make the array.
		String st;

		// Test to see if each line has content in it, and adds it to array.
		while ((st = br.readLine()) != null) {
			responses.add(st);
		}

		// Returns 8 ball result.
		System.out.println(responses.get(lineChosen));

	}

}
