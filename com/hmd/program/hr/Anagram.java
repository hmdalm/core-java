package com.hmd.program.hr;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String a, String b) {
		char[] aa = a.toLowerCase().toCharArray();
		char[] bb = b.toLowerCase().toCharArray();
		
		Anagram aaa = new Anagram();
		aaa.Asnding(aa);
		aaa.Asnding(bb);

		boolean res = aaa.comp(aa, bb);

		return res;

	}

	public void Asnding(char[] aa) {
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa.length - 1; j++) {
				if (aa[j] > aa[j + 1]) {
					int tem = aa[j] + aa[j + 1];
					aa[j] = (char) (tem - aa[j]);
					aa[j + 1] = (char) (tem - aa[j + 1]);
				}
			}
		}

	}

	public boolean comp(char[] ar1, char[] ar2) {
		if (ar1.length != ar2.length) {
			return false;
		}

		for (int x = 0; x < ar1.length; x++) {

			if (ar1[x] != ar2[x]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enters a");
		String a = sc.next();
		System.out.println("enters b");
		String b = sc.next();
		Anagram.isAnagram(a, b);

	}

}
