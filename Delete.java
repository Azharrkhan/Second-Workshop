package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;

public class Delete {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Black");
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		System.out.println(list);
		deleteColor(list);
	}
	public static void deleteColor(List<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).toLowerCase().equals("green"))
				list.remove(i);
		}
		System.out.println(list);
	}
}
