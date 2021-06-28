package javas.Lab2;

import java.util.Random;

public class Even {

	public static boolean isEven(int number) {
		// Tests for even or odd.
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		// Defines a randomizer object, and two counters.
		Random r = new Random();
		int even = 0, odd = 0;

		// Creates 100 integers.
		for (int i = 0; i < 100; ++i) {
			int number = r.nextInt();

			// Counts the evens and odds.
			if (isEven(number))
				++even;
			else
				++odd;
		}

		// Returns results.
		System.out.println("Number of Even numbers: " + even);
		System.out.println("Number of Odd numbers: " + odd);

	}

}
