package com.ips.corejava.multithread.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingNumbers {

	private int sheepCount = 0;

	private void incrementAndReport() {
		synchronized (this) {
			System.out.print((++sheepCount) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			PrintingNumbers printingNumbers = new PrintingNumbers();
			for (int i = 0; i < 20; i++)
				service.submit(() -> printingNumbers.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
