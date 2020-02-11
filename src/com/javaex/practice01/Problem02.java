package com.javaex.practice01;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		// 숫자를 입력받아 갯수만큼 반복 출력
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
