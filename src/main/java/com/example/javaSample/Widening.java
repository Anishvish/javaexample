package com.example.javaSample;

public class Widening {

	public static void main(String[] args) {

		int a = 10;
		float f = a;

		long l = a;
		
		Package p = Package.getPackage("java.lang");
		
		System.out.println(p.getName());
		System.out.println(p.getImplementationTitle());

		
		System.out.println("int a = " + a);

		System.out.println("integer to float = " + f);

		System.out.println("Integer to long = " + l);
	}

}
