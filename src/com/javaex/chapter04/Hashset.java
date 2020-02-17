package com.javaex.chapter04;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> aset = new HashSet<Integer>();

		while (aset.size() <= 5) {
			int num = (int) (Math.random() * 45) + 1;
			aset.add(num); // 중복된 데이터는 들어가지 않음
		}

		//출력 
//		for (int i : aset) {
//			System.out.println("값:" + i);
//		}

		// 출력
		Iterator<Integer> it = aset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
