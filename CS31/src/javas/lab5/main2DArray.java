package javas.lab5;
import java.util.Scanner;

public class main2DArray {
	public static void main(String[] args) {
		_2D_array test = new _2D_array();
		Scanner s = new Scanner(System.in);
		
		// Initializes input array and prints it.
		int[][] DDArray = test.create2DArray();
		
		// Returns results of total and average.
		System.out.println("Total: " + test.getTotal(DDArray));
		
		System.out.println("Average: " + test.getAverage(DDArray));
		
		// Asks for horizontal row and vertical column user wants to find sum of.
		System.out.print("What horizontal row do you want to find the sum of? ");
		int rowTotal = s.nextInt();
		
		System.out.print("What vertical column do you want to find the sum of? ");
		int colTotal = s.nextInt();
		
		// Returns row and column total.
		System.out.println("Row Total: " + test.getRowTotal(DDArray, rowTotal));
		
		
		System.out.println("Column Total: " + test.getColumnTotal(DDArray, colTotal));
		
	}
}
