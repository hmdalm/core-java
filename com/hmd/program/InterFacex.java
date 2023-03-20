package com.hmd.program;

public interface InterFacex {
	 
		void draw();  
		}  
		  
		class Rectangle implements InterFacex{  
		public void draw(){
			System.out.println("drawing rectangle!![]!!");
			}  
	
		}
		
		class Circle implements InterFacex{  
		public void draw(){System.out.println("drawing circle!!O!!");}  
		}  
		 
		


