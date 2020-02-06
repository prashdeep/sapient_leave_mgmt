package com.sapient.collections;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<User> users = new TreeSet<>(new UserSalaryAscComparator());
		
		User user1 = new User(12, "Harish", 45000);
		User user2 = new User(23, "Vinay", 60000);
		User user3 = new User(67, "Ramesh", 25000);
		User user4 = new User(33, "Kiran", 10000);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		Iterator<User> it = users.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
