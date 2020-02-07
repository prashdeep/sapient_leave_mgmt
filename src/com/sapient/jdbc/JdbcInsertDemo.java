package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDemo {
	
	public static void main(String[] args) {
		//step1 
		try (
				Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/qe_users", "root", "welcome");
		//step 2
		Statement statement = connection.createStatement();
		PreparedStatement preparedStatment = connection.prepareStatement("insert into users (name, dept, email) values (?, ?, ?)");
		
		//step 3
		//statement.execute("insert into users (name, dept, email) values ('vinay', 'PAYROLL', 'vinay@gmail.com')");
		
		
				
		//executeQuery
			) {
			
			//int updateCount = statement.executeUpdate("update users set name= 'harish kumar' where id= 1");
//			if(updateCount > 0) {
//				System.out.printf("Number of records updated :  %d %n", updateCount);
//			}
			
			preparedStatment.setString(1,"Raj");
			preparedStatment.setString(2, "FINANCE");
			preparedStatment.setString(3, "raj@gmail.com");
			preparedStatment.execute();
			
			ResultSet resultSet = statement.executeQuery("select * from users");

			
			while(resultSet.next()) {
				
				int empId = resultSet.getInt("id");
				String empName = resultSet.getString("name");
				String empDept = resultSet.getString("dept");
				String empEmail = resultSet.getString("email");
				
				System.out.printf("Employee with id: %d, name: %s, department: %s and email %s %n",
						empId, empName, empDept, empEmail);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
