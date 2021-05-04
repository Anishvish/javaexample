package com.example.javaSample.oops;

// Example of this keyword that you return as a statement from the method

public class Test1 {
	public static void main(String[] args) {

		new A().getA().msg();

		A a = new A();
		System.out.println(a);
		a.m();
	}
}

class A {
	A getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello World");
	}

	void m() {
		System.out.println(this);
	}
}