package com.hmd.program.hr;

public class EvenOdd {
	public static void even() {
		int num[]= {5,4,9,2,1};
		int count=0;
		for(int i=0;i<num.length;i++) {
		if(num[i]%2==0) {
			count=count+1;
			System.out.println("Even number are :"+num[i]);
				
			}
		}
		System.out.println("Total even num are : "+count);
	}
	public static void odd() {
		int num[]= {9,8,2,3,6};
		for(int i=0;i<num.length;i++) {
		if(num[i]%2!=0) {
			System.out.println("Odd number are :"+num[i]);
				
			}
		}
	}
	
	public static void main(String[] args) {
		EvenOdd.even();
		System.out.println("_____________");
		EvenOdd.odd();

		
	}

}
