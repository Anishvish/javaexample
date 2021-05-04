package com.example.javaSample;

public class Narrowing {

	public static void main(String[] args) {

		float f = 10.5f;

		int a = (int) f;

		System.out.println(a);

		// overflow

		int b = 130;
		byte byt = (byte) b;

		System.out.println("Integer b = " + b);
		System.out.println("Integer to byte = " + byt);

		// Addition of lower types

		byte c = 10;
		byte d = 20;

		byte e = (byte) (c + d);
		System.out.println("Byte + Byte = Integer");
		System.out.println("Byte addition = " + e);
	}

}
