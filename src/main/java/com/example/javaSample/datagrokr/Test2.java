package com.example.javaSample.datagrokr;

import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {

	public static void main(String... args) {

		Scanner s = new Scanner(System.in);
		int N = 0;
		N = s.nextInt();
		String lastValue = "";
		BigInteger bg=new BigInteger("10");
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = s.nextInt();
			String str = String.valueOf(data[i]);
			lastValue = lastValue + str.charAt(str.length() - 1);
		}

		if (new BigInteger(lastValue).divide(bg).equals(0))
			System.out.println("Yes");
		else
			System.out.println("No");

//		if ((z.length() * 2) == o.length())
//			System.out.println("YES");
//		else
//			System.out.println("NO");
	}

}
