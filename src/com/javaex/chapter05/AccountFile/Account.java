package com.javaex.chapter05.AccountFile;

public class Account {
	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

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

//	public void showBalance() {
//		System.out.println(balance);
//	}
	
	public int showBalance() {
		return balance;
	}
}
