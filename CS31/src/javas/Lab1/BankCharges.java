package javas.Lab1;

import java.util.Scanner;

public class BankCharges {
	public static void main(String[] args) {
		try (Scanner keyboard = new Scanner(System.in)) {
			// Defines variables.
			int checksWritten = 0;
			double charge = 0;

			// Gets input.
			System.out.print("Please enter the number of checks written for the month: ");
			checksWritten = keyboard.nextInt();

			// Checks the input for service tax, and calculates fees.
			if (checksWritten < 20) {
				charge = checksWritten * 0.10;
			} else if (checksWritten < 40) {
				charge = checksWritten * 0.08;
			} else if (checksWritten < 60) {
				charge = checksWritten * 0.06;
			} else if (checksWritten >= 60) {
				charge = checksWritten * 0.04;
			}

			System.out.println("The service fees for the month are $" + charge + ".");
		}
	}
}
