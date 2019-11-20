package com.ips.corejava.multithread.synchronization;

public class SynchronizedMethods {
	
	public synchronized void doTask1() throws Exception{
		System.out.println(Thread.currentThread().getName() +"- start doingTask1 ...............");
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() +"- end doingTask1 ...............");
	}
	
	public synchronized void doTask2() throws Exception{
		System.out.println(Thread.currentThread().getName() +"- start doingTask2 ...............");
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() +"- end doingTask2 ...............");
	}

}
