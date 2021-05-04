package com.example.javaSample.oops;

public class ThisKeywordExample {

	int roleNo;
	String name;
	float fee;

	public ThisKeywordExample() {

		System.out.println("Default constructor is called");

	}

	public ThisKeywordExample(int roleNo, String name, float fee) {

		// this() : to invoke current class constructor
		this();

		// If local variables(formal arguments) and instance variables are different,
		// there is no need to use this keyword
		this.roleNo = roleNo;
		this.name = name;
		this.fee = fee;

	}

	void display() {

		// If you don't use the this keyword, compiler automatically adds this keyword
		this.printHello();

		System.out.println("roleNo = " + roleNo + " name = " + name + " fee = " + fee);
	}

	void printHello() {
		System.out.println("Hello World");
	}

	public static void main(String... args) {

		ThisKeywordExample tk = new ThisKeywordExample(1, "Anish", 140);
		tk.display();
	}

}
