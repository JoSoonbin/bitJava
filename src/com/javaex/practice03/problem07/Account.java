package com.javaex.practice03.problem07;

public class Account {
	private String accountNo, name, phone;
	private int balance;

	// 조회
	private String date;
	private int inMoney, outMoney, totalMoney;

	public Account() { }

	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public Account(String accountNo, String name, String phone) {
		this.accountNo = accountNo;
		this.name = name;
		this.phone = phone;
	}

	public Account(String date, int inMoney, int outMoney, int totalMoney) {
		this.date = date;
		this.inMoney = inMoney;
		this.outMoney = outMoney;
		this.totalMoney = totalMoney;
	}

	public String getName() { return this.name; }
	public String getPhone() { return this.phone; }
	public String getDate() { return this.date; }
	public int getInMoney() { return this.inMoney; }
	
	public void setName(String name) { this.name = name; }
	public void setPhone(String phone) { this.phone = phone; }
	public void setBalance(int balance) { this.balance = balance; }

	public String accountNo() {
//		System.out.println(accountNo);
		return accountNo;
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

	public int changeDateType(String day) {
		String[] yMd = day.split("-");
		String s = "";

		for (int i = 0; i < yMd.length; i++) {
			s = s.concat(yMd[i]);
		}
		int date = Integer.parseInt(s);
		return date;
	}

	public void checkAccount() {
		String s = "";
		s = "조회결과>> " + this.date + "\t" + this.inMoney + "\t" + this.outMoney + "\t" + this.totalMoney;
		System.out.println(s);
	}
}
