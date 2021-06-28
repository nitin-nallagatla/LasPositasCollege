package javas.Lab2;

import java.util.Scanner;

// Defines class that converts Fahrenheit to Celsius.
public class FarToCel {
	public double celsius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static void main(String arg[]) {

		// Defines the input double and gets the Fahrenheit temperature.
		double input;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Fahrenheit temperature: ");
			input = sc.nextDouble();
		}

		// Creates a fahrenheit object and a result that holds the object's celsius
		// value.
		FarToCel fahrenheit = new FarToCel();

		double result = fahrenheit.celsius(input);

		// Returns celsius temperature.
		System.out.print("Celsius temperature is " + result + " degrees Celsius.\n");

		System.out.println("Fahrenheit            |	Celsius");
		// Returns the output for all numbers one through twenty.
		for (int i = 0; i <= 20; i++) {

			// Corrects spacing.
			if (i < 10) {
				System.out.println(" " + i + " degrees Fahrenheit | " + fahrenheit.celsius(i) + " degrees Celsius");
			} else {
				System.out.println(i + " degrees Fahrenheit | " + fahrenheit.celsius(i) + " degrees Celsius");
			}
		}
	}
}