package com.example.javaSample.oops;

public class ConstructorExample {

	int id;

	String name;

	String address;

	public ConstructorExample() {

	}

	public ConstructorExample(int i, String n) {
		id = i;
		name = n;

	}

	public ConstructorExample(String s, String n) {

		name = s;
		address = n;
	}

	public ConstructorExample(ConstructorExample e) {
		name = e.name;
		address = e.address;
	}

	void display() {
		System.out.println(" id = " + id + " name = " + name + " address = " + address);

	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample(1, "Anish");
		ConstructorExample ce2 = new ConstructorExample("John", "Hosur");

		ConstructorExample ce3 = new ConstructorExample(ce2);

		ConstructorExample ce4 = new ConstructorExample();

		ce4.name = ce.name;

		ce.display();
		ce2.display();
		ce3.display();
		ce4.display();
	}

}
