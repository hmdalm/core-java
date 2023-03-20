package com.hmd.program.hr;

import java.util.Scanner;

public class ConditionOdd_Even {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		ConditionOdd_Even s1 = new ConditionOdd_Even();
		s1.conditionChecker(N);
	}

	public void conditionChecker(int a) {
		if (a % 2 == 0) {
			if (a >= 2 && a <= 5) {
				System.out.println("Not Weird");
			}
			if (a >= 6 && a <= 20) {
				System.out.println("Weird");

			}
			if (a > 20) {
				System.out.println("Not Weird");

			}
		} else {
			System.out.println("Weird");
		}

	}

}
