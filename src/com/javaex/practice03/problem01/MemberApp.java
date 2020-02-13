package com.javaex.practice03.problem01;

public class MemberApp {
	public static void main(String[] args) {
		Member m1 = new Member();
		
		m1.setName("홍길동");
		m1.setId("B20200213");
		m1.setPoint(924);
		
		System.out.println(m1.getName() + ", " + m1.getid() + ", " + m1.getpoint());
	}
}
