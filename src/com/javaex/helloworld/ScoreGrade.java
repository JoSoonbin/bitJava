package com.javaex.helloworld;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		// switch
//		switch (score / 10) {
//		case 10:
//		case 9:
//			System.out.println("A등급");
//			break;
//		case 8:
//			System.out.println("B등급");
//			break;
//		case 7:
//			System.out.println("C등급");
//			break;
//		case 6:
//			System.out.println("D등급");
//			break;
//		default:
//			System.out.println("F등급");
//			break;
//		}
		
		// if
		if(score >= 90) {
			System.out.println("A등급");
		} else if(score >= 80 && score <= 89) {
			System.out.println("B등급");
		} else if(score >= 70 && score <= 79) {
			System.out.println("C등급");
		} else if(score >= 60 && score <= 69) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		sc.close();
	}
}
