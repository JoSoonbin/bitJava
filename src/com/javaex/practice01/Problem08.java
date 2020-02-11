package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {

		int num, money;
		int sum = 0;
		boolean mybank = false;

		while (!mybank) {
			System.out.println();
			System.out.println("==============================");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("==============================");
			System.out.print("선택>");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("예금액>");
				money = sc.nextInt();
				sum += money; // sum += sc.nextInt();
				continue;
			case 2:
				System.out.print("출금액>");
				money = sc.nextInt();
				sum -= money;
				continue;
			case 3:
				System.out.println("잔고액>" + sum);
				continue;
			case 4:
				System.out.println("프로그램 종료");
				mybank = true;
				break;
			default:
				System.out.println("없는 번호입니다. 다시 선택해주세요.");
				continue;
			}
			sc.close();
		}
	}
}
