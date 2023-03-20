package com.hmd.program.hr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyPrinting {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();
		MultiplyPrinting n1 = new MultiplyPrinting();
		n1.loop(N);
	}

	public void loop(int a) {
		for (int i = 1; i <= 10; i++) {
			int x = a * i;
			System.out.println(a + " " + "x" + " " + i + " " + "=" + " " + x);

		}
	}

}
