package com.example.javaSample.misc;

public class ObectCloningExample implements Cloneable {

	int rollNo;
	String name;

	public ObectCloningExample(int rollno, String name) {
		this.rollNo = rollno;
		this.name = name;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		ObectCloningExample oe = new ObectCloningExample(1, "Anish");

		System.out.println(oe.name);
		ObectCloningExample oe2 = (ObectCloningExample) oe.clone();

		System.out.println(oe2.name);
	}
}
