package com.hmd.program;

import org.testng.Assert;

public class MatchingItems {
	int count = 0;

	public void items() {
		String item1[] = { "A", "Q", "H", "R", "S", "V" };
		String item2[] = { "V", "X", "F", "H", "Q", "R", "B", "L" };
		StringBuffer nonMatchedITEM = new StringBuffer();
		for (int a = 0; a < item1.length; a++) {
			boolean matched = false;
			for (int b = 0; b < item2.length; b++) {
				if (item2[b].equals(item1[a])) {
					count = count + 1;
					matched = true;
				}

			}
			if (!matched) {
				nonMatchedITEM.append(item2[a]).append("\n");
			}
		}

		Assert.assertEquals(count, item2.length, "item1 element not matched:" + nonMatchedITEM);
		System.out.println(";;;;;;;;;;;;;;;;;");
	}

	public static void main(String[] args) {
		MatchingItems mi = new MatchingItems();
		mi.items();
		System.out.println("////////////////////");

	}

}
