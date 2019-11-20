package com.ips.corejava.multithread.exercises;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamUseCase1 {
		   public int processRecord(int input) {
		      try {
		         Thread.sleep(10);
		      } catch (InterruptedException e) {
		         // Handle interrupted exception
		      }
		      return input+1;
		   }

		   public void processAllData(List<Integer> data) {
		      data.stream().map(a -> processRecord(a)).count(); // Single stream takes more time
			   //data.parallelStream().map(a -> processRecord(a)).count(); // This take drastically less time
		   }

		   public static void main(String[] args) {
			   ParallelStreamUseCase1 calculator = new ParallelStreamUseCase1();

		      // Define the data
		      List<Integer> data = new ArrayList<Integer>();
		      for(int i=0; i<10000; i++) data.add(i);

		      // Process the data
		      long start = System.currentTimeMillis();
		      calculator.processAllData(data);
		      long time = (System.currentTimeMillis()- start); ///1000.0;

		      // Report results
		      System.out.println("\nTasks completed in: "+time+" miliseconds");
		   }
		}


