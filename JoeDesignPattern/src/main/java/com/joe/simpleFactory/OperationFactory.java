package com.joe.simpleFactory;

public class OperationFactory {

	public static Operation createOperation(String operationName) {

		Operation operation = null;
		switch (operationName) {
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSubstract();
			break;
		case "*":
			operation = new OperationMultiple();
			break;
		case "/":
			operation = new OperationDivide();
			break;
		default:
			throw new RuntimeException("Wrong operationName");
		}
		return operation;
	}
}
