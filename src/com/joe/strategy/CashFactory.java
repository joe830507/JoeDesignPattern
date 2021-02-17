package com.joe.strategy;

public class CashFactory {

	public static CashSuper createCashAccept(String type) {
		CashSuper cashSuper = null;
		switch (type) {
		case "Normal":
			cashSuper = new CashNormal();
			break;
		case "300 dollars get 100 dollars free":
			cashSuper = new CashReturn(300d, 100d);
			break;
		case "get 20% free":
			cashSuper = new CashRebate(0.8d);
			break;
		default:
			cashSuper = new CashNormal();
			break;
		}
		return cashSuper;
	}
}