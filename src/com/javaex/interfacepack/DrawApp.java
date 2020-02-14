package com.javaex.interfacepack;

public class DrawApp {
	public static void main(String[] args) {
		Shape r = new Rectangle(5, 5);

		// 객체가 Drawable 인터페이스를 구현하였는가?
		System.out.println(r instanceof Drawable);
		// 객체가 Rectangle 인터페이스를 구현하였는가?
		System.out.println(r instanceof Rectangle);

		System.out.println("넓이:" + r.getArea());

		Rectangle r2 = new Rectangle(7, 7);
		r2.draw();
	}
}
