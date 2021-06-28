package javas.Lab11;

import java.util.Scanner;

public class testScores extends Exception {

	public static Scanner s = new Scanner(System.in);
	int[] testScores;

	public testScores(int[] testScores) throws InvalidTestScore {
		boolean valid = true;
		for (int i : testScores) {
			if (i < 0 || i > 100)
				throw new InvalidTestScore();
		}

		this.testScores = new int[testScores.length];
		for (int i = 0; i < testScores.length; i++) {
			this.testScores[i] = testScores[i];
		}
			System.out.println("The average is " + average(testScores) + ". ");

	}

	public double average(int[] scores) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			count++;
		}
		return (sum / count);

	}

	public static void main(String[] args) {
		try {
			System.out.print("How many values would you like to put in the array? ");
			int repeat = s.nextInt();
			int[] array = new int[repeat];

			for (int i = 0; i < repeat; i++) {
				System.out.print("Enter Score " + (i + 1) + ": ");
				array[i] = s.nextInt();
			}

			testScores test1 = new testScores(array);

		}

		catch (InvalidTestScore e) {
			e.printStackTrace();
		}
	}

}
