package javas.Lab6;
import java.util.Scanner;

public class backwardString {

	public static void main(String[] args) {
		
		// Initializes scanner, gets input string, and calls backwardsStringMethod.
		Scanner s = new Scanner(System.in);

		System.out.print("Input your string: ");
		String input = s.nextLine();
		
		backwardStringMethod(input);
		
	}
	
	// Reverses string.
	public static void backwardStringMethod(String str) {
		
		// Creates two char arrays, one of which is made from the input, while the other is yet to be filled.
		char[] strArray = str.toCharArray();
		char[] resultArray = new char[strArray.length];
				
		
		// Initializes counter, and uses it to fill the resultArray with the input backwards.
		int counter = 0;
		for (int i = strArray.length - 1; i >= 0; i--) {
			resultArray[counter] = strArray[i];
			counter++;
		}
		
		System.out.println(resultArray);
	}

}
