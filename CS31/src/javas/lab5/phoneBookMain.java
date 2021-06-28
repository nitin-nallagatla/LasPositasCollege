package javas.lab5;
import java.util.ArrayList;

public class phoneBookMain {

	public static void main(String[] args) {
		
		
		// Creates phoneBook Arraylist to fill.
		ArrayList<phoneBook> phoneBook = new ArrayList<phoneBook>();

		// creates new phoneBook Class objects.
		phoneBook paul = new phoneBook("Solid Snake", "123-456");
		phoneBook polly = new phoneBook("Jay Gatsby", "789-1011");
		phoneBook jamie = new phoneBook("Peter Parker", "1213-1415");
		phoneBook larry = new phoneBook("Ronald Mcdonald", "1617-1819");
		phoneBook jimmy = new phoneBook("Sonic the Hedgehog", "202122232425-2627");

		// Adds the objects to the arraylist.
		phoneBook.add(paul);
		phoneBook.add(polly);
		phoneBook.add(jamie);
		phoneBook.add(larry);
		phoneBook.add(jimmy);

		// Returns the contents of the phonebook.
		for (int index = 0; index < phoneBook.size(); index++) {
			System.out.println(phoneBook.get(index).toString());
		}
	}

}
