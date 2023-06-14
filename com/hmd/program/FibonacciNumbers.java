package com.hmd.program;

public class FibonacciNumbers {
	public void fib() {
		int n1 = 0;
		int n2 = 3;
		int n3;
		int count = 7;

		for (int i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}

	}

	public void fibo() {
		int a1=1;
		int a2=4;
		int a3;
		int count =6;
		for(int i=count-1;i>=0;i--) {
			a3=a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;
		}
	}

	public static void main(String[] args) {
		FibonacciNumbers obj = new FibonacciNumbers();
		obj.fib();
		System.out.println("2nd method call in desending oreder");
		
		obj.fibo();
	}

}
