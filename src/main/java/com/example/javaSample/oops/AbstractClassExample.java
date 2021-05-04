package com.example.javaSample.oops;

public class AbstractClassExample extends Test {

	void run() {
		System.out.println("Hello world");
	}

	public static void main(String[] args) {

		AbstractClassExample ab = new AbstractClassExample();
		ab.run();
	}

}

abstract class Test {
	abstract void run();
}
