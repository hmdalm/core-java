package com.hmd.program.hr;

public class Reverse {
	


		public static void reverse() {
			int[] ar = { 10, 5, 8, 11, 9, 1 };
		
			int start=0;
			int end=ar.length-1;
			
			while(start<end) {
				/*
				 * int temp = ar[start]; ar[start]=ar[end]; ar[end]=temp;
				 */
				int temp=ar[start]+ar[end];
				ar[end]= temp-ar[end];
				ar[start]=temp-ar[end];
				
				start++;
				end--;
			
			
			
			}
			
			for(int a=0;a<ar.length;a++) {
				System.out.print(ar[a]);
			}
			
		}

		public static void main(String[] args) {

		
			Reverse.reverse();

		}

	}


