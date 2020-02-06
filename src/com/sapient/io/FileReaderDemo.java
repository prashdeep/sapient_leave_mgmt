package com.sapient.io;

import java.io.*;

public class FileReaderDemo {
	
	public static void main(String[] args) {
		File file  = new File("D:\\test.txt");
	
//		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
//			writer.append("Inserting to the file. SOme content is added to the file\n through \n the program ");
//		} catch (FileNotFoundException e) {
//			System.out.printf("File is not present %s %n", file.getName());
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("IO Exception");
//			e.printStackTrace();
//		} 
//		
		try (BufferedReader bufferedReader = 
				new BufferedReader(new FileReader(file))){
			 //int character = 0;
			 String line = bufferedReader.readLine();
			 while(line != null) {
				 //System.out.print((char)character);
				 System.out.print(line);
				 line = bufferedReader.readLine();
				 
			 }
		} catch (FileNotFoundException e) {
			System.out.printf("File is not present %s %n", file.getName());
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		} 
	}

}
