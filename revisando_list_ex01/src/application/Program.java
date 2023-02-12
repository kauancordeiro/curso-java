package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n =sc.nextInt();
		
		
		List<Employee> list = new ArrayList<>();
		
		for (int i =0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.printf("Id: ");
			int id = sc.nextInt();
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);	
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		int idCount = 0;
		
		for (Employee x : list) {
			if (id == x.getId()) {
				idCount++;
			}
		}

		if (idCount == 0) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage: ");
			int percent = sc.nextInt();
			for(Employee x : list) {
				if (id == x.getId()) {
					x.increaseSalary(percent);
				}
				
			}
			
		}
		
		
		
		System.out.println();
		System.out.println("List of employess: ");
		for(Employee x: list) {
			System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
		}
		
		
		
		
		
		
		sc.close();

	}

}
