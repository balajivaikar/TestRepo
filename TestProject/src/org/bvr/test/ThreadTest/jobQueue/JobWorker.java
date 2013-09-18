package org.bvr.test.ThreadTest.jobQueue;

public class JobWorker implements Runnable {

	/*
	 * 1. Check JobQueue for job, and register for its event. 
	 * 2. Wait for notification event to arrive. 
	 * 3. If found a job on notification, take it out and perform the job. 
	 * 4. Once done wiht the job print job summary & wait for other event. 
	 * 5. WHile performing if there are more job
	 * notifications been received, wait for the current job to complete and
	 * then proceed retrieving the job from queue.
	 */

//	private static boolean iGotWork = false;
	public void initialize() {
//		JobQueue.getInstance().addListener(this);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		doWorkBaby();
	}
	
	private void doWorkBaby() {
		while(true) { //iGotWork) {
			System.out.println("Dont disturb, am working..");
//			try {
				String job = JobQueue.getInstance().getJob();
				if(job != null) {
					System.out.println( job + "\t-JOB DONE");
				}
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

//	public void gotWork() {
//		// TODO Auto-generated method stub
//		// check jobQueue and start work
////		this.iGotWork = true;
//		doWorkBaby();
//	}

}
