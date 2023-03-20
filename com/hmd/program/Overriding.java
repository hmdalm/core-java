package com.hmd.program;

public class Overriding {
	public void riding() {
		System.out.println("horse riding is my favourite");
	

}}
class Bikeride extends Overriding{

		
	
	public static void main(String[] args) {
		Overriding o2=new Bikeride();
		o2.riding();
		Overriding o1=new Overriding();
		o1.riding();
	}}

