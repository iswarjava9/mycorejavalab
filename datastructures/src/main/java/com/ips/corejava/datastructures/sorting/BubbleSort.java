package com.ips.corejava.datastructures.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,41,33,2,1,9,12,11,4,7,25,15,7};
        int temp;
		for(int i=arr.length-1;i>-1;i--){
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1]){
					temp =  arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int n:arr){
			System.out.print(n+" ");
		}
		
	}

}
