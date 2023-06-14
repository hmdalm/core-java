package com.hmd.program.hr;

import java.util.Arrays;

public class Practice {
	static int data[] = { 55, 41, 21, 63, 7, 10, 27, 99, 28, 11, 93 };

	public boolean findno(int ar[], int n) {

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				System.out.println("condition true the num is available :" + n);
				return true;

			}
		}
		System.out.println("condition false the num is'nt available :" + n);

		return false;
	}

	public int findMax(int ary[]) {
		int maxNumber = ary[0];
		int minNumber = ary[0];
		for (int o = 0; o < ary.length; o++) {
			if (maxNumber < ary[o]) {
				maxNumber = ary[o];
			} else if (minNumber > ary[o]) {
				minNumber = ary[o];
			}

		}
		System.out.println("the max is :" + maxNumber);
		System.out.println("the min is :" + minNumber);

		return maxNumber;

	}

	public void swapIndex() {
		
		for(int x=0;x<data.length;x++) {
			for(int y=0;y<data.length-1;y++) {
				if(data[y]>data[y+1]) {
				int sum=data[y]+data[y+1];
				data[y]=sum-data[y];
				data[y+1]=sum-data[y+1];
				
			}
		}}
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
	}

	public static void main(String[] args) {
		Practice pr = new Practice();
		pr.findno(data, 1);
		pr.findMax(data);
		System.out.println("................");
		pr.swapIndex();
		int array[]= {10,12,4,98,-1,55,-55,41,22,3};
		Arrays.sort(array);
		System.out.println("<------------->");
		for(int i=0;i<array.length;i++) {
			System.out.print(","+array[i]);
		}
	}
}
