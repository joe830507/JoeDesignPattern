package com.joe.strategy;

public class CashRebate extends CashSuper {

	private Double rebate;

	public CashRebate(Double rebate) {
		this.rebate = rebate;
	}

	public CashRebate(String rebate) {
		this.rebate = Double.valueOf(rebate);
	}

	@Override
	public Double acceptCash(Double money) {
		return this.rebate * money;
	}

}
