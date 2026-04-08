package com.logicbuilding;

import java.util.Arrays;

public class MinimumCharacterReplacementInString {

	public static void main(String[] args) {
		String data[] = {"ab","aab","abb","abab","abaaaba"};
		int result[] = new int[data.length];
		
		for(int n=0;n<data.length;n++) {
			String input=data[n];
			int count=0;
			int index=1;
			while(index<input.length()) {
			if(input.charAt(index)==input.charAt(index-1)) {
				count=count+1;
				index=index+2;
			}
			else {
				index=index+1;
			}
			}
			result[n]=count;
		}
		System.out.println(Arrays.toString(result));

	}

}
