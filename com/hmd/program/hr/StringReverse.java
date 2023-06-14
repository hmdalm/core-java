package com.hmd.program.hr;

public class StringReverse {
	public void reverse() {
		 String str= "Geeks", nstr="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("Geeks"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
    
    

	public static void main(String[] args) {
		
		String s="hello!world";
		char ch[] = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
		System.out.println("By string builder");
		StringReverse obj = new StringReverse();
		obj.reverse();
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(">>"+sb);
	}
	 
}
