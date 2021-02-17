package com.joe.simpleFactory;

public class OperationSubstract extends Operation {

	@Override
	protected Double getResult() {
		return getNum1() - getNum2();
	}

}
