package org.bvr.test.ThreadTest.KeyboardTest;

public class TextProcessor implements Runnable {

	KeyboardInputQueue queue;
	Object qObj;
	public TextProcessor(KeyboardInputQueue q) {
		this.queue = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this.queue) {
				try {
					
					qObj = queue.getQueue().peek();
					if (qObj != null && qObj instanceof String) {
						String t = (String) queue.getQueue().poll();
						System.out.println("TextProcessor:" + t + "\tsize: " + queue.getQueue().size());
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
