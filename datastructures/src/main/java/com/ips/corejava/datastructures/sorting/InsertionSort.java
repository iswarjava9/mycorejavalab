package com.ips.corejava.datastructures.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4,3,2,1,19,15,9,12};

	//	int[] sortedArr = new int[13];
		
		int key;
		

		for(int i=1;i<arr.length;i++){
			key = arr[i];
			int j = i-1;
			while(j>=0){
				if(key<arr[j]){
					
					arr[j+1] = arr[j];
					arr[j] = key;
				}
				j--;
			}
		}
		
		for(int n:arr){
			System.out.print(n+" ");
		}
	}

}
