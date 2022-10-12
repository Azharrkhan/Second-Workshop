package com.bl.workshop;

public class AbstractClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Animal Dog1 = new Dog();
		Dog1.eat();
	}
}

class Dog extends Animal {

	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
}

abstract class Animal {
	
	public Animal() {

	}
	abstract void eat();
}