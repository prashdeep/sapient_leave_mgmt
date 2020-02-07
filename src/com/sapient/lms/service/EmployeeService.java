package com.sapient.lms.service;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import java.sql.Connection;

import com.sapient.lms.model.Employee;

public class EmployeeService {
	
	public void saveEmployee(Employee employee) throws SQLException {
		Connection connection = EmployeeService.getConnection();
		PreparedStatement preparedStatement = null;
		connection.setAutoCommit(false);
		
		try {
			 preparedStatement = 
					connection.prepareStatement("insert into employee (name, dept) values (?,?)");
			
			preparedStatement.setString(1, employee.getEmpName());

			preparedStatement.setString(2, employee.getDeptName());
			
			preparedStatement.execute();
			
			connection.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connection.rollback();
		} finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			connection.close();
			
		}
	}
	
	public Set<Employee> getEmployees() throws SQLException{
		Connection connection = EmployeeService.getConnection();
		
		Statement statement = connection.createStatement();
		Set<Employee> employees = new HashSet<>();
		ResultSet resultSet = statement.executeQuery("select * from employee");
		while(resultSet.next()) {
			int empId = resultSet.getInt("id");
			String name = resultSet.getString("name");
			String dept = resultSet.getString("dept");
			Employee emp = new Employee(empId, name, dept);
			employees.add(emp);
		}
		return employees;
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
