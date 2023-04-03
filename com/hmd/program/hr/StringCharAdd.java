package com.hmd.program.hr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCharAdd {
	static int data[] = { 10, 5, 15, 26, 3, 7, 12, 14, 78, 6 };

	public boolean find(int ar[], int n) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
			}
			return true;

		}
		return false;

	}

	public int maxNu(int art[]) {
		int maxm = art[0];
		for (int x = 0; x < art.length; x++) {
			if (maxm < art[x]) {
				maxm = art[x];
			}
		}
		return maxm;
	}
	public int minNu(int art[]) {
		int minm = art[0];
		for (int x = 0; x < art.length; x++) {
			if (minm > art[x]) {
				minm = art[x];
			}
		}
		return minm;
	}

	public static void main(String[] args) {
		StringCharAdd s1 = new StringCharAdd();
		boolean a = s1.find(data, 36);
		System.out.println(a + "!!");
		System.out.println("____________________________");
		s1.stringCharAdd();
		System.out.println("____________________________");
		s1.test();
		System.out.println("____________________________");
		int no=s1.maxNu(data);
		System.out.println(no);
		int no1=s1.minNu(data);
		System.out.println(no1);
	}

	public void stringCharAdd() {
		String input = "AAABBC";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getValue() + "" + entry.getKey());

		}
	}

	public static void test() {
		String data = "aaabbc";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < data.length(); i++) {
			if (map.containsKey(data.charAt(i))) {
				map.put(data.charAt(i), map.get(data.charAt(i)) + 1);

			} else {
				map.put(data.charAt(i), 1);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getValue()).append(entry.getKey());
		}
		System.out.println(sb.toString());
	}
	
}
