package javas.lab5;

import java.util.ArrayList;
import java.util.Arrays;

public class DriverExam {

	// Creates input dictionary and answer key.
	public String[] studentChoices;
	public static String[] answers = { "b", "d", "a", "a", "c", "a", "b", "a", "c", "d", "b", "c", "d", "a", "d", "c",
			"c", "d", "d", "a" };

	// Returns the number of correct responses by iterating over studentChoices and
	// answers and comparing each value.
	public int totalCorrect(String[] studentChoices) {

		int count = 0;
		for (String lower : studentChoices) {
			studentChoices[count] = lower.toLowerCase();
			count++;
		}

		int right = 0;
		int counter = 0;

		for (String i : studentChoices) {

			if (i.equals(answers[counter]))
				right += 1;

			counter += 1;
		}

		return right;

	}

	// Returns the number of incorrect responses by iterating over studentChoices and
	// answers and comparing each value.
	public int totalIncorrect(String[] studentChoices) {

		int count = 0;
		for (String lower : studentChoices) {
			studentChoices[count] = lower.toLowerCase();
			count++;
		}

		int wrong = 0;
		int counter = 0;

		for (String i : studentChoices) {

			if (i.equals(answers[counter]) == false)
				wrong += 1;

			counter += 1;
		}

		return wrong;

	}

	// Returns the number of missed responses by doing the same thing totalIncorrect does, but stores responses in another array. Returns that when complete.
	public ArrayList<Integer> questionsMissed(String[] studentChoices) {
		ArrayList<Integer> missed = new ArrayList<Integer>();

		int count = 0;
		for (String lower : studentChoices) {
			studentChoices[count] = lower.toLowerCase();
			count++;
		}

		int questionNo = 0;

		for (String i : studentChoices) {

			if (i.equals(answers[questionNo]) == false)
				missed.add(questionNo + 1);
			questionNo++;

		}
		if (missed.size() == 0)
			System.out.println("All Correct!");
		else
			System.out.println(missed);
		return missed;

	}

	// Tests to see if you passed by calling the class within itself. 
	public boolean passed(String[] studentChoices) {

		DriverExam outcome = new DriverExam();

		if (outcome.totalCorrect(studentChoices) >= 15)
			return true;
		else
			return false;
	}

}
