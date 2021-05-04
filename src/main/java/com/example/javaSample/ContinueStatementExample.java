package com.example.javaSample;

public class ContinueStatementExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

		aa: for (int i = 0; i < 5; i++) {
			bb: for (int j = 0; j < 5; j++) {
				if (i == 2 && j == 2)
					continue;
				System.out.println(i + " " + j);
			}
		}
	}

}
