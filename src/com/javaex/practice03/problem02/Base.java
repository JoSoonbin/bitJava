package com.javaex.practice03.problem02;

public class Base {
	public void service(String state) {
		if(state == "낮") {
			day();
		} else if(state.equals("밤")) {
			night();
		} else if(state == "오후") {
			afternoon();
		} else {
			System.out.println("**");
		}
	}
	
	public void day() {
		System.out.println("낮에는 열심히 일하자.");
	}
	
	public void night() {
		System.out.println("night");
	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
}
