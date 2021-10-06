package com.ips.corejava.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find all the subsets of a Set
 * @author Iswar
 *
 */
public class SubsetsOfSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numberSet = new TreeSet<>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		System.out.println(findAllTheSubsetsOfASet(numberSet));

	}
	
	public static List<Set> findAllTheSubsetsOfASet(Set<Integer> numberSet){
		
		List<Set> listOfSubsets = new ArrayList<>();
		
		for (Iterator<Integer> it = numberSet.iterator(); it.hasNext(); ) {
	        Integer f = it.next();
	        System.out.println(f);
	       
	    }
		
		return null;
	}

}
