package com.hmd.program.hr;

public class ShortAscDesc {
	static int data[] = { -55, 8, -86, 10, 65, 23, 28, 11, 93, -7 };

	public static void ascending() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] > data[j + 1]) {
					// int temp = data[j] + data[j + 1];
					int x = data[j]; // = temp - data[j];
					int y = data[j + 1]; // = temp - data[j + 1];
					data[j] = y;
					data[j + 1] = x;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			System.out.print("," + data[i]);
		}
	}

	public static void descending() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1; j++) {
				if (data[j] < data[j + 1]) {
					// int temp = data[j] + data[j + 1];
					int x = data[j]; // = temp - data[j];
					int y = data[j + 1]; // = temp - data[j + 1];
					data[j] = y;
					data[j + 1] = x;
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print("," + data[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Ascending Order");

		ShortAscDesc.ascending();
		System.out.println("");

		System.out.println("Descending Order");
		ShortAscDesc.descending();

	}
}