package com.ips.corejava.multithread.synchronization;

public class SynchronizedMethods {
	
	public synchronized void doTask1() throws Exception{
		System.out.println("start doingTask1 ...............");
		Thread.sleep(1000);
		System.out.println(" end doingTask1 ...............");
	}
	
	public synchronized void doTask2() throws Exception{
		System.out.println("start doingTask2 ...............");
		Thread.sleep(1000);
		System.out.println(" end doingTask2 ...............");
	}

}
