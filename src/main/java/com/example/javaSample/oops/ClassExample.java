package com.example.javaSample.oops;

public class ClassExample {

	int id;

	String name;

	public static void main(String... args) {

		ClassExample classExample = new ClassExample();

		System.out.println(classExample.id);
		System.out.println(classExample.name);

		// Initialization through reference
		TestStudent student = new TestStudent();
		System.out.println(student.a = 100);
		System.out.println(student.b = "Anish");

		// Initialization through method

		System.out.println(student.assignValue(10, "Anish"));

	}
}

class TestStudent {

	int a;

	String b;

	String assignValue(int x, String y) {
		a = x;
		b = y;
		return a + "  " + b;
	}
}