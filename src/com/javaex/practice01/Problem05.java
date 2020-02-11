package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		// 입력값까지의 홀수 짝수의 합을 출력
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		if (num % 2 == 1) {
			for (int i = 1; i <= num; i++) { // i+=2 로 증가를 시켜주면 아래 조건문이 필요가 없어진다.
				if (i % 2 == 0) {
					continue;
				}
				sum += i;
			}
		} else {
			for (int i = 2; i <= num; i++) {
				if (i % 2 == 1) {
					continue;
				}
				sum += i;
			}
		}
		System.out.println("입력값은 " + num + ", 합은 " + sum + "입니다.");

		/*
		 * int num = sc.nextInt(); int sum = 0; int startNum; if(num%2==1) startNum = 1;
		 * else startNum =2;
		 * 
		 * for(int i = startNum; i <= num; i=i+2) { sum += i; }
		 * System.out.println("입력값은 " + num + ", 합은 " + sum + "입니다.");
		 */
		
		sc.close();
	}
}
