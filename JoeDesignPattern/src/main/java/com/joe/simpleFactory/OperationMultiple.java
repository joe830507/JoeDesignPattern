package com.joe.simpleFactory;

public class OperationMultiple extends Operation {

	@Override
	protected Double getResult() {
		return getNum1() * getNum2();
	}

}
