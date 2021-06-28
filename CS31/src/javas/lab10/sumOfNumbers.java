package javas.lab10;
import java.util.Scanner;

public class sumOfNumbers {
	public static int sum = 0;
	
	public static void main(String[] args) {
		
		// Gets input and calls method.
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number to calculate sum of: ");
		int num = s.nextInt();
		
		int result = sumCalc(num);
		
		// Returns output.
		System.out.println("Here's the result: " + result);
	}
	
	public static int sumCalc(int x) {
		
		// Decrements number using recursion while adding it to class variable sum. Then returns sum.
		if(x >= 0) {
			sum += x;
			x--;
			sumCalc(x);
		}
		return sum;
	}
	
}
