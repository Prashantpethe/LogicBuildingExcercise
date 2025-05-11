package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class MaxQuantity {

	public static void main(String[] args) {
		String a[] = {"xyz 9","abc 20","xyz 21"};
		HashMap<String,Integer> hmap = new HashMap<String, Integer>();
		for(String s:a)
		{
			String data[]=s.split(" ");
			String name = data[0];
			int quantity=Integer.parseInt(data[1]);
			hmap.put(name, hmap.getOrDefault(name, 0)+quantity);
		}
		System.out.println(hmap);
		//find max product from hashmap
		int maxValue=0;
		String product ="";
		
		//traverse the map
		for(Map.Entry<String,Integer> entrySet:hmap.entrySet()) {
			if(entrySet.getValue()>maxValue) {
				maxValue = entrySet.getValue();
				product = entrySet.getKey();
			}
		}
		
		System.out.println(maxValue+ " "+ product);
		
		

}
}
