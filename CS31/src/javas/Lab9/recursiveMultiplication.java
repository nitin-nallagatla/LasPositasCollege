package javas.Lab9;

import java.util.Scanner;

public class recursiveMultiplication {

	public int count = 0;

	public static void main(String[] args) {

		// Creates scanner and gets input.
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to multiply! ");
		int multi = s.nextInt();

		System.out.print("Enter the number of repeats! ");
		int repeats = s.nextInt();

		System.out.println(recursiveMultiplication(multi, repeats));

	}

	// Does the bulk of the work.
	public static int recursiveMultiplication(int x, int y) {

		// Decrements y to prevent excessive multiplication. 
		y--;

		// Multiplies x as many times a necessary by calling function again. 
		if (y > 0) {
			x += recursiveMultiplication(x, y);
		}

		// Returns result. 
		return x;

	}

}
