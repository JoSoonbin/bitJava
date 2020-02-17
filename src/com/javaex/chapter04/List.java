package com.javaex.chapter04;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(2, 10); // add(index번호, 넣을 값)
		arrList.remove(4);

		System.out.println(arrList.subList(2, 5));

		for (int i : arrList) {
			System.out.println("값:" + i);
		}
	}
}
