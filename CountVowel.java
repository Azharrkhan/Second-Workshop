package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;

public class CountVowel {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maruti");
		list.add("Hyundai");
		list.add("Honda");
		list.add("Nissan");
		list.add("Toyota");
		list.add("Mahindra");		
		countVowel(list);
	}
	static void countVowel(List<String> list) {
		
		int count = 0;
		
		for(int i = 0; i < list.size(); i++) {
			String color = list.get(i);
			for (int j = 0; j < color.length(); j++) {
			if(color.charAt(j) == 'a' || color.charAt(j) == 'e' || color.charAt(j) == 'i' || color.charAt(j) == 'o' || color.charAt(j) == 'u') {
				count++;
			}
			}
		}
		System.out.println("Total no of vowels are: " +count);
	}
}
