package com.bl.workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterList {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>(
				Arrays.asList('a', '0', 'b', 'c', 'd', '0', '0', 'e', 'f', 'g', '0', 'h'));
		System.out.println(list);
		removeZero(list);
	}

	public static List<Character> removeZero(List<Character> list) {

		for (int i = 0; i < list.size(); i++) {
			Character ch = '0';
			list.remove(ch);
		}
		System.out.println(list);
		return list;
	}
}

//char ch = 'a';
//String string = "abc"