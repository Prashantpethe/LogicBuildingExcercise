package com.logicbuilding;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input number :");
		int inputNumber = sc.nextInt();
		int reverseNumber=0;
		int lastDigit;
	
		while(inputNumber!=0) //note this step u wrote as >0 whic fails when input is -123
		{
			lastDigit = inputNumber%10;
			reverseNumber=reverseNumber*10+lastDigit;
			inputNumber = inputNumber/10;
		}
		
		System.out.println("Reversed number is :"+ reverseNumber);
		
		

	}

}
