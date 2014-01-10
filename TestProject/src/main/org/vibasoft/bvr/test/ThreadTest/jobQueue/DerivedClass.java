package org.vibasoft.bvr.test.ThreadTest.jobQueue;

public class DerivedClass extends BaseClass {

//	@Override
//	private void getSomething() { //hiding (lowering the visibility/modifier) would lead to compile time error
	public void getSomething() {
		// TODO Auto-generated method stub
		super.getSomething();
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		super.doSomething();
	}
}