package com.hmd.program.hr;

public class TwoArraysum {
	
	    public static void main(String[] args) {
	        System.out.println("Hello, World!");
	        TwoArraysum obj =new TwoArraysum();
	        boolean x =obj.check(myData);
	        System.out.println(x);
	        
	    }
	     static int myData[] = { 10, 4, 5,6, 8, 1, 9 };
	    
		
		public boolean check(int ar0[]) {

			boolean result= false;
		     int num = 34;
			for (int i = 0; i < ar0.length; i++) {
			    for (int j = 0; j < ar0.length; j++)
			if (ar0[i]+ar0[j] == num) {
				result=true;
					System.out.println("ar0[i]:"+ar0[i]+"ar0[j]:"+ar0[j]);
					
					
				}
			}
		return result;	
		}

}
