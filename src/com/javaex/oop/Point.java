package com.javaex.oop;

public class Point {
	private int x, y;

	public Point() {
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	public void draw(int x, int y) {
		System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
	}
}
