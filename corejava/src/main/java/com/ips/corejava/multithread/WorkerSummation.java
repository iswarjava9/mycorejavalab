package com.ips.corejava.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class WorkerSummation implements Callable<Integer> {

	private int n;
	private int k;
	private CountDownLatch latch;
	
	public WorkerSummation(int n, int k, CountDownLatch latch) {
		super();
		this.n = n;
		this.k = k;
		this.latch = latch;
	}


	@Override
	public Integer call() throws Exception {
		 int sum = 0;
		 if(n==3){
			 Thread.sleep(1000);
		 }
	       sum = n+k;
	     //  latch.countDown();
		return sum;
	}

}
