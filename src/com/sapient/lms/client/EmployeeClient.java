package com.sapient.lms.client;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.sapient.lms.model.Employee;
import com.sapient.lms.service.EmployeeService;

public class EmployeeClient {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for list and 2 for save");
		int i = sc.nextInt();
		if (i == 1) {
			EmployeeService empService = new EmployeeService();
			Set<Employee> employees = empService.getEmployees();
			Iterator<Employee> it = employees.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}else {
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Enter your department name");
			String dept = sc.next();
			Employee emp = new Employee(name, dept);
			
			EmployeeService empService = new EmployeeService();
			empService.saveEmployee(emp);
		}
		sc.close();
		
	}

}
