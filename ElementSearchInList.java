package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementSearchInList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Honda");
		list.add("Mahindra");
		list.add("Hyundai");
		list.add("Nissan");
		list.add("Toyota");
		System.out.println(list);
		searchElement(list);
	}

	public static List<String> searchElement(List<String> list) {
		List<String> newList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().toLowerCase().charAt(0);

		String str = Character.toString(ch);

		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			if (element.contains(str)) {
				newList.add(element);
			}
		}
		if(newList.isEmpty()) {
			System.out.println("Match not found");
		}
		System.out.println(newList);
		return newList;
	}
}
