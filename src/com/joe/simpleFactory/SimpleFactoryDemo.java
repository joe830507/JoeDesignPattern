package com.joe.simpleFactory;

public class SimpleFactoryDemo {

	public static void main(String[] args) {
		Operation add = OperationFactory.createOperation("+");
		add.setNum1(2d);
		add.setNum2(4d);
		Operation substract = OperationFactory.createOperation("-");
		substract.setNum1(2d);
		substract.setNum2(4d);
		Operation multiple = OperationFactory.createOperation("*");
		multiple.setNum1(2d);
		multiple.setNum2(4d);
		Operation divide = OperationFactory.createOperation("/");
		divide.setNum1(2d);
		divide.setNum2(4d);
		System.out.println(add.getResult());
		System.out.println(substract.getResult());
		System.out.println(multiple.getResult());
		System.out.println(divide.getResult());
	}
}
