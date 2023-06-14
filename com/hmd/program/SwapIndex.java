package com.hmd.program;

public class SwapIndex {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 8, 11, 9, 1 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int sum = arr[j] + arr[j + 1];

					arr[j] = sum - arr[j];
					arr[j + 1] = sum - arr[j + 1];

				}

			}
		}
	
		

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
}}