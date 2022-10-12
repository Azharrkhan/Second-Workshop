package com.bl.workshop;

public class Abstraction {
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		triangle.lines();
	}
}

interface Shape {
	void lines();
}

class Triangle implements Shape {

	@Override
	public void lines() {
		System.out.println("Triangle has three lines");

	}
}