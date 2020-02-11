package com.javaex.practice01;

public class Problem01 {
	public static void main(String[] args) {
		// 1~100까지의 수, 5의배수면서 7의배수 출력
		for(int i = 1; i <= 100; i++) {
			if(i%5 == 0 && i%7 == 0) {
				System.out.println(i);
			}
		}
	}
}
