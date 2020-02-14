package com.javaex.practice04.problem02;

public class Depart extends Employee {
	private String department;

	public Depart(String name, int salary, String part) {
		super(name, salary);
		this.department = part;
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + getName() + ", 연봉:" + getSalary() + ", 부서:" + department);
	}
}
