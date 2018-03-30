package com.ips.corejava.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/// This class explains how a work can take less time to finish when handled by multiple threads instead one thread.
public class ThreadMain_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
summation();
		
	}
	
	public static void summation() throws InterruptedException{
		//List<Integer> numbers = new ArrayList<>();
		long count = 10000;
		long partition =  count/3;
		System.out.println("Partition :"+partition);
		long start = System.currentTimeMillis();
		
		long summation = 0;
		for(long i=1;i<=count;i++){
			summation += i;
			Thread.sleep(1);
		}
		long end = System.currentTimeMillis();
		System.out.println("Total time taken "+(end-start)+" ms");
		System.out.println(summation);
		long start1 = System.currentTimeMillis();
		System.out.println("Start : "+start1);
		ExecutorService ex = Executors.newFixedThreadPool(4);
	
		long st = 1;
		ex.submit(new Task1(1,partition));
		st = st+partition;
		ex.submit(new Task1(st,(st+partition)));
		st = st + partition+1;
		ex.submit(new Task1(st,(st+partition)-1));
		ex.shutdown();
		
		//Thread.currentThread().join();
		
	}

}
