package com.example.javaSample;

public class IfConditionExample {

	public static void main(String[] args) {

		int age = 20;

		if (age > 18) {
			System.out.println("Age should be greater than 18");
		}

		int number = 13;
		System.out.println(number % 2);
		if (number % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("Odd number");
		}

		// Using ternary operator
		System.out.println(number % 2 == 0 ? "even no" : "odd no");

		// Nested if statement
		int weight = 51;
		if (age > 18) {
			if (weight > 50) {
				System.out.println("Age should be greater than 18");
			}
		}
	}
}
