package javas.Lab7;

import java.lang.Math;
import java.util.Scanner;

public class Area {
	
	public Area() {
		menu();
	}
	
	public static void menu() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geometry Calculator: ");
		
		System.out.println("1. Calculate the area of a Circle: ");
		System.out.println("2. Calculate the area of a Rectangle:");
		System.out.println("3. Calculate the area of a Triangle: ");
		System.out.println("4. Quit");
		
		System.out.print("Enter your choice (1-4): ");
		int num = s.nextInt();
		
		actionChooser(num);
		
	}
	
	public static void actionChooser(int num) {
		
		Scanner s = new Scanner(System.in);
		
		if (num > 4 || num < 1) {
			System.out.println("Error. Please Try Again.");
			System.out.println("\n");
			menu();
		}
		
		if (num == 1) {
			System.out.print("Enter the radius: ");
			double rad = s.nextDouble();
			circCalc(rad);
		}
		
		else if (num == 2) {
			System.out.print("Enter the height: ");
			double height = s.nextDouble();
			System.out.print("Enter the length: ");
			double length = s.nextDouble();
			
			rectCalc(height, length);
			
		}
		
		else if (num == 3) {
			System.out.print("Enter the height: ");
			double height = s.nextDouble();
			System.out.print("Enter the length: ");
			double length = s.nextDouble();
			
			triCalc(height, length);
		}
		
		else if (num == 4) {
			System.out.println("Goodbye!");
		}
		
	}

	// Defines the circle overloaded method, which returns the circle area.
	public static void circCalc(double radius) {
		double area = (radius * radius) * Math.PI;
		System.out.println("The circle's area is " + area);
	}

	// Defines the cylinder overloaded method, which returns the cylinder area.
	public static void rectCalc(double height, double length) {
		double area = (length * height);
		System.out.println("The rectangle's area is " + area);
	}

	// Defines the rectangle overloaded method, which returns the rectangle area.
	public static void triCalc(double length, double height) {
		double area = (length * height)/2;
		System.out.println("The triangle's area is " + area);
	}

}
