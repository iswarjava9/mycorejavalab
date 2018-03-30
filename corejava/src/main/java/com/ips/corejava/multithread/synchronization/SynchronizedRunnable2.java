package com.ips.corejava.multithread.synchronization;

public class SynchronizedRunnable2 implements Runnable {
	
	SynchronizedMethods sk = null;
	 public SynchronizedRunnable2(SynchronizedMethods sn) {
		this.sk = sn;
	}

	@Override
	public void run() {
		try {
			sk.doTask2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
