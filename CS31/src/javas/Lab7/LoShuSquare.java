package javas.Lab7;

import java.util.Scanner;

public class LoShuSquare {
	public static void main(String[] args) {

		// Calls Lo Shu Check.
		loShuCheck();

	}

	public static void loShuCheck() {
		
		// Initializes and fills array.
		int[][] DDArray = create2DArray();

		// Tests to see if it is a Lo Shu Square or not, and returns result.
		if (verticalChecker(DDArray) == true && horizontalChecker(DDArray) == true && diagonalChecker(DDArray) == true)
			System.out.println("It is a Lo Shu Square.");
		else
			System.out.println("It is not a Lo Shu Square.");
	}

	public static int[][] create2DArray() {

		Scanner s = new Scanner(System.in);

		// Creates array with dimensions 3 and 3.
		int[][] DDArray = new int[3][3];

		// Creates two variables to iterate through array and fills it with input.
		int rowNo = 0;
		int columnNo = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter the value you wish to input at row number " + (columnNo + 1)
						+ " and column number " + (rowNo + 1) + ": ");
				DDArray[i][j] = s.nextInt();
				columnNo++;
			}
			rowNo++;
			columnNo = 0;
		}

		// Prints and returns array.
		printArray(DDArray);
		return DDArray;
	}

	// Method for printing array.
	public static void printArray(int[][] DDArray) {
		for (int[] i : DDArray) {
			for (int j : i) {
				System.out.print(j + "  ");
			}
			System.out.println("\n");
		}

	}

	// Method checks every vertical row to see if it meets conditions and returns
	// result.
	public static boolean verticalChecker(int[][] DDarray) {

		int rowChecker = 1;
		int accumulator = 0;

		boolean row = false;

		for (int[] i : DDarray) {

			for (int j : i) {
				if (rowChecker == 1) {
					accumulator += j;
				}

				else if (rowChecker == 2) {
					accumulator += j;
				}

				else if (rowChecker == 3) {
					accumulator += j;
				}
			}

			if (accumulator == 15)
				row = true;
			else {
				row = false;
				break;
			}
			accumulator = 0;
			rowChecker++;
		}

		if (row == true)
			return true;
		else
			return false;

	}

	// Method checks every horizontal row to see if it meets conditions, and returns result.
	public static boolean horizontalChecker(int[][] DDarray) {

		int accumulator = 0;

		boolean row = false;

		for (int[] i : DDarray) {

			for (int j : i) {
				accumulator += j;
			}

			if (accumulator == 15) {
				row = true;
				break;
			} else {
				row = false;
				break;
			}
		}

		return row;
	}
	
	
	// Checks the diagonal indices, calculates sum, and tests to see if valid.
	public static boolean diagonalChecker(int[][] DDarray) {

		int diagonal1 = DDarray[0][0] + DDarray[1][1] + DDarray[2][2];
		int diagonal2 = DDarray[0][2] + DDarray[1][1] + DDarray[2][0];

		if (diagonal1 == 15 && diagonal2 == 15)
			return true;
		else
			return false;

	}

}
