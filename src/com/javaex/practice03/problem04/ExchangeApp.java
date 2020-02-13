package com.javaex.practice03.problem04;

public class ExchangeApp {
	public static void main(String[] args) {
		
		double dollar;
		double won;
		
		Exchange.setRate(1118.70);
		
		won = 1000000;	
		System.out.println("백만원은 " + Exchange.wonToDollar(won) + "달러 입니다.");
		
		dollar = 100;	
		System.out.println("백달러는 " + Exchange.dollarToWon(dollar) + "원 입니다.");
	}
}
