package com.javaex.extendspack;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y) {
		super(x, y);
	}

	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showInfo() {
		System.out.println("x:" + super.x + ", y:" + super.y + ", color:" + color);
	}

}
