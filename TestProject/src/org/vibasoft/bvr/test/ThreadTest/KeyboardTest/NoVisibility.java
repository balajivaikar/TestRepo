package org.vibasoft.bvr.test.ThreadTest.KeyboardTest;

public class NoVisibility {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {
		private int hits = 0;
		public void run() {
			while (!ready) {
				System.out.println("ReaderThread gonna yield"  + ++hits);
				Thread.yield();
			}
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	}
}