package org.vibasoft.bvr.test.ThreadTest.KeyboardTest;

public class NumberProcessor implements Runnable {

	KeyboardInputQueue queue;
	Object qObj;
	public NumberProcessor(KeyboardInputQueue q) {
		this.queue = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this.queue) {
				try {
					qObj = queue.getQueue().peek();
					if ( qObj != null && qObj instanceof Integer) {
						Integer i = (Integer) queue.getQueue().poll();
						System.out.println("NumberProcessor:" + i + "\tsize: " + queue.getQueue().size());
						queue.notifyAll();
					}
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
