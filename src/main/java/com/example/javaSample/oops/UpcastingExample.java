package com.example.javaSample.oops;

public class UpcastingExample extends Bike {

	void run() {
		System.out.println("Bike is running at 60kmpl");
	}

	public static void main(String[] args) {

		Bike bk = new UpcastingExample();// Upcasting
		bk.run();
	}
}

class Bike {
	void run() {
		System.out.println("Bike is running");
	}
}