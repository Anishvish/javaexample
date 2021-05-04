package com.example.javaSample.inheritance;

// Multilevel Inheritance Example

public class TestInheritance2 {
	public static void main(String[] args) {

		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}

}

class Animal {
	void eat() {
		System.out.println("Eat...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Bark...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("Weep ...");
	}
}
