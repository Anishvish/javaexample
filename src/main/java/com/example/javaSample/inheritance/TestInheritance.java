package com.example.javaSample.inheritance;

// Single Inheritance Example

public class TestInheritance {

	public static void main(String[] args) {
		Dog1 dg = new Dog1();
		dg.eat();
		dg.bark();
	}

}

class Animal1 {
	void eat() {
		System.out.println("Eat...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Bark...");
	}
}
