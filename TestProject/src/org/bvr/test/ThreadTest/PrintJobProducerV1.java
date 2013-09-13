package org.bvr.test.ThreadTest;

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
					String job = new Random(99999L).toString();
					printer.addJob(job);
					System.out.println("Added " + job + " to Printer Queue");
					i++;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}

		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new PrintThread());
			t.setName("T-" + i);
			t.start();
		}
	}

	public static void main(String[] args) {
		PrintJobProducerV1 printJob = new PrintJobProducerV1();
		printJob.initialize();
	}
}
