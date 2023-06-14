
package com.hmd.program.hr;

public class Continue_Break {
	public static void cont() {
		int ar[] = { 10, 2, 4, 7, 8, 5, 6, 3 };
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 5)
				continue;
			System.out.println(ar[i]);

		}
	}
	public static void breaks() {
	int ar[] = { 10, 2, 4, 7, 8, 5, 6, 3 };
	for (int i = 0; i < ar.length; i++) {
		if (ar[i] == 7)
			break;
		System.out.println(ar[i]);
		//System.out.println("not break");

	}
}

	public static void main(String[] args) {
		System.out.println("Print all element expect 5 nos are : ");

		Continue_Break.cont();
		System.out.println(">>breaks>>");
		Continue_Break.breaks();
		System.out.println("!!!Breaked");


	}

}
