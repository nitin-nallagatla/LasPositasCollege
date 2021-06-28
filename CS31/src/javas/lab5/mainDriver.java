package javas.lab5;
import java.util.Scanner;

public class mainDriver {

	public static void main(String[] args) {
		
		// Initializes variables to get input.
		Scanner s = new Scanner(System.in);
		
		String[] input = new String[20];
		
		// Fills input dictionary.
		for(int i = 0; i < 20; i++) {
			System.out.print("Enter your answer for number " + (i+1) + ": ");
			input[i] = s.nextLine();
		}
		
		// Creates test object, and calls the methods it has.
		DriverExam test = new DriverExam();

		System.out.println("Number Correct: " + test.totalCorrect(input));
		System.out.println("Number Wrong: " + test.totalIncorrect(input));
		test.questionsMissed(input);
		System.out.println("Did you pass? " + test.passed(input));
	
		s.close();


	}

}
