package javas.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_array {

	// Creates scanner and 2d array.
	Scanner s = new Scanner(System.in);

	public int[][] create2DArray() {

		// Fills array dimensions with input.
		System.out.print("Pick array height: ");
		int height = s.nextInt();

		System.out.print("Pick array length: ");
		int length = s.nextInt();

		// Creates array with dimensions `
		int[][] DDArray = new int[height][length];

		// Creates two variables to iterate through array and fills it with input.
		int rowNo = 0;
		int columnNo = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < length; j++) {
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

	// Method to print every value in array.
	public void printArray(int[][] DDArray) {
		for (int[] i : DDArray) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println("\n");
		}

	}

	// Creates accumulator and accumulates total value of array.
	public int getTotal(int[][] DD) {

		int accumulator = 0;
		for (int[] i : DD) {
			for (int j : i) {
				accumulator += j;
			}
		}

		return accumulator;
	}

	// Calls getTotal and divides by volume of array to get average.
	public double getAverage(int[][] DDArray) {

		int total = getTotal(DDArray);

		int height = 0;
		int length = 0;
		for (int i[] : DDArray) {
			length = 0;
			for (int j : i) {
				length++;
			}
			height++;
		}

		double sizeOfArray = height * length;

		return (total / sizeOfArray);

	}

	// Method to get length.
	public int length(int[][] DDArray) {
		int length = 0;
		for (int i[] : DDArray) {
			length = 0;
			for (int j : i) {
				length++;
			}
		}
		return length;
	}

//	Method to get height.
	public int height(int[][] DDArray) {

		int height = 0;
		for (int i[] : DDArray) {
			height++;
		}

		return height;
	}

	// Calculates total of specific row using accumulator and value to check for
	// row.
	public double getRowTotal(int[][] DDArray, int rowNumber) {

		int rowChecker = 1;
		int height = height(DDArray);
		int length = length(DDArray);

		int accumulator = 0;
		for (int[] i : DDArray) {
			if (rowChecker == rowNumber) {
				for (int j = 0; j < length; j++) {
					accumulator += i[j];
				}
			}
			rowChecker++;
		}

		return accumulator;

	}

	// Returns total value of columns using methods similar to getRowTotal.
	public double getColumnTotal(int[][] DDArray, int columnNumber) {
		int colChecker = 1;

		int height = height(DDArray);
		int length = length(DDArray);

		int accumulator = 0;
		for (int[] i : DDArray) {
			colChecker = 1;

			for (int j : i) {
				if (colChecker == columnNumber) {
					accumulator += j;
					colChecker++;
				} else
					colChecker++;

			}
		}

		return accumulator;

	}

}
