package com.javaex.helloworld;

import java.util.Scanner;

public class IfelseNumber {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 \n숫자: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다.");
		} else if (num > 0) {
			System.out.println("양수입니다.");
			if(num % 2 == 1) {
				System.out.println("+홀수입니다.");
			} else {
				System.out.println("+짝수입니다.");
			}
		} else {
			System.out.println("음수입니다.");
			if(num % 2 == 1) {
				System.out.println("-홀수입니다.");
			} else {
				System.out.println("-짝수입니다.");
			}
		}
		
		sc.close();
	}
}
