package com.hmd.program;

public class ArrayRealated {
	static int [] mixnumber= {45,25,76,-9,-36,20,14,-1,0,90};

	public void swaping() {
		for(int i=0;i<mixnumber.length;i++) {
			for(int j=0;j<mixnumber.length-1;j++) {
				if(mixnumber[j]>mixnumber[j+1]) {
					int temp =mixnumber[j]+mixnumber[j+1];
					mixnumber[j]=temp-mixnumber[j];
					mixnumber[j+1]=temp-mixnumber[j+1];

				}
			}
		}
		for(int i=0;i<mixnumber.length;i++) {
			System.out.println(mixnumber[i]);
		}
		System.out.println("length="+mixnumber.length);
 
	}
	public boolean findNo(int arr[],int n) {
  for(int i=0;i<mixnumber.length;i++) {
	  if(mixnumber[i]==n) {
		  return true;
	  }
  }
		return false;
		
	}
	public int max_num(int[] arr1) {
		int maxNum =arr1[0];
		for(int i=0;i<arr1.length;i++) {
		
			  if(maxNum<arr1[i]) {
				  maxNum = arr1[i];
			 }
		}
		return maxNum;
		
	}
	public static void main(String[] args) {
		ArrayRealated obj = new ArrayRealated();
		obj.swaping();
		System.out.println("...........");
		boolean x=obj.findNo(mixnumber, -9);
		System.out.println(x);
		int MaxNumber=obj.max_num(mixnumber);
		System.out.println(MaxNumber);
		
	}

}
