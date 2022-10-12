package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		System.out.println(list);
		evenNumbers(list);
		oddNumbers(list);
		}
	
//For odd numbers
	public static List<Integer> evenNumbers(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if(i % 2 == 0) {
				newList.add(i);
			}
		}
		System.out.println(newList);
		return newList;
	}
	
//For even numbers
	public static List<Integer> oddNumbers(List<Integer> list) {
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if(i % 2 != 0) {
				list2.add(i);
			}
		}
		System.out.println(list2);
		return list2;
	}
}
