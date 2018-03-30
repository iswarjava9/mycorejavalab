package com.ips.corejava.datastructures;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int i=1;
		while(i<=n){
			System.out.print(fibonaci(i)+", ");
			i++;
		}

	}
	
	public static int fibonaci(int n){
		
		if(n == 1 || n == 2){ return 1; }

		
		return fibonaci(n-1)+fibonaci(n-2);
	}

}
