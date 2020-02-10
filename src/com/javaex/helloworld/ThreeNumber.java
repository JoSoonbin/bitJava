package com.javaex.helloworld;

import java.util.Scanner;

public class ThreeNumber {
	public static void main(String[] args) {
//		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		// 조건문
//		if(num % 3 == 0) {
//			System.out.println(num + "은(는) 3의 배수입니다.");
//		} else {
//			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
//		}
		
		// 반복문 + 조건문
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if (num == 0) {
				System.out.println("종료");
				break;
			}else if(num % 3 == 0) {
				System.out.println(num + "은(는) 3의 배수입니다.");
			} else if(num % 3 == 1) {
				System.out.println(num + "은(는) 3의 배수가 아닙니다.");
			}
		}
		
		sc.close();
	}
}
