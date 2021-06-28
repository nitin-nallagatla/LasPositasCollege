package javas.Lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class wordSet {

	public wordSet() {
		HashSet<String> hs = new HashSet<String>();
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = s.nextLine();
		
		String[] strArr = str.split(" ");
		
		for (String i : strArr) {
			hs.add(i);
		}
		
		List<String> list = new ArrayList<String>(hs);
		Collections.sort(list);
		
		System.out.println("Here are the unique words: " + list);
	}
	
	public static void main(String[] args) {
		wordSet test = new wordSet();
	}

}
