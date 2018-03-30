package com.ips.corejava.datastructures.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {5,41,33,2,1,9,12,11,4,7,25,15,7};
		int smallIndex;
		int temp;
		
		for(int i=0;i<arr.length;i++){
			smallIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[smallIndex] >arr[j]){
					smallIndex = i;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		for(int n:arr){
			System.out.print(n+" ");
		}

	}

}
