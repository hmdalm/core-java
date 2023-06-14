package com.hmd.program.hr;

import java.util.Scanner;

public class StringCapsLtr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enters A");
		String A = sc.next();
		System.out.println("enters B");
		String B = sc.next();
		int a = A.length();
		int b = B.length();
		int ab = a + b;
		System.out.println(ab);
		if (a < b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}
		String str = new String(A);
		String s1 = str.substring(0, 1).toUpperCase();
		String s2 = str.substring(1);
		String cap1 = str.substring(0, 1).toUpperCase() + str.substring(1);//s1+s2
		String str1 = new String(B);
		String ss1 = str1.substring(0, 1).toUpperCase();
		String ss2 = str1.substring(1);
		String cap = str1.substring(0, 1).toUpperCase() + str1.substring(1);
		System.out.println(cap1 + " " + cap);

	}
}
