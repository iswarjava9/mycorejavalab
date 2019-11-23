package com.ips.corejava.recursion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(reverseString("UOY ERA WOH IH"));
	}
	
	public static String reverseString(String s){
		char firstPart = s.charAt(0);
		String st = s.substring(1, s.length());
		//System.out.println(st + firstPart);
		String reverseSt = null;
		
		
		if(s.length() <= 1){
			return s;
		}else {
			reverseSt = reverseString(st)+firstPart;
		}
		return reverseSt;
		
	}

}
