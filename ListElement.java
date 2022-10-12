package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListElement {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		list.add("Pen");
		list.add("Pencil");
		list.add("Scale");
		list.add("Eraser");

		// searchElement(list);
		System.out.println(searchElement(list));

		List<String> addElemeList = searchElement(list);

		if (addElemeList.size() == 0) {
			System.out.println("Entered Character is not Present in List");
			System.out.println("Do you want to add ? Press 0 for Adding ");
			int charVal = sc.nextInt();
			if (charVal == 0) {
				addElement(list);
			} else {
				System.out.println(" ThankYou ");
			}
		}
	}

	public static List<String> searchElement(List<String> list) {
		List<String> list2 = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char charVal = sc.next().charAt(0);

		String charStr = "" + charVal;
		for (int i = 0; i < list.size(); i++) {
			String ele = list.get(i).toLowerCase();
			if (ele.contains(charStr.toLowerCase())) {
				list2.add(ele);
			}
		}
//		if (list2.size() == 0) {
//			System.out.println("Entered Character is not Present in List");
//		}
		// System.out.println(list2);
		return list2;
	}

	public static void addElement(List<String> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements");
		int listSize = sc.nextInt();
		for (int i = 0; i < listSize; i++) {
			System.out.println("Enter Elements to add : ");
			String element = sc.next();
			list.add(element);

		}
	}
}