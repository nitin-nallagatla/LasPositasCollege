package javas.Lab9;

import java.util.Scanner;

public class palindromeDetector {
	
	public static void main(String[] args) {

		// Defines Scanner and gets input.
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter String (no punctuation!): ");
		String str = s.nextLine();
		
		// Lowercases string and removes extraneous punctuation. 
		str = str.toLowerCase();
		str = str.replaceAll("\\s", "");
		str = str.replaceAll(",", "");

		// Converts remainder to string array and initializes count; done like this for recursion purposes. 
		char[] strArr = str.toCharArray();
		int count = str.length();
		
		System.out.println("Is it a palindrome? " + palindromeDetector(str.toCharArray(), str.length(), true) + ".");
		
	}
	
	public static boolean palindromeDetector(char[] str, int count, boolean result) {
		
		// Tests to see if input string is empty.
		if (count == 0) {
			return result;
		}
		
		// Tests length every time method is called to know when to stop.
		if (str.length/2 > count - 1) {
			return result;
		}
		
		// Tests actual letters. 
		else if (str[str.length - count] == str[count - 1] && Character.isAlphabetic(str[str.length - count]) && result == true && (str.length/2 != count)) {
			count--;
			result = palindromeDetector(str, count, result);
		}
		
		// Ignores other forms of punctuation.
		else if (Character.isAlphabetic(str[str.length - count]) == false && result == true) {
			count--;
			result = palindromeDetector(str, count, result);
		}
		
//		else if (str.length/2 <= count) {
//			System.out.println("\t\t3: " + result);
//			result = false;
//			return result;
//		}
		
		// Returns false if not a palindrome.
		else {
			result = false;
		}
		
		// Returns answer.
		return result;		
		
	}

}
