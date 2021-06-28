package javas.Lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class wordSeperator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter your string: ");
		String input = s.nextLine();

		System.out.println(wordSep(input));

	}

	public static String wordSep(String str) {

		char strArr[] = str.toCharArray();
		ArrayList<Character> strList = new ArrayList<Character>();

		int count = 0;
		for (char i : strArr) {
			if (Character.isUpperCase(i) && count > 0) {
				strList.add(' ');
				strList.add(i);
				count++;
			} else {
				strList.add(i);
				count++;
			}
		}

		StringBuffer strBuff = new StringBuffer();

		for (char s : strList) {
			strBuff.append(s);
		}

		str = strBuff.toString();

		return str;
	}

}
