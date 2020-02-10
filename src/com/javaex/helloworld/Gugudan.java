package com.javaex.helloworld;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int dan;
		int i = 1;
		
//		System.out.print("단을 입력해주세요\n단: ");
//		dan = sc.nextInt();
		
		// while
//		while(i < 10) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//			i++;
//		}
		
		// for
//		for(i = 1; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}
		
		// Gugudan 2~9
		for(i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
