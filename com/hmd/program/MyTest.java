package com.hmd.program;

class Parent {
	void style() {
		System.out.println("Parent are more Stsylish then the child");
	}
}

class Child extends Parent {
	void style() {
		System.out.println(" Child is more Stsylish then the Parent");
	}
}

public class MyTest {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.style();
		Parent p2 = new Child();
		p2.style();
	}
}
