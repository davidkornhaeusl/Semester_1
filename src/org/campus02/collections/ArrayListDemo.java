package org.campus02.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Bill");
		
		System.out.println("size? " + names.size());
		
		System.out.println("contains Peter? " + names.contains("Peter"));
		System.out.println("contains Mary? " + names.contains("Mary"));
		
		for(String name : names)
		{
			System.out.print(name+", ");
		}

		System.out.println();
		
		System.out.println("name 2 = " + names.get(1));
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
