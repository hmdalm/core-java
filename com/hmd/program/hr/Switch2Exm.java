package com.hmd.program.hr;

import java.util.Scanner;

public class Switch2Exm {
	public void dosomething(int Bike_Speed) {
		String Bike_Name = "";
		switch (Bike_Speed) {
		case 180:
			Bike_Name = "The bike is : BMW";
			break;
		case 250:
			Bike_Name = "The bike is : FZ";
			break;
		case 300:
			Bike_Name = "The bike is : Duke";
			break;
		case 160:
			Bike_Name = "The bike is : KTM";
			break;
		default:
			System.out.println("Not a Bike");

		}
		System.out.println(Bike_Name);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entere the bike speed");
		int h=sc.nextInt();
		Switch2Exm obj = new Switch2Exm();
		obj.dosomething(h);
		
		/*
		 * int x = 10; int y = x++; int z = ++x; int result = x + y + z;
		 * System.out.println("the result : "+result); String s1="java";//creating
		 * string by Java string literal char ch[]={'s','t','r','i','n','g','s'}; String
		 * s2=new String(ch);//converting char array to string String s3=new
		 * String("example");//creating Java string by new keyword
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */
	}

}
