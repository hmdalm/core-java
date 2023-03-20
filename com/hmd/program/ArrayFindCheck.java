package com.hmd.program;

public class ArrayFindCheck {
	 static int myData[] = { 10, 4, 6, 8, 1, 9 };

	public boolean find(int ar[], int n) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				return true;
			}
		}
		return false;
	}
	public boolean check(int ar0[], int n) {
		for (int i = 0; i < ar0.length; i++) {
			if (ar0[i] == n) {
				return true;
			}
		}
		return false;
	}
	public void currentEle(int arr[], int n) {
	

		for (int i = 0; i < arr.length; i++) {
			//if (arr[i] < n) {
				System.out.println(arr[i]);}

		/*	}
		}
		System.out.println("***********");*/

	}
	public int add (int a,int b) {
		int x = a+b;
		return x;
	}
	public int subtract (int i,int j) {
		int y = i-j;
		return y;
	}
	

	public static void main(String args[]) {
		
		ArrayFindCheck obj = new ArrayFindCheck();
	
		boolean a = obj.find(myData, 7);
		System.out.println(a+"!!!!");
		System.out.println("current element");
		obj.currentEle(myData,7);
		
		boolean x =obj.check(myData, 0);
		System.out.println(x);
		boolean x1 =obj.check(myData, 9);
		System.out.println(x1);
		boolean x2 =obj.check(myData, 2);
		System.out.println(x2);
		boolean x3 =obj.check(myData, 1);
		System.out.println(x3);
		System.out.println("---------some calculation-----------");
		int p=obj.add(2, 5);
		int q=obj.add(p, 6);
		int r=obj.subtract(q, 3);
		System.out.println(r);
		
	}
}