package com.sapient.collections;

import java.util.Comparator;

public class UserSalaryAscComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		// TODO Auto-generated method stub
		return (int)(user1.getSalary() - user2.getSalary());
	}

}
