package com.logicbuilding;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountTheOccurrenceOfCharactersInString {

	public static void main(String[] args) {
		String input="Prashant Pethe";
		char inputArray[]=input.toCharArray();
		HashMap<Character,Integer> hMap = new HashMap<Character,Integer>(); // output not in input order
	//	{P=2,  =1, a=2, r=1, s=1, t=2, e=2, h=2, n=1}
		//	HashMap<Character,Integer> hMap = new LinkedHashMap<Character,Integer>(); // output in input order
		//{P=2, r=1, a=2, s=1, h=2, n=1, t=2,  =1, e=2}
		for(char ch:inputArray) {
			System.out.print(ch);
			hMap.put(ch, hMap.getOrDefault(ch, 0)+1);
		}
		System.out.println(hMap);
	}
}
