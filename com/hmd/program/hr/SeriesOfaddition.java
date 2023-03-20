package com.hmd.program.hr;

import java.util.Scanner;

public class SeriesOfaddition {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			SeriesOfaddition f1 = new SeriesOfaddition();
			f1.firstQuery(a, b, n);
			System.out.println();

		}
		in.close();
	}

	public void firstQuery(int a, int b, int n) {
		int x = a;
		for (int i = 1; i <= n; i++) {
			int temp = (int) Math.pow(2, i - 1);
			x = x + b * temp;
			if (i != 1)
				System.out.print(" " + x);
			else
				System.out.print(x);

		}

	}
}
