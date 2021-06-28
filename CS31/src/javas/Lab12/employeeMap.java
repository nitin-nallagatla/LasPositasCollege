package javas.Lab12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class employeeMap {

	public Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

	public void addTo(Employee E) {
		employeeMap.put(E.ID, E);
	}

	public Employee get(int ID) {
		Employee e = employeeMap.get(ID);
		return e;
	}

	public static void searchEmployee(employeeMap map, int id) {

		Employee e = map.get(id);

		if (e != null)
			System.out.println(e);
		else
			System.out.println("ID " + id + " not found.");
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		employeeMap emap = new employeeMap();
		
		emap.addTo(new Employee(123, "Solid Snake"));
		emap.addTo(new Employee(234, "Liquid Snake"));
		emap.addTo(new Employee(345, "Solidus Snake"));
		emap.addTo(new Employee(456, "Naked Snake"));
		emap.addTo(new Employee(567, "Venom Snake"));
		emap.addTo(new Employee(678, "Big Boss"));

		System.out.print("Enter the ID of the person you would like to search for: ");
		int id = s.nextInt();

		searchEmployee(emap, id);
	}

}
