package com.example.javaSample.oops;

// When type of the object is determined at compiled time(by the compiler), it is known as static binding.

// If there is any private, final or static method in a class, there is static binding.

public class StaticBindingExample {

	private void print() {
		System.out.println("Hello private");
	}

	public static void main(String[] args) {

		StaticBindingExample sb = new StaticBindingExample();
		sb.print();

	}
}
