package org.bvr.test.ThreadTest.jobQueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JobQueue {
	private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(
			10);
//	private static boolean isPrinterRunning = false;
	private static JobQueue instance = new JobQueue();
	
	private static Vector listeners = new Vector();

	private JobQueue() {}

	public static JobQueue getInstance() {
		return instance;
	}

	protected void addJob(String job) {
		try {
			queue.put(job);
//			this.update();
			queue.notifyAll();
			/*if(!isPrinterRunning) {
				this.print();
			}*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected String getJob() {
		while(queue.isEmpty()) {
			try {
				queue.wait();
				System.out.println("JobQueue is waiting..");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return queue.poll();
		/*if(!isPrinterRunning) {
			this.print();
		}*/
	}

//	public void addListener(JobWorker obj) {
//		listeners.add(obj);
//	}
//	
//	private void update() {
//		for(Object worker : listeners) {
//			((JobWorker)worker).gotWork();
////			((JobWorker)worker).notifyAll();
//		}
//	}

}
