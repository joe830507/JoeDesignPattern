package com.joe.simpleFactory;

public class OperationDivide extends Operation {

	@Override
	protected Double getResult() {
		return getNum1() / getNum2();
	}

}
