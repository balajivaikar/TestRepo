package org.vibasoft.bvr.test.ThreadTest.PrinterJob;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PrinterV1 {
	private static BlockingQueue<String> queue = new ArrayBlockingQueue<String>(
			10);
	private static boolean isPrinterRunning = false;
	private static PrinterV1 instance = new PrinterV1();

	private PrinterV1() {
		this.print();
	}

	public static PrinterV1 getInstance() {
		return instance;
	}

	public void addJob(String job) {
		// queue.offer(job);
		try {
			queue.put(job);
			if(!isPrinterRunning) {
				this.print();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void print() {
		while (true) {
			isPrinterRunning = true;
			if (queue.size() > 0) {
				System.out.println("Printing--->" + queue.poll());
			}
			else {
				//TODO: On Queue is empty, stop the printer
				isPrinterRunning = false;
				return;
			}
			try {
				Thread.sleep(10);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				isPrinterRunning = false;
				e.printStackTrace();
			}
		}
		
	}
}
