package com.joe.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CashContext cashContext1 = new CashContext("Normal");
		Double result1 = cashContext1.getResult(700d);
		CashContext cashContext2 = new CashContext("300 dollars get 100 dollars free");
		Double result2 = cashContext2.getResult(700d);
		CashContext cashContext3 = new CashContext("get 20% free");
		Double result3 = cashContext3.getResult(700d);
		CashContext cashContext4 = new CashContext("no discount");
		Double result4 = cashContext4.getResult(700d);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}