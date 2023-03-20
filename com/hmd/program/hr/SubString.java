package com.hmd.program.hr;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		String x = S.substring(start, end);
		System.out.println(x);

	}

}
