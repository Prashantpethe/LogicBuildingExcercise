package com.logicbuilding;

public class UniqueElementFromArraySolution2WithLoop {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 2, 5 };

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				System.out.println("unique element is :" + a[i]);
			}
		}
	}
}
