package com.joe.interface_segregation;

public class ToolDemo {

	public static void main(String[] args) {
		ConcreteTool concreteTool = new ConcreteTool();
		ToolA toolA = concreteTool;
		ToolB toolB = concreteTool;
		toolA.methodA();
		toolA.methodB();
		toolB.methodC();
		toolB.methodD();
	}
}
