package com.sapient.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ToStringDemo {

	public static void main(String[] args) {
		User user1 = new User(1, "Kishan",  34000);
		User user2 = new User(2, "Vinay", 20000);
		User user3 = new User(12, "Hari", 60000);
			
		//System.out.println(user1);
		//System.out.println(user2);
		
	//	System.out.println(user1 == user2);
		//System.out.println(user1.equals(user2));
		
		Set<User> set = new TreeSet<>();
		set.add(user1);
		set.add(user2);
		set.add(user3);
		
//		System.out.println("Contains user2 "+set.contains(user2));
//		System.out.println(" Is empty >> "+set.isEmpty());
//		set.clear();
//		System.out.println(" Is empty >> "+set.isEmpty());
		
		
		System.out.println(set);
		
	}
}

class User implements Comparable<User>{
	
	private int id;
	private String name;
	
	private double salary;
	
	public User(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public int compareTo(User user) {
		return this.id - user.id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
