package com.example.javaSample.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.example.javaSample.oops.AbstractClassExample;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("Anish");
		list.add("Anne");
		list.add("Tylor");

		System.out.println(list);

		System.out.println("Remove element 2");
		list.remove(1);
		System.out.println(list);

		list.add("Anne");

		System.out.println(list);

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		LinkedList<String> list2 = new LinkedList<>();
		list2.addAll(list);
		list2.add("Bob");

		System.out.println(list2);

		System.out.println("Desc Order");
		Iterator<String> it2 = list2.descendingIterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		list2.sort(Comparator.naturalOrder());

		System.out.println("Order" + list2);
		
	}
}
