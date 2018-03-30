package com.ips.corejava.multithread.synchronization;

public class SynchronizedRunnable implements Runnable{
	SynchronizedMethods sk = null;
	 public SynchronizedRunnable(SynchronizedMethods sn) {
		this.sk = sn;
	}

	@Override
	public void run() {
		try {
			sk.doTask1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
