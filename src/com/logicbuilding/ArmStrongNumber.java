package com.logicbuilding;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int inputNumber = 153;
		int copy=inputNumber;
		int armStrong=0;
		int lastDigit;
		while(copy!=0)
		{
			lastDigit = copy%10;
			copy=copy/10;
			armStrong=armStrong+(lastDigit*lastDigit*lastDigit);
		}
		if(inputNumber==armStrong)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");
		

	}

}
