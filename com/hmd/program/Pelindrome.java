package com.hmd.program;

import java.util.Scanner;

public class Pelindrome {
	public static boolean isPalindrome(String str) {

		String rev = "";

		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			System.out.println("the palindrome is - "+rev);
			ans = true;
		}
		else {
		System.out.println("this is not palindrome - "+rev);
		}
		return ans;
	}

	public static void main(String[] args) {
		// Input string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str1=sc.next();

		// Convert the string to lowercase
		// str = str.toLowerCase();
		boolean A = isPalindrome(str1);
		System.out.println(A);
	}
}
