package com.bl.workshop;

import java.util.ArrayList;
import java.util.List;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public class Numbers1To1000 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		System.out.println(list);
		primeNumbers(list);
	}

	public static List<Integer> primeNumbers(List<Integer> list) {
		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			int num = list.get(i);

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				newList.add(num);
			}
		}
		System.out.println(newList);
		return newList;
	}
}
