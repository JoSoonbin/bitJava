package com.javaex.helloworld;

import java.util.Scanner;

public class ClassRoom {
	public static void main(String[] args) {
		System.out.print("과목을 선택하세요\n(1.자바\t2.C\t3.C++\t4.파이썬)\n과목번호: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// if
//		if(num == 1) {
//			System.out.println("R101호 입니다");
//		} else if(num == 2) {
//			System.out.println("R202호 입니다");
//		} else if(num == 3) {
//			System.out.println("R303호 입니다");
//		} else if(num == 4) {
//			System.out.println("R404호 입니다");
//		} else {
//			System.out.println("상담원에게 문의하세요.");
//		}

		// switch
		switch (num) {
		case 1:
			System.out.println("R101호 입니다");
			break;
		case 2:
			System.out.println("R202호 입니다");
			break;
		case 3:
			System.out.println("R303호 입니다");
			break;
		case 4:
			System.out.println("R404호 입니다");
			break;
		default:
			System.out.println("상담원에게 문의하세요.");
			break;
		}

		sc.close();
	}
}
