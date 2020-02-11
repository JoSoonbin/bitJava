package com.javaex.practice01;

public class Problem04 {
	public static void main(String[] args) {
		// 숫자 출력
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print((i + j) + "\t");
			}
			System.out.println();
		}
		/*
		 * int i = 1; for(;;) { for(int j=i; j<=i+9; j++) { System.out.print(j+"\t"); }
		 * System.out.println(); if(i>10) break; i++; }
		 */
	}
}
