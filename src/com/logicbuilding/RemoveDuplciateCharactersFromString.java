package com.logicbuilding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplciateCharactersFromString {

	public static void main(String[] args) {
		String input="Prashant";
		String result=""; // not optimized code bcz 
		StringBuilder sb= new StringBuilder();
		char[] arr=input.toCharArray();
		Set hSet =new LinkedHashSet();//note to use parent interface you wrote HashSet hSet which is wrong
		for(char ch:arr)
		{
			if(hSet.add(ch)) { //add methods return boolean
				result=result+ch;// bcz this wll create many strings in heap area
				//in e.g of Java it will create j,ja,jav (this will be final ans)
				sb.append(ch);//only one stringwill be created in memory
			}
		}
		System.out.println(hSet); //[P, r, a, s, h, n, t]
		System.out.println(result);// Prashnt but creates too many strings
		System.out.println(sb);//Prashnt
	}

}
