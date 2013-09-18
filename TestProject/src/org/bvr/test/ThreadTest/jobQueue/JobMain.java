package org.bvr.test.ThreadTest.jobQueue;

import java.util.Random;

public class JobMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 2; i++) {
			Thread t = new Thread(new JobWorker());
			t.setName("T-" + i);
			t.start();
		}
		System.out.println("All threads got created");
		int i = 0;
		while (i < 10) {
			String job = Thread.currentThread().getName() + "---" + new Random(99999L).toString();
			JobQueue.getInstance().addJob(job);
			System.out.println("Added " + job + " Queue");
			i++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
