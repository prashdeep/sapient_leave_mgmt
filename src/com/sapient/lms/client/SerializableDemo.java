package com.sapient.lms.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sapient.lms.model.Employee;

public class SerializableDemo {
	
	public static void main(String[] args) throws IOException, Exception {
		Employee emp1 = new Employee("Usha", "Developer");
//		//System.out.println(emp1);
		File file = new File("D:\\obj.ser");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
		out.writeObject(emp1);
		out.flush();
		fileOutputStream.close();
		
		out.close();
		
		

		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		
		Employee employee = (Employee)in.readObject();
		
		System.out.println(employee);
		in.close();
		
	}

}
