package com.ips.corejava.multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExceptionHandlingMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
ExecutorService ex = Executors.newFixedThreadPool(4);
ex.submit(new TaskException(2));
ex.submit(new TaskException(1));
Future future = ex.submit(new TaskException(0));
ex.submit(new TaskException(3));
System.out.println(future.get());
ex.shutdown();
	}

}
