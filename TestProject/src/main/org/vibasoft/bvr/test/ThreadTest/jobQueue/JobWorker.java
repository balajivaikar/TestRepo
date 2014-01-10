package org.vibasoft.bvr.test.ThreadTest.jobQueue;

public class JobWorker implements Runnable {

	/*
	 * 1. Check JobQueue for job, and register for its event. 
	 * 2. Wait for notification event to arrive. 
	 * 3. If found a job on notification, take it out and perform the job. 4. Once done wiht the job print job summary &
	 * wait for other event. 5. WHile performing if there are more job
	 * notifications been received, wait for the current job to complete and
	 * then proceed retrieving the job from queue.
	 */

	public void initialize() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
