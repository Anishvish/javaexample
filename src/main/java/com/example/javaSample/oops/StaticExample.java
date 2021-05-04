package com.example.javaSample.oops;

public class StaticExample {

	int rollNo;
	String name;

	// static variables
	static String college = "PMC TECH";

	int count = 0; // will get memory each time when the instance is created
	static int count2 = 0; // will get memory only once and retain its value

	public StaticExample(int r, String n) {
		rollNo = r;
		name = n;
	}

	void changeNormal() {
		college = "DON Academy";
	}

	// static method creation
	static void change() {

		college = "MGR";
	}

	void display() {
		System.out.println("roleNo = " + rollNo + " Name = " + name + " college = " + college);
		count();
	}

	void count() {
		count++;
		count2++;
		System.out.println("Count = " + count + " Count 2 =" + count2);
	}

	public static void main(String[] args) {

		// compile time error
//		System.out.println(count);

		StaticExample se = new StaticExample(101, "Anish");

		se.changeNormal();
		se.display();

		StaticExample.change();

		StaticExample se1 = new StaticExample(102, "John");
		se1.display();
	}

}
