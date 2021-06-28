package javas.Lab12;

public class Employee {

	public int ID;
	public String name;

	public Employee(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "The employee's name is " + name + " and their ID is " + ID +". ";
	}

}
