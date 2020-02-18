package com.javaex.practice03.problem07;

public class Account {
	private String accountNo, name, phone;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public Account(String accountNo, String name, String phone) {
		this.accountNo = accountNo;
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() { return this.name; }
	public String getPhone() { return this.phone; }
	
	public void setName(String name) { this.name = name; }
	public void setPhone(String phone) { this.phone = phone; }
	public void setBalance(int balance) { this.balance = balance; }

	public void accountNo() {
		System.out.println(accountNo);
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		if (balance >= money)
			balance -= money;
		else
			System.out.println("잔액이 부족합니다!");
	}

	public int showBalance() {
		System.out.println(balance);
		return balance;
	}
}
