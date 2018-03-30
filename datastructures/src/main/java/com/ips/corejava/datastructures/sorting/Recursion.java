package com.ips.corejava.datastructures.sorting;

public class Recursion {
// Find factorial of n using recursion method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(factorial(4));
	}
	
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		return n*factorial(n-1);
	}

}
