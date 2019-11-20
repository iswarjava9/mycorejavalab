package com.ips.corejava.multithread;

import java.util.concurrent.TimeUnit;

public class Task1 implements Runnable {

	private long start;
	private long end;

	

	public Task1(long start, long end) {
		super();
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		long summation = 0;
		for (long i = start; i <= end; i++) {
			summation += i;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("End : "+System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName() + "start : "+start+" end : "+end+"  : " + summation);
	}

}
