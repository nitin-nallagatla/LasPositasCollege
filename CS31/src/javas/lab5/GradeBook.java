package javas.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
	private String name;
	private double[] test = new double[4];

	// No-arg constructor.
	public GradeBook() {
		name = " ";
	}

	// 2 Arg constructor, sets name and test equal to those values.
	public GradeBook(String n, double[] t) {
		name = n;
		test = t;

	}

	// Setter and getter for name.
	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	// Setter and getter for test array, using i for index value.
	public void setTest(double t, int i) {
		test[i] = t;
	}

	public double getTest(int i) {
		return test[i];
	}

	// Returns average of the test by calculating sum with an accumulator and dividing by length.
	public double getTestAvg() {

		double sum = 0;
		double avg;
		for (int i = 0; i < test.length; i++) {
			sum += test[i];
		}
		avg = sum / test.length;
		return avg;
	}

	// Returns letter grade based and getTestAvg's results.
	public char getLetterGrade() {

		double average = getTestAvg();
		char grade = 0;

		if (average >= 90)
			grade = 'A';
		else if (average >= 80)
			grade = 'B';
		else if (average >= 70)
			grade = 'C';
		else if (average >= 60)
			grade = 'D';
		else if (average < 60)
			grade = 'F';

		return grade;
	}

	// This returns output.
	public String toString() {
		String str = "";
		str += "\nName of student: " + name;
		str += "\nAverage test score: " + getTestAvg();
		str += "\nLetter grade: " + getLetterGrade() + "\n";
		return str;
	}
	
	// Gets the input for student, and validates input and adds to test array.
	public double getStudentData(GradeBook[] array) {

		Scanner scan = new Scanner(System.in);
		String[] student = new String[5];
		double[] test = new double[4];

		for (int i = 0; i < student.length; i++) {

			System.out.println("Enter the name of the student : ");
			student[i] = scan.nextLine();

			for (int j = 0; j < test.length; j++) {
				System.out.println("Enter score " + (j + 1) + " for the student");
				test[j] = scan.nextDouble();

				while (test[j] < 0 || test[j] > 100) {
					System.out.println("Enter score " + (j + 1) + " for the student: ");
					test[j] = scan.nextDouble();
				}

				scan.nextLine();
			}

			// This segment drops the lowest value and returns the result.
			Arrays.sort(test);

			
			double[] test1 = new double[3];
			
			for (int add = 1; add < test.length; add++) {
				test1[add - 1] = test[add];
			}
			

			
			array[i] = new GradeBook(student[i], test1);

			System.out.println(array[i]);
		}

		return 0;

	}
}