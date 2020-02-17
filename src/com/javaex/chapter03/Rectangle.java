package com.javaex.chapter03;

public class Rectangle {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;

		if (this.width == r.width && this.height == r.height) {
			return true;
		} else if (Area(this.width, this.height) == Area(r.width, r.height)) {
			return true;
		} else {
			return false;
		}

//		if (this.hashCode() == r.hashCode()) {
//			System.out.println(">hashCode");
//			return true;
//		} else if (this.width == r.width && this.height == r.height) {
//			System.out.println(">width, height ==");
//			return true;
//		} else {
//			System.out.println(">width, height !=");
//			return false;
//		}
	}

	public int Area(int x, int y) {
		return x * y;
	}
}
