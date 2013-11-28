package org.bvr.test.test;

public class CompileTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b =  new A();
		b.methodA();
		b.methodB();
	}

	
}

class A {
	public void methodA() {
		System.out.println("in Class A::methodA()");
	}
}

class B extends A {
	public void methodB() {
		System.out.println("in Class B::methodB()");
	}
}
