package com.javaex.abstractpack;

public class PhoneApp {
	public static void main(String[] args) {
		Telephone tp = new Telephone("02-111-2222");
		Smartphone sp = new Smartphone("010-9999-8888");
		
		tp.power(true);
		tp.call();
		
		sp.turnOn();
		sp.call();
		sp.searchInternet("www.naver.com");
		sp.turnOff();
	}
}
