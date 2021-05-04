package com.example.javaSample;

public class OperatorsInJava {

	public static void main(String... args) {

		// Unary operators

		int x = 10;

		System.out.println(x++);// 10 (11)
		System.out.println(++x);// 12
		System.out.println(x--);// 12 (11)
		System.out.println(--x);// 10

		int a = 10;
		int b = 10;

		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);

		a = 10;
		b = -10;

		boolean c = true;
		boolean d = false;

		System.out.println(~a);
		System.out.println(~b);
		System.out.println(!c);
		System.out.println(!d);

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

		// Java Left shift operator
		System.out.println(10 << 2);
		System.out.println(10 << 4);

		// Java right shift operator
		System.out.println(10 >> 2);
		System.out.println(10 >> 4);

		// Java Shift Operator Example: >> vs >>>

		System.out.println(200 >> 2);
		System.out.println(200 >>> 2);

		System.out.println(-200 >> 2);
		System.out.println(-200 >>> 2);

		// Java Assignment Operator
		a = 10;
		b = 20;
		System.out.println(a += 4);
		System.out.println(b -= 4);

	}

}
