package com.javaex.practice03.problem06;

public class Friend {
	private String name, phone, school;

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void showInfo() {
		System.out.println("이름:" + name + ", 핸드폰:" + phone + ", 학교:" + school);
	}
}
