package com.logicbuilding;

import java.util.ArrayList;
import java.util.List;

public class EYStringManipulationNumberInReverseOrder {

	public static void main(String[] args) {
		String input = "a1b2c3";
		StringBuffer sb = new StringBuffer();
		List<Character> list = new ArrayList<>();
		for(char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				list.add(c);
			}
		}
		int index=list.size()-1;
		for(char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(list.get(index));
				index--;
			}else {
			sb.append(c);
			}
		}
		
		System.out.println(sb);
		

	}

}
