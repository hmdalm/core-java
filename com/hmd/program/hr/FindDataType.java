package com.hmd.program.hr;

import java.util.*;
import java.io.*;

public class FindDataType {

	public static void main(String[] argh) {
		Long longMin = new Long("-9223372036854775808");
		Long longMax = new Long("9223372036854775807");
		int intMin = -2147483648;
		int intMax = 2147483647;
		short shrtMin = -32768;
		short shrtMax = 32767;
		byte bytMin = -128;
		byte bytMax = 127;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 String inputElement=null;

		for (int i = 0; i < t; i++) {

			try {
				inputElement=sc.next();
			
				Long x = Long.parseLong(inputElement);

				if (bytMin <= x && x <= bytMax) {
					System.out.println(x + " can be fitted in:");
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if (shrtMin <= x && x <= shrtMax) {
					System.out.println(x + " can be fitted in:");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				} else if (intMin <= x && x <= intMax) {
					System.out.println(x + " can be fitted in:");
					System.out.println("* int");
					System.out.println("* long");
				}
			 else if (longMin <= x && x <= longMax) {
				System.out.println(x + " can be fitted in:");				
				System.out.println("* long");
			}
			
				

			} catch (Exception e) {
				e.printStackTrace();
				 System.out.println( inputElement+" can't be fitted anywhere.");
			}

		}
	}
}
