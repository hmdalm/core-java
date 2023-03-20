package com.hmd.program.hr;

import java.util.Scanner;

public class StringPelindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		StringPelindrom.data(A);

		/* Enter your code here. Print output to STDOUT. */

	}

	public static boolean data(String S) {
		String rev = "";
		boolean ans = false;

		for (int i = S.length() - 1; i >= 0; i--) {
			rev = rev + S.charAt(i);

			}
		System.out.println(rev);
		if (S.equals(rev)) {

			System.out.println("Yes");
		}
		return ans;
	}

	
}


/* class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Solution ss=new Solution();
        ss.data(A);
        
        
        
    }
    public void  data(String S){
        String rev="";
        
        for(int i=S.length()-1;i>=0;i--){
            rev =rev+S.charAt(i);
            //System.out.println(i);
            }
            if(S.equals(rev)) {
                System.out.println("Yes");
                
}
else{
     System.out.println("No");
}
        }}*/
