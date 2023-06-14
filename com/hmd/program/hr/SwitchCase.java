package com.hmd.program.hr;

public class SwitchCase { 
	public void whichmonth(int rollnumber) {
	    
String studentName="";  
//Switch statement  
switch(rollnumber){    
//case statements within the switch block  
case 1: studentName="Raaj";  
break;    
case 2: studentName="Salman";  
break;    
case 3: studentName="Neha";  
break;    
case 4: studentName="ramu";  
break;    
case 5: studentName="Hema";  
break;    
case 6: studentName="Sonu";  
break;    
case 7: studentName="Kaka";  
break;    
case 8: studentName="Yash";  
break;    
   
default:System.out.println("Invalid Roll number!");    
}    
System.out.println(studentName);  
} 
	public static void main(String[] args) {
		SwitchCase obj = new SwitchCase();
		
		obj.whichmonth(81);
	}
}  

	
