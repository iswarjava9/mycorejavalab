package com.ips.corejava.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadMain_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService ex = Executors.newFixedThreadPool(3);
		Callable<Integer> c1 = new WorkerSummation(1,2,latch);
		Callable<Integer> c2 = new WorkerSummation(3,4,latch);
		Callable<Integer> c3 = new WorkerSummation(5,10,latch);
		Future<Integer> f1 = ex.submit(c1);
		Future<Integer> f2 =ex.submit(c2);
		Future<Integer> f3 =ex.submit(c3);
		try {
			//latch.await();
			try {
				System.out.println(f1.get()+f2.get()+f3.get());
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
ex.shutdown();
	}

}
