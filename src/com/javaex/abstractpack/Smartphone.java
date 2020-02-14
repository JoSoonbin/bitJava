package com.javaex.abstractpack;

public class Smartphone extends Phone {
	@SuppressWarnings("unused")
	private boolean powerOn = false;
	
	public Smartphone(String number) {
		super.number = number;
	}
	
	public void turnOn() {
		powerOn = true;
		System.out.println("핸드폰의 전원을 켭니다.");
	}
	
	public void turnOff() {
		powerOn = false;
		System.out.println("핸드폰의 전원을 끕니다.");
	}
	
	public void call() {
		System.out.println(super.number + "로 전화걸기!");
	}
	
	public void searchInternet(String url) {
		System.out.println(url + "검색을 시작합니다.");
	}
	
}
