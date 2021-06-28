package javas.Lab11;

public class InvalidTestScore extends Exception{

	public InvalidTestScore() {
		System.out.println("Illegal Argument. Please enter a value between 0 and 100. ");
	}

}
