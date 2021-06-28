package javas.lab5;

public class phoneBook {
	private String Name;
	private String PhoneNumber;

	// Constructor for phoneBook sets values equal to variables in the class.
	public phoneBook(String name, String phoneNumber)
	{
		Name = name;
		PhoneNumber = phoneNumber;
	}

	// Constructor for phonebook with only entry value.
	public phoneBook(phoneBook entry)
	{
		this.Name = entry.getName();
		this.PhoneNumber = entry.getPhoneNumber();
	}


	// getters and setters for name.
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	// getters and setters for phoneNumber
	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	// Output method.
	public String toString() {
		return "Here's your Phone Book: Name = " + Name + ", Phone Number = " + PhoneNumber;
	}
}
