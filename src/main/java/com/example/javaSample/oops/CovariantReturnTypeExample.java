package com.example.javaSample.oops;

public class CovariantReturnTypeExample extends AB {

	CovariantReturnTypeExample get() {
		return this;
	}

	void message() {
		System.out.println("covariant return type");
	}

	public static void main(String[] args) {

		CovariantReturnTypeExample ce = new CovariantReturnTypeExample();
		ce.get().message();
	}

}

class AB {
	AB get() {
		return this;
	}

	void message() {
		System.out.println("Hello");
	}
}
