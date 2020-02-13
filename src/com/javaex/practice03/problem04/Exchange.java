package com.javaex.practice03.problem04;

public class Exchange {
	public static double rate;
	
	public static void setRate(double r) {
		Exchange.rate = r;
	}
	
	static double wonToDollar(double won) {
		return won / rate;
	}
	
	static double dollarToWon(double dallar) {
		return dallar * rate;
	}
}
