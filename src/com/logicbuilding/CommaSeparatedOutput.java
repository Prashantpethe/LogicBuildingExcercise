package com.logicbuilding;

import java.util.Arrays;

public class CommaSeparatedOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * input = 1,3,0,4,5,0,2,0
		 * output = 12345000 separated with comma
		 */
		int input[]= {1,3,0,4,5,0,2,0};
		
		int index=0;
		System.out.println(Arrays.toString(input));
		for(int number : input)
		{
			if(number!=0)
			{
				input[index]=number;
				index++;
				
			}
		}
		System.out.println(Arrays.toString(input));
		
		for(int i=index;i<input.length;i++)
		{
			input[i]=0;
		}
		
		Arrays.sort(input,0,index);
		System.out.println(Arrays.toString(input));
		

	}

}
