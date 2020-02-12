package com.javaex.oop;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		p1.draw();
		p2.draw();
		p1.draw(5, 5);
		p2.draw(10, 23);
		
	}
}
