package com.example.javaSample.oops;

public class InterfaceExample implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("Hello");
	}

	@Override
	public void print() {

		System.out.println("World");
	}

	public static void main(String[] args) {
		InterfaceExample example = new InterfaceExample();
		example.print();
		example.show();
	}

}

interface Printable {
	void print();
}

interface Showable {
	void show();
}