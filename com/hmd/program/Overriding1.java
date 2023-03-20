package com.hmd.program;

public class Overriding1 {
	  
	    

		public void method() {
			
			System.out.println("Base class method called with integer ");  
		}

		

	       
	      
	}  
	   
	class Derived extends Overriding1  
	{  
	    @Override
		public  
	    void method()  
	    {  
	        System.out.println("Derived class method called with double d =");  
	    }  
	}  
	 class Overriding12test {
		 
		public static void main(String[] args)  
		{ 
			Overriding1 obj = new Derived();
			obj.method();
			
			
	    } 

	}
  
	     
	     
	

