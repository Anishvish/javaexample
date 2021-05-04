package com.example.javaSample.oops;

public class DynamicBindingExample extends Animal3 {

	public static void main(String[] args) {

		Animal3 a3 = new DynamicBindingExample();
		a3.eat();
	}

}

class Animal3 {

	void eat() {
		System.out.println("Amimal Eating...");
	}
}