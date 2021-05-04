package com.example.javaSample;

public class ForLoopExample {

	public static void main(String[] args) {

		// Simple for loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		// Nester for loop
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {

				System.out.println(i + " " + j);
			}

		}

		// Pyramid shape using for loop
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// reverse pyramid shape
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// for each method
		int arr[] = { 12, 122, 23, 54 };
		for (int a : arr) {
			System.out.println(a);
		}

		// Java labeled loop
		aa: for (int i = 0; i < 5; i++) {
			bb: for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2)
					break aa;
				System.out.println(i + " " + j);
			}
		}
		System.out.println("-----------------------------");
		
		aa: for (int i = 0; i < 5; i++) {
			bb: for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2)
					break bb;
				System.out.println(i + " " + j);
			}
		}
		
		
		// Java for loop infinite loop
//		for(;;) {
//			System.out.println("Infinite loop");
//		}
		
		
		
	}
}
