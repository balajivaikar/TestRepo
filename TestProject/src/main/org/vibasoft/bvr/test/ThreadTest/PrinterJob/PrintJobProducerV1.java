package org.vibasoft.bvr.test.ThreadTest.PrinterJob;

import java.util.Random;

public class PrintJobProducerV1 {

	public void initialize() {

		final PrinterV1 printer = PrinterV1.getInstance();
		class PrintThread implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 0;
				while (i < 50) {
					String job = Thread.currentThread().getName() + "---" + new Random(99999L).toString();
					printer.addJob(job);
					System.out.println("Added " + job + " to Printer Queue");
					i++;
					try {
						Thread.sleep(15);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
		
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(new PrintThread());
			t.setName("T-" + i);
			t.start();
		}
		
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		PrintJobProducerV1 printJob = new PrintJobProducerV1();
		printJob.initialize();
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Elapsed = " + (endTime - startTime));
	}
}
