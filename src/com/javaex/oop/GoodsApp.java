package com.javaex.oop;
//import com.javaex.oop.Goods;

public class GoodsApp {
	public static void main(String[] args) {
		// 생성방법1
		Goods camera = new Goods("nikon", 400000);
		System.out.println(">" + camera.getName() + ", " + camera.getPrice());

		// 생성방법2
		Goods camera2 = new Goods();
		camera2.setName("Nikon");
		camera2.setPrice(400001);
		System.out.println(">>" + camera2.getName() + ", " + camera2.getPrice());

		Goods noteBook = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
//		System.out.println(">" + noteBook.getName() + ", " + noteBook.getPrice());
//		System.out.println(">" + cup.getName() + ", " + cup.getPrice());
		noteBook.showInfo();
		cup.showInfo();
		
		Goods defaultGoods = new Goods();
		defaultGoods.showInfo();
	}
}
