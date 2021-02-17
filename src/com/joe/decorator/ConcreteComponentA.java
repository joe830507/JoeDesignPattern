package com.joe.decorator;

public class ConcreteComponentA extends Decorator {

	@SuppressWarnings("unused")
	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState = "New State";
		System.out.println("Operated by ConcreteComponentA");
	}
}
