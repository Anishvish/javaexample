package com.example.javaSample;

public class BreakStatementExample {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 2)
				break;
			System.out.println(i);
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 2 && j == 2)
					break;
				System.out.println(i + " " + j);
			}
		}

		aa: for (int i = 0; i < 4; i++) {
			bb: for (int j = 0; j < 4; j++) {
				if (i == 2 && j == 2)
					break aa;
				System.out.println(i + " " + j);
			}
		}
		
		

	}
}
