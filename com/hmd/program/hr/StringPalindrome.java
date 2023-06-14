package com.hmd.program.hr;

import java.util.Scanner;

public class StringPalindrome {
	public void isPalind(String word) {
		String reverse="";
		int length=word.length();
		for(int i=length-1;i>=0;i--){
			reverse=reverse+word.charAt(i);}
			if(word.equals(reverse)){
				System.out.println("Entered word is palindrome : "+reverse);
			}
			else {
				System.out.println("!!!Entered word is NOT palindrome : "+reverse);

			}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to check is palindrome or not");
		String s=sc.nextLine();
		s=s.toLowerCase();//to convert into lower case
		StringPalindrome obj = new StringPalindrome();
		obj.isPalind(s);
			sc.close();	}

	}

