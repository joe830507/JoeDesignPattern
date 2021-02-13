package com.joe.strategy;

public class CashReturn extends CashSuper {

	private Double moneyCondition;
	private Double moneyReturn;

	public CashReturn(Double moneyCondition, Double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	public CashReturn(String moneyCondition, String moneyReturn) {
		this.moneyCondition = Double.valueOf(moneyCondition);
		this.moneyReturn = Double.valueOf(moneyReturn);
	}

	@Override
	public Double acceptCash(Double money) {
		Double result = money;
		if (money >= moneyCondition) {
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return result;
	}

}
