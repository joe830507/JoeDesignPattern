package com.joe.decorator;

public class ConcreteComponentB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Operated by ConcreteComponentB");
	}

	private void addedBehavior() {
	}
}
