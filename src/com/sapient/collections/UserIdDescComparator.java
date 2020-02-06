package com.sapient.collections;

import java.util.Comparator;

public class UserIdDescComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		return user2.getId() - user1.getId();
	}

}
