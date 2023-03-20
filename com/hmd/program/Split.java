package com.hmd.program;

public class Split {
	String first = "hi,hello,how,are,you";
	String second = "i=am~rock-star";
	String third = "hey#how#*are/you";
	public void finpt() {
		String [] frst = first.split(",");
		for(int i=0;i<frst.length;i++) {
		System.out.println(frst[i]);}
		
	}
	public void sinpt() {
		System.out.println("...................");
		String[] s = second.split("=");
		System.out.println(s[0]);
		String[] s1 =s[1].split("~");
		System.out.println(s1[0]);
		String[] s2 =s1[1].split("-");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
	
		}
public void thinp() {
	String third = "hey#how#-are/you";
System.out.println("...................");
		String[] s = third.split("#");
		System.out.print(s[0]);
		System.out.print(s[1]);
		String[] s1 =s[2].split("-");
	
	String[] s2 =s1[1].split("/");
		System.out.print(s2[0]);
		System.out.println(s2[1]);
	
		}
	
public static void main(String args[]) {
	
	Split s1 = new Split();
	s1.finpt();
	s1.sinpt();
	s1.thinp();
	SplitndLoop s2 = new SplitndLoop();
	System.out.println("total count");
	s2.datasp();
	
	
	}

	}


