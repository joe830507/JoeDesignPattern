package com.joe.simpleFactory;

public class OperationAdd extends Operation {

	@Override
	protected Double getResult() {
		return getNum1() + getNum2();
	}

}
