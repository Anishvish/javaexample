package com.example.javaSample;

public class SwitchExample {

	public static void main(String... args) {

		Integer number = 20;
		switch (number) {
		case 10:
			System.out.println("Number is 10");
			break;
		case 20:
			switch (number / 5) {
			case 4:
				System.out.println("Number is 4");
				break;
			}
			System.out.println("Number is 20");
			break;
		default:
			System.out.println("Not 10 and 20");
		}

		Day[] str = Day.values();
	}

	public enum Day {
		SUN, MON
	}
}
