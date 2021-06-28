package javas.Lab4;

public class MonthMain {

	public static void main(String[] args) {
		
		// Creates month object to test.
		Month m;
		
		// Sample output that uses Month to return every month and its number.
		for (int i = 0; i < 12; i++) {
			m = new Month();
			m.setMonthNumber(i);
			System.out.println("Month " + (m.getMonthNumber() + 1) + " is " + m + ".");
		}
		
		// Test parameterized constructor.
		Month test = new Month(3);
		Month testAgainst = new Month(5);
		
		// Tests toString against getMonthNumbers.
		System.out.println(test.toString());
		
		// Runs all the condition checking classes.
		System.out.println(test.Equals(testAgainst));
		System.out.println(test.GreaterThan(testAgainst));
		System.out.println(test.LesserThan(testAgainst));
		

	}

}
