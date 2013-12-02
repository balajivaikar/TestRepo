package org.vibasoft.bvr.test.interview;

public class TestHex {
	public static void main(String[] args) {
		TestHex hex = new TestHex();
		hex.printHex();
	}

	public void printHex() {
		int a = 0xff;
		int b = 10;
		System.out.println("println" + b);
		System.out.printf("printf 0x%x", b);
	}
}
