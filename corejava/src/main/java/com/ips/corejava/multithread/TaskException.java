package com.ips.corejava.multithread;

public class TaskException implements Runnable{
private int k;

	public TaskException(int k) {
	super();
	this.k = k;
}

	@Override
	public void run(){
		if(k==0){
			throw new RuntimeException("Input is Zero");
		}
		System.out.println(Thread.currentThread().getName()+"Printed Value : "+k);
		
	}

}
