package javas.Lab4;

public class areaMain {
	public static void main(String[] args) {
		// We don't have to create instances like we do normally as all the methods are
		// defined as static overloaded functions. This helps save memory, as the
		// computer doesn't have to store the instance as well.

		// Calculates area of rectangle with following parameters.
		Area.areaCalc(5.0, 4.5, "Rectangle");

		// Calculates area of cylinder with the following parameters.
		Area.areaCalc(12.0, 6.0);

		// Calculates area of circle with following parameters.
		Area.areaCalc(8.0);
	}
}
