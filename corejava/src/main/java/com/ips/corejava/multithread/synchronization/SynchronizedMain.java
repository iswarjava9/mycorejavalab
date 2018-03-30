package com.ips.corejava.multithread.synchronization;

/**
 * 
 * @author Iswar
 * 
 * Tested:
 * 1) If two methods of a class synchronized and two different threads try to call those methods on the
 *    same object then, any one one method will be executed first and once it is finished the other method
 *    will be executed.
 *
 */
public class SynchronizedMain {
	

	public static void main(String[] args) {
		
		SynchronizedMethods s = new SynchronizedMethods();
		Thread t = new Thread(new SynchronizedRunnable(s));
		Thread t2 = new Thread(new SynchronizedRunnable2(s));
		
		t.start();
		t2.start();
	}

}
