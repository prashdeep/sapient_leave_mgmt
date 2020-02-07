package com.sapient.lms.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.sapient.lms.model.Employee;
import com.sapient.lms.service.EmployeeService;

public class EmployeeClient {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your department name");
		String dept = sc.next();
		Employee emp = new Employee(name, dept);
		
		EmployeeService empService = new EmployeeService();
		empService.saveEmployee(emp);
		sc.close();
		
	}

}
