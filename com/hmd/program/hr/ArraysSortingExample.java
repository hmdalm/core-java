package com.hmd.program.hr;

import java.util.Arrays;
import java.util.Collections;   
public class ArraysSortingExample  
{  
	public static void stringary() {
		String ary[]= {"h","a","m","r","b","i","y","d"};
		Arrays.sort(ary);
		//descending order condition
		for(int i=ary.length-1;i>=0;i--) {
			System.out.println(ary[i]);
		}
	}
public static void main(String[] args)   
{   			System.out.println("The sorted array is ..");

	ArraysSortingExample.stringary();
	
//defining an array of integer type   
int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  

Arrays.sort(array);  
//Arrays.sort(array,Collections.reverseOrder());
//System.out.println(Arrays.toString(array));   

System.out.println("Elements of array sorted in ascending order: ");  
for (int i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  
