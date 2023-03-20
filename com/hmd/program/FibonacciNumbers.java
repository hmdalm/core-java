package com.hmd.program;

public class FibonacciNumbers {
	public void fib() {
		int n1=0;
		int n2=3;
		int n3;
		int count=7;
		
		for(int i=2;i<count;++i) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
				
	}
	public static void main(String[] args) {
		FibonacciNumbers obj = new FibonacciNumbers();
		obj.fib();
	}

}
