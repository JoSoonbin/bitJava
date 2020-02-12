package com.javaex.oop;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		this("name", 0); // default 생성자를 호출하면 기본적으로 this에 있는 값을 생성하도록 한다.
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격: " + price);
	}
	
}
