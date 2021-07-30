package com.example.javaSample.misc;

public class MathClassExample {

	public static void main(String[] args) {

		double x = 24;
		double y = 26;
		
		double a = Math.toRadians(x);

		System.out.println("Max value = " + Math.max(x, y));

		System.out.println("sqrt root = " + Math.sqrt(x));

		System.out.println("expm1 of a is: " + Math.expm1(x));

		// return the trigonometric arc sine of a
		System.out.println("Sine value of a is: " + Math.asin(a));

		// return the trigonometric arc cosine value of a
		System.out.println("Cosine value of a is: " + Math.acos(a));
		
		System.out.println("Random " + Math.random());
	}

}
