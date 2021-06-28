package javas.lab10;
import java.util.Scanner;

public class Essay extends GradedActivity {

	public Essay() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter grammar score out of 30 points: ");
		int grammar = s.nextInt();
		
		System.out.print("Enter spelling score out of 20 points: ");
		int spelling = s.nextInt();
		
		System.out.print("Enter length score out of 20 points: ");
		int length = s.nextInt();
		
		System.out.print("Enter content score out of 30 points: ");
		int content = s.nextInt();
		
		int total = grammar + spelling + length + content;
		
		grader(total);
		
	}
	
	public void grader(int total) {
		
		super.score = total;
		System.out.println("Your score was " + super.score + ". ");
		System.out.println("Your grade is a(n) " + super.getGrade() + ". ");
		
	}
	
	public static void main(String[] args) {
		Essay test = new Essay();
	}

}
