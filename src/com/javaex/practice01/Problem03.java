package com.javaex.practice01;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		// 숫자 5개를 입력받고, 그 중에 가장 큰 수를 출력하세요
		int a = 0, b = 0, max = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			a = sc.nextInt();

			if (a > b) {
				max = a;
				b = a;
			} else {
				max = b;
				b = a;
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		
		sc.close();
	}
}
