package com.hmd.program;

import java.util.Scanner;

public class Practice {
	
	  public static int isEven(int n) { 
		  if(n==0) { return 1;
	  }
	  
	   else { 
		  return (n*isEven(n-1));
		  }
	 
	  }
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt(); 
		sc.close();
		 int fact=1;
		fact=Practice.isEven(x);
		System.out.println("factorial of  "+x+" is = "+fact);
	}
}
