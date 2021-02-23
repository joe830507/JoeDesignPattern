package com.joe.interface_segregation;

public class ConcreteTool implements ToolA, ToolB {

	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	@Override
	public void methodC() {
		System.out.println("methodC");
	}

	@Override
	public void methodD() {
		System.out.println("methodD");
	}

}
