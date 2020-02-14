package com.javaex.extendspack;

public class Student extends Person {
	private String schoolName;
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String school) {
		super("●●●", 0);
		this.schoolName = school;
	}

	public Student(String name, int age, String school) {
		super(name, age);
		this.schoolName = school;
	}

	public String getSchool() {
		return schoolName;
	}

	public void setSchool(String school) {
		this.schoolName = school;
	}

	public void showInfo() {
		System.out.println("이름:" + super.name + ", 나이:" + getAge() + ", 학교:" + schoolName);
	}
}
