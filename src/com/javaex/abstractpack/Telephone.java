package com.javaex.abstractpack;

public class Telephone extends Phone {
	private boolean powerOn = false;
	
	public Telephone(String number) {
		super.number = number;
	}
	
	public void power(boolean power) {
		powerOn = power;
		String p = powerOn? "켜짐":"꺼짐";
		System.out.println(super.number + "의 전원: " + p);
	}
	
	public void call() {
		System.out.println(super.number + "로 전화걸기!");
		
	}
}
