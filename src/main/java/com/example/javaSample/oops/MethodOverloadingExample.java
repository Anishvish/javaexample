package com.example.javaSample.oops;

public class MethodOverloadingExample {

	public static void main(String... args) {

		// Method Overloading: changing no. of arguments
		System.out.println(Adder.add(5, 5));
		System.out.println(Adder.add(5, 5, 5));

		// Method Overloading: changing data type of arguments
		System.out.println(Adder.add(5.5, 5.5, 5.5));

		System.out.println("Main method");

	}

	public static void main() {
		System.out.println("main method with no arg");
	}

	public static void main(String arg) {
		System.out.println("Hello world");
	}

}

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	// Why Method Overloading is not possible by changing the return type of method
	// only?
//	static double adder(int a,int b) {return a+b;}
//	static int adder(int a,int b) {return a+b;}

}