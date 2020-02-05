package com.sapient.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(88);
		list.add(40);
		list.add(2, 22);
		System.out.println("The size of the arrylist is "+list.size());
		System.out.println("List contains 42" + list.contains(42));
		System.out.println("List is empty ? "+list.isEmpty());
		
		/*list.clear();
		
		System.out.println("List is empty after calling the clear method ? "+list.isEmpty());
		
		System.out.println(list);
		*/
		
		//iterate through the list
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			int value = it.next();
			System.out.println("The value is "+ value);
		}
	}

}
