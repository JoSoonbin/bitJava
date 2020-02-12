package com.javaex.practice02;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		// 키보드에서 정수로 된 둘의 액수를 입력받아
		// 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원 동전, 50원동전, 1원동전
		// 각 몇개로 변환되는지 작성 하세요

		int[] wonArray = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		for (int i = 0; i < wonArray.length; i++) {
			int count = 0;
			count = money / wonArray[i];
			money = money % wonArray[i]; // money = money - (count*wonArray[i]);
			System.out.println(wonArray[i] + "원: " + count + "개");
		}

		sc.close();
	}
}
