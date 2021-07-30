package com.example.javaSample.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList array = new ArrayList();

		array.add("Zink");
		array.add("Anish");
		array.add("Matru");

		System.out.println(array);

		Iterator it = array.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("For each loop");
		for (Object str : array) {
			System.out.println(str);
		}
		
		System.out.println("Sort the array List");
		Collections.sort(array);
		
		
		array.trimToSize();
		System.out.println(array);
		
		System.out.println(array);
	}

}
