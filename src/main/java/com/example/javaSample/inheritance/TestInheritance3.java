package com.example.javaSample.inheritance;

// Hierarchical Inheritance Example

public class TestInheritance3 {
	public static void main(String[] args) {

		BabyDog2 bd = new BabyDog2();
		bd.eat();
	}
}

class Animal2 {
	void eat() {
		System.out.println("Eat...");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Bark...");
	}
}

class BabyDog2 extends Animal2 {
	void sleep() {
		System.out.println("Sleep...");
	}
}
