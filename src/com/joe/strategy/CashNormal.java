package com.joe.strategy;

public class CashNormal extends CashSuper {

	@Override
	public Double acceptCash(Double money) {
		return money;
	}

}