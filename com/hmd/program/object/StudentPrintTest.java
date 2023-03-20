package com.hmd.program.object;

public class StudentPrintTest {
public static void main(String[] args) {
	Student s = new Student();
	System.out.println(s);
	s.id=20;
	s.name="hammad";
	System.out.println("Student object is:"+s);
	System.out.println("Student object is:"+s.toString());
}
	
}

class Student {
	int id;
	String name;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String s = "ID:"+id+" NAME:"+name;
		return s;
	}
	
}
