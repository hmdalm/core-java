package com.hmd.program.hr;

import java.util.Scanner;

public class SplitReplace {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        SplitReplace sol = new SplitReplace();
	        String s1=s.replace(",", "");
	        String s2=s1.replace("'", " ");
	        String s3=s2.replace("?", "");
	       
	        

	        sol.spliting(s3);
	    }

	public void spliting(String h) {

		String[] str = h.split(" ");
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

		}
	}
}
