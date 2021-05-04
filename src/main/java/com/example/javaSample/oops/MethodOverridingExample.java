package com.example.javaSample.oops;

public class MethodOverridingExample extends vehicle {

	void run() {
		System.out.println("Hello world, it worked");
	}

	public static void main(String[] args) {

		MethodOverridingExample me = new MethodOverridingExample();
		me.run();
	}
}

class vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}