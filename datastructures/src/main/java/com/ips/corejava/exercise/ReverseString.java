package com.ips.corejava.exercise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "kcor dlroW olleH";
		char[] charArry = input.toCharArray();
		char[] resultArry = new char[charArry.length];
		for(int i=0;i<charArry.length;i++){
			resultArry[i]= charArry[charArry.length-i-1];
		}
		System.out.println(String.valueOf(resultArry));
		
	}

}
