package com.ips.corejava.exercise;

import java.util.LinkedList;
import java.util.Scanner;

public class AddingTwoLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        LinkedList<Integer> num1 = new LinkedList<Integer>();

        LinkedList<Integer> num2 = new LinkedList<Integer>();

        LinkedList<Integer> ans = new LinkedList<Integer>();

        /* Accept numbers */

        System.out.println("Adding Large Numbers Using Linked Lists Test\n");

        System.out.println("Enter number 1");

        String s1 = scan.next();

        System.out.println("Enter number 2");

        String s2 = scan.next();

        /* Store digits in lists */

        int lenght1 = s1.length(), lenght2 = s2.length();        

        for (int i = lenght1 - 1; i >= 0; i--)

            num1.add(s1.charAt(i) - '0');

        for (int i = lenght2 - 1; i >= 0; i--)

            num2.add(s2.charAt(i) - '0');
        
        System.out.println(num1);
        System.out.println(num2);
	}

}
