package com.example.javaSample;

public class Widening {

	public static void main(String[] args) {

		int a = 10;
		float f = a;

		long l = a;
		System.out.println("int a = " + a);

		System.out.println("integer to float = " + f);

		System.out.println("Integer to long = " + l);
	}

}
