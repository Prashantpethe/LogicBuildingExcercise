package com.logicbuilding;

import java.util.Scanner;

public class EvenandOddUsingBitManipulation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter input number");
		int inputNumber=sc.nextInt();
		if((inputNumber & 1)==1)
			System.out.println("Odd");
		else
			System.out.println("even");
	}
}
