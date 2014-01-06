package org.vibasoft.bvr.test.interview;

public class CompileTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before initializing attribute 'b'");
//		B b =  new A(); //without type casting to B or child class this would lead to error
		B b = (B) new A();
		System.out.println("Initialized attribute 'b'");
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
