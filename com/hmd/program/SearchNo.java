package com.hmd.program;

public class SearchNo {
	static int arr1 []= {75,22,4,11,5,88,6,44,9,71};

	public boolean searching(int n) {
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==n) {
				return true;
				
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		SearchNo s1 = new SearchNo();
		boolean ans=s1.searching(88);
		System.out.println("Number is matched"+" "+ans);
		
	}

}
