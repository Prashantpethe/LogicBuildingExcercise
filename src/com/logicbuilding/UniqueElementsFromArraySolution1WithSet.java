package com.logicbuilding;

import java.util.HashSet;

public class UniqueElementsFromArraySolution1WithSet {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,2};
		// hashset doesn't maintains order, treehashset maintains order
		HashSet<Integer> seenSet = new HashSet<Integer>();
		HashSet<Integer> duplicateSet = new HashSet<Integer>();
		
		for(int number:a) {
			if(!seenSet.add(number)) {
				duplicateSet.add(number);
			}
		}
		
		seenSet.removeAll(duplicateSet);
		System.out.println(seenSet);

	}

}
