package com.example.javaSample.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SampleData {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String... args) {

		Comparator cmp = Collections.reverseOrder();

		List list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(20);
		list.add(90);

		Collections.sort(list, cmp);

		System.out.println(list);

	}
}
