package javas.Lab1;

import java.util.Scanner;

public class MagicDates {

	public static void main(String[] args) {

		try (
			// Defines variable.
			Scanner s = new Scanner(System.in)) {
			int month, day, year;
			
			// Asks for input.
			System.out.print("Enter month- ");
			month = s.nextInt();
			System.out.print("Enter day- ");
			day = s.nextInt();
			System.out.print("Enter two-digit year- ");
			year = s.nextInt();

			// Returns magicness of date.
			if ((month * day) == year) {
				System.out.println("It's a magic day!");
			}

			else {
				System.out.println("Today isn't magic!");
			}
		}

	}
}
