package com.example.javaSample.datagrokr;

// -2,-3,4,-1,-2,1,5,-3

// what is largest sum that can be found contigous subarray

public class Sample {

	public static void main(String[] args) {

		int sum = 0;

		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (sum + arr[j] > 0)

				if (sum >= 0)
					sum = arr[i] + arr[j];

			}

//			if (subArraySum >= 0)
//				subArraySum = subArraySum + arr[i];
		}

		System.out.println(sum);
	}
}
