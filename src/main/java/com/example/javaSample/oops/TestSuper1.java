package com.example.javaSample.oops;

public class TestSuper1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.printColor();
		dog.eat();
	}

}

class Animal {
	Animal() {
		System.out.println("Animal Constructor");
	}

	String color = "white";

	void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal {
	String color = "black";

	// 3) super is used to invoke parent class constructor.

	Dog() {
		super();
		System.out.println("Dog constructor");
	}

	void eat() {

		// 2) super can be used to invoke parent class method
		super.eat();
		System.out.println("Dog eat");
	}

	void printColor() {

		System.out.println(color);
//		1) super is used to refer immediate parent class instance variable.
		System.out.println(super.color);
	}
}
