package com.hmd.program.inheritance;

public class SuperConstructorTest {
	public static void main(String args[]) {
		Dog d = new Dog();
	}
}

class Animal {
	Animal() {
		System.out.println("animal is created");
	}
}

class Dog extends Animal {
	Dog() {
		//super();
		System.out.println("dog is created");
	}
}
