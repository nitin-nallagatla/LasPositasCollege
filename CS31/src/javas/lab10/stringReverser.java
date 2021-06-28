package javas.lab10;
import java.util.Scanner;

public class stringReverser {
	
	public static char[] strArrToBeFilled;
	public static int count = 1;
	public static String result = "";
	
	public static void main(String[] args) {
		
//  Gets input and calls program.
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter string to find reverse of: ");
		String str = s.nextLine();
		
		String result = reverser(str);
		
		System.out.print("Here's the result: " + result);
		
	}
	
	public static String reverser(String str) {
		
		// Converts string the char array and creates a new one.
		char[] strArr = str.toCharArray();
		strArrToBeFilled = new char[strArr.length];
		
		// Fills array backwards while limiting length.
		while (count <= strArr.length) {
			result += strArr[strArr.length - count];
			count++;
			reverser(str);
		}
		
		// Returns output after finishing recursion loop. 
		return result;
		
	}
	
	
}
