package org.vibasoft.bvr.test.ThreadTest.KeyboardTest;

import java.util.Random;

public class Keyboard {

	private KeyboardInputQueue queue = new KeyboardInputQueue();

	public final KeyboardInputQueue getQueue() {
		return queue;
	}

	public final void setQueue(KeyboardInputQueue queue) {
		this.queue = queue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard kb = new Keyboard();
		kb.gatherKeys();
		Runnable r = new TextProcessor(kb.getQueue());
		new Thread(r).start();
		Runnable r1 = new NumberProcessor(kb.getQueue());
		new Thread(r1).start();
	}

	public void gatherKeys() {
		// TODO Auto-generated method stub

		Runnable numberRunnable = new Runnable() {

//			Random rand = new Random(9999999);
			int value = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					synchronized (queue) {
						value = ((int) (Math.random()*100));
						value %= 10;
						queue.getQueue().offer(value);
						System.out.println("NumRunnable: Added Number: " + value);
						queue.notifyAll();
						try {
							Thread.sleep(250);
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		};

		Runnable textRunnable = new Runnable() {

			String[] strArray = new String[] { "One",
					"Two", "Three", "Four",
					"Five", "Six", "Seven",
					"Eight", "Nine", "Ten" };

//			Random rand = new Random(10);
			int index = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					synchronized (queue) {
//						index = rand.nextInt();
						index = ((int) (Math.random()*100));
						index %= 10;
						queue.getQueue().offer(strArray[index]);
						System.out.println("TextRunnable: Added Text" + strArray[index]);
						queue.notifyAll();
						try {
							Thread.sleep(100);
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		};

		Thread numberInput = new Thread(numberRunnable);
		Thread textInput = new Thread(textRunnable);
		textInput.start();
		numberInput.start();

	}

}
