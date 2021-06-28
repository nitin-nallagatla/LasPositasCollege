package javas.lab5;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class GradeBookTest1 {

	public static void main(String[] args) throws IOException {
		
		// Sets up variables to read information into file.
		String directory = System.getProperty("user.home");
		String fileName = "sample.txt";
		String absolutePath = directory + File.separator + fileName;

		// Calls GradeBook object, and creates a new file object.
		GradeBook[] students = new GradeBook[5];
		File f = new File(absolutePath);
		if (f.exists() && !f.isDirectory()) {
			f.delete();
		}

		getStudentData(students, absolutePath);

		// Reads the responses into a file for later.
		File file = new File(absolutePath);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
		sc.close();

	}

	// Gets input, validates input, drops lowers score, returns the results from file. 
	public static double getStudentData(GradeBook[] array, String abspath) {
		
		Scanner scan = new Scanner(System.in);
		String[] student = new String[5];
		double[] test = new double[4];
		
		for (int i = 0; i < student.length; i++) {
			
			System.out.println("Enter the name of the student : ");
			student[i] = scan.nextLine();
			
			for (int j = 0; j < test.length; j++) {
				System.out.println("Enter score " + (j + 1) + " for the student");
				test[j] = scan.nextDouble();
				
				while (test[j] < 0 || test[j] > 100) {
					System.out.println("Enter score " + (j + 1) + " for the student: ");
					test[j] = scan.nextDouble();

				}
				scan.nextLine();
			}

			Arrays.sort(test);

			double[] test1 = new double[3];

			for (int add = 1; add < test.length; add++) {
				test1[add - 1] = test[add];
			}

			array[i] = new GradeBook(student[i], test1);
			// Write the student data to a file
			try {

				FileOutputStream fileOutputStream = new FileOutputStream(abspath, true);
				String fileContent = array[i].toString();
				try {
					fileOutputStream.write(fileContent.getBytes());
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

		return 0;

	}
}