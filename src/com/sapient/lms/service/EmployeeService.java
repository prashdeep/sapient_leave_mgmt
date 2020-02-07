package com.sapient.lms.service;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;
import java.sql.Connection;

import com.sapient.lms.model.Employee;

public class EmployeeService {
	
	public void saveEmployee(Employee employee) throws SQLException {
		Connection connection = EmployeeService.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = 
					connection.prepareStatement("insert into employee (name, dept) values (?,?)");
			
			preparedStatement.setString(1, employee.getEmpName());

			preparedStatement.setString(2, employee.getDeptName());
			
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			connection.close();
			
		}
	}
	
	public Set<Employee> getEmployees(){
		return null;
	}
	
	public void updateEmployee(int empId, String name) {
		
	}
	
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users", "root", "welcome");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	

}
