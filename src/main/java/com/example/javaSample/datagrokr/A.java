package com.example.javaSample.datagrokr;

public class A {

	static int i = 10;
	int j = 20;

	public static void main(String... args) {

		A a1 = new A();
		a1.i = 30;
		A.i = 40;
		a1.j = 50;
//		A.j = 60;
		A a2 = new A();
		a2.i = 70;
		A.i = 80;
		a2.j = 90;
//		A.j = 100;

		System.out.println(a1.i);
		System.out.println(A.i);
		System.out.println(a1.j);
//		System.out.println(A.j);
		System.out.println(a2.i);
		System.out.println(A.i);
		System.out.println(a2.j);
//		System.out.println(A.j);

	}

}
