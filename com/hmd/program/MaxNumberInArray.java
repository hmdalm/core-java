package com.hmd.program;

public class MaxNumberInArray {
	static int numbers[] = { 10, 5, 45, 7, 41, 26, 32, 12, 20 };

	public int findMax(int array[]) {
		int maxNumber = array[0];
		for (int i = 1; i<array.length; i++) {
			if (maxNumber < array[i]) {
				maxNumber = array[i];
			}
			
		}
		return maxNumber;
	}
	public int findMin(int array[]) {
		int minNumber = array[0];
		for (int i = 1; i<array.length; i++) {
			if (minNumber > array[i]) {
				minNumber = array[i];
			}
			
		}
		return minNumber;
	}

	public static void main(String[] args) {
		System.out.println("the Maximum number from the current array is :");
		MaxNumberInArray Max= new MaxNumberInArray();
		int Maxim=Max.findMax(numbers);
		System.out.println(Maxim);
		System.out.println("the Minimum number from the current array is :");
		int Minm=Max.findMin(numbers);
		System.out.println(Minm);
	}

}
