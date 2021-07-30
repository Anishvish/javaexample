package com.example.javaSample.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4 };

		System.out.println(Arrays.toString(array));

		List<String> list = new ArrayList<String>();
		list.add("1");

		System.out.println(list);

		Collections.reverse(list);

		list.sort(Comparator.reverseOrder());
	}
}
