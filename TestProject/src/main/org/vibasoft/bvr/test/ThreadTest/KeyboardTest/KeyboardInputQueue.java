package org.vibasoft.bvr.test.ThreadTest.KeyboardTest;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KeyboardInputQueue<E> {

	private Queue<E> queue = new ArrayBlockingQueue<E>(1000);

	public final Queue getQueue() {
		return queue;
	}

	public final void setQueue(Queue queue) {
		this.queue = queue;
	}

}
