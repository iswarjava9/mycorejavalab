package com.ips.corejava.multithread.synchronization;

import java.util.concurrent.TimeUnit;

public class StopThread {
    private static volatile boolean stopRequested;
    private static void requestStop() {
        stopRequested = true;
    }
    private static boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
            	System.out.println(Thread.currentThread().getName() + " Started");
                int i = 0;
                while (!stopRequested()){
                    i++;
                }
                System.out.println(Thread.currentThread().getName() + " Stopped");
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}


