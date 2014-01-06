package org.vibasoft.bvr.test.ThreadTest.jobQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JobQueue {
	private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(
			10);
//	private static boolean isPrinterRunning = false;
	private static JobQueue instance = new JobQueue();

	private JobQueue() {}

	public static JobQueue getInstance() {
		return instance;
	}

	protected void addJob(String job) {
		// queue.offer(job);
		try {
			queue.put(job);
			/*if(!isPrinterRunning) {
				this.print();
			}*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected String getJob() {
		return queue.poll();
		/*if(!isPrinterRunning) {
			this.print();
		}*/
	}

}
