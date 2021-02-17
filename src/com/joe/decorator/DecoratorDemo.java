package com.joe.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteComponentA componentA = new ConcreteComponentA();
		ConcreteComponentB componentB = new ConcreteComponentB();
		componentA.setComponent(c);
		componentB.setComponent(componentA);
		componentB.operation();
	}
}
