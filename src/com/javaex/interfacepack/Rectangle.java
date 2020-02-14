package com.javaex.interfacepack;

public class Rectangle extends Shape implements Drawable {

	private double width, height;

	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public void draw() {
		System.out.println("가로:" + width + ", 세로:" + height + ", 넓이:" + width * height + "인 사각형을 그렸습니다.");
	}

}
