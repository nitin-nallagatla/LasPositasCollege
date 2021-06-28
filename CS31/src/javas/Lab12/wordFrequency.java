package javas.Lab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordFrequency {

	private Scanner s = null;
	private Scanner f = null;
	private ArrayList<String> word = null;
	private ArrayList<Integer> wordCount = null;

	public wordFrequency(String fname) throws FileNotFoundException {
		s = new Scanner(System.in);
		f = new Scanner(new File(fname));
		word = new ArrayList<String>();
		wordCount = new ArrayList<Integer>();
	}

	public void counting() {
		String str;

		String s = "";
		while (f.hasNext()) {
			s = "";
			str = f.next();
			for (int i = 0; i < str.length(); i++) {
				if (Character.isAlphabetic(str.charAt(i))) {
					s += str.charAt(i);
				}
			}
			if (!word.contains(s)) {
				word.add(s);
				wordCount.add(1);
			} else {
				int index = word.indexOf(str);
				wordCount.set(index, wordCount.get(index) + 1);
			}
		}

		f.close();

		int temp;
		String empty;

		for (int i = 0; i < word.size(); i++) {
			for (int j = i + 1; j < word.size(); j++) {

				if (word.get(i).compareTo(word.get(j)) > 0) {
					empty = word.get(i);

					word.set(i, word.get(j));
					word.set(j, empty);

					temp = wordCount.get(i);

					wordCount.set(i, wordCount.get(j));
					wordCount.set(j, temp);

				}

			}
		}
	}

	public void displayCount() {
		System.out.println(" Count\tWord");

		for (int i = 0; i < word.size(); i++)
			System.out.printf("%6d %-10s\n", wordCount.get(i), word.get(i));
	}

	public void countWords() {
		counting();
		displayCount();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your file path exactly: (with two slashes in place of one): ");
		String str = s.nextLine();
		wordFrequency wp = new wordFrequency(str);
		wp.countWords();
	}

}
