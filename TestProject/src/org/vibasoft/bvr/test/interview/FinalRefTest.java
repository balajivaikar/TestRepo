package org.vibasoft.bvr.test.interview;

public class FinalRefTest {

	int a = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final FinalRefTest test = new FinalRefTest();
		test.setA(10);
		test.setA(20);
		//test = null;//This is not possible as it leads to compile time error
	}

	private void setA(int i) {
		// TODO Auto-generated method stub
		System.out.println("A's last state :" + a);
		a = i;
		System.out.println("A's after state :" + a);
	}

}
