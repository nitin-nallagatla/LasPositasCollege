package javas.Lab7;

import java.lang.Math;
import java.util.Scanner;

public class espGame {

	public static void main(String[] args) {
		// Calls randomizer function.
		randomizer();
	}

	public static void randomizer() {

		// Initializes scanner and counter variables.
		Scanner s = new Scanner(System.in);

		int count = 0;

		// Repeats loop 10 times and counts score.
		for (int i = 0; i < 10; i++) {

			// Initializes color number.
			int color = (int)(Math.random() * 5);

			// Gets player input.
			System.out.print("Please input your guess: ");
			String playerChoice = (s.nextLine()).toLowerCase();

			// Creates the color based on colors class and the number. 
			String cpuColor = colors(color);

			System.out.println("The color was " + cpuColor + " and your guess was " + playerChoice + ".\n");

			// Counts the number of wins.
			if (cpuColor.equals(playerChoice))
				count++;

		}

		// Returns result.
		System.out.println("You were correct " + count + " times.");
		System.out.println();

	}

	// Method returns a string form of the color.
	public static String colors(int colorNumber) {

		String color = "";

		if (colorNumber == 0)
			color = "red";
		else if (colorNumber == 1)
			color = "green";
		else if (colorNumber == 2)
			color = "blue";
		else if (colorNumber == 3)
			color = "orange";
		else if (colorNumber == 4)
			color = "yellow";

		return color;

	}
	
}
