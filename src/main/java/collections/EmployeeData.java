package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class EmployeeData {
	public static void main(String[] args) {
		Employees empOne = new Employees(100, "Raju", "Dev");
		Employees empTwo = new Employees(20, "Kane", "Tester");
		Employees empThree = new Employees(5, "David", "Devops engineer");
		
		List<Employees> employees = Arrays.asList(empOne, empTwo, empThree);
		
		Collections.sort(employees, new SortByNames());
		System.out.println(employees);
		
	}
}
