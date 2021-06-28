package javas.Lab4;

import java.lang.Math;

public class Area {

	// Defines the circle overloaded method, which returns the circle area.
	public static void areaCalc(double radius) {
		double area = (radius * radius) * Math.PI;
		System.out.println("The circle's area is " + area);
	}

	// Defines the cylinder overloaded method, which returns the cylinder area.
	public static void areaCalc(double radius, double height) {
		double area = (radius * radius) * Math.PI * height;
		System.out.println("The cylinder's volume is " + area);
	}

	// Defines the rectangle overloaded method, which returns the rectangle area.
	public static void areaCalc(double length, double height, String shape) {
		double area = (length * height);
		System.out.println("The rectangle's area is " + area);
	}

}
