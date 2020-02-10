package com.javaex.helloworld;

import java.util.Scanner;

public class IfScore {
	public static void main(String[] args) {
		// 점수를 입력받고 60점 이상일때 합격
		// 60미만일때 불합격
		System.out.print("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
}
