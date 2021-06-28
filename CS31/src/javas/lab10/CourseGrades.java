package javas.lab10;

import java.util.Scanner;

// Uses Graded Activity method provided by professor.

public class CourseGrades implements Analyzable {
	public GradedActivity[] grades = new GradedActivity[4];

	public CourseGrades() {
		Scanner s = new Scanner(System.in);
		
		// Initializes every value in grades array;
		for(int i = 0; i < grades.length; i++) {
			grades[i] = new GradedActivity();
		}
		
		// Fills array.
		System.out.print("Enter score 1: ");
		double num = s.nextDouble();
		grades[0].setScore(num);

		System.out.print("Enter score 2: ");
		num = s.nextDouble();
		grades[1].setScore(num);

		System.out.print("Enter score 3: ");
		num = s.nextDouble();
		grades[2].setScore(num);

		System.out.print("Enter score 4: ");
		num = s.nextDouble();
		grades[3].setScore(num);

	}

	// Calculates average score.
	public double getAverage() {
		double sum = 0;
		for (GradedActivity i : grades) {
			sum += i.getScore();
		}

		return (sum / grades.length);

	}

	// Returns reference to highest GradedActivity object.
	public GradedActivity getHighest() {

		double max = Integer.MIN_VALUE;
		int tracker = 0;
		int index = 0;

		for (GradedActivity i : grades) {

			if (i.getScore() > max) {
				max = i.getScore();
				index = tracker;
			}

			tracker++;
		}

		return grades[index];
	}

	// Returns reference to lowerst GradedActivity object.
	public GradedActivity getLowest() {
		double min = Integer.MAX_VALUE;
		int tracker = 0;
		int index = 0;

		for (GradedActivity i : grades) {

			if (i.getScore() < min) {
				min = i.getScore();
				index = tracker;
			}

			tracker++;
		}

		return grades[index];
	}

	// Main method to test programs.
	public static void main(String[] args) {
		CourseGrades test = new CourseGrades();

		System.out.println("The average is " + String.format("%.2f", test.getAverage()));
		System.out.println("The reference of the highest value is " + test.getHighest());
		System.out.println("The reference of the lowest value is " + test.getLowest());
	}
}
