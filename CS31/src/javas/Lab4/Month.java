
package javas.Lab4;

public class Month {

	// Creates list with all the month names.
	String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	// Sets month number.
	int monthNumber = 0;

	// Creates no-arg constructor.
	public Month() {
		monthNumber = 1;
	}

	// Test to see if input is valid and assigns the value to monthNumber.
	public Month(int monthNumber) {
		if ((monthNumber < 1) || (monthNumber > 12)) {
			this.monthNumber = 1;
		} else {
			this.monthNumber = monthNumber;
		}

	}

	//  Assigns the name of the month to the number.
	public Month(String monthName) {
		monthNumber = monthName.indexOf(monthName);
	}

	// Returns month number.
	public int getMonthNumber() {
		return monthNumber;
	}

	// Sets monthNumber to the input.
	public void setMonthNumber(int monthNumberInput) {
		monthNumber = monthNumberInput;
	}

	// Does the same thing as getMonthNumber.
	public String toString() {
		return monthName[monthNumber];
	}


	// Checks if the argument and monthNumber are equal.
	public boolean Equals(Month m)
	{
		if (this.monthNumber == m.getMonthNumber())
			return true;
		else
			return false;
	}

	// Checks if monthNumber is greater than argument.
	public boolean GreaterThan(Month m1)
	{
		if (monthNumber > m1.monthNumber)
			return true;
		else
			return false;
	}


	// Checks if monthNumber is less than argument.
	public boolean LesserThan(Month m1)
	{
		if (monthNumber < m1.monthNumber)
			return true;
		else
			return false;
	}
}