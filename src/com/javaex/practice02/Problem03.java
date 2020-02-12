package com.javaex.practice02;

public class Problem03 {
	public static void main(String[] args) {
		// 주어진 문자열의 공백을 ','로 변경 후 출력
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		// 문장 출력
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();

		// 배열을 검사하여 공백이면 콤마로 변경
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}

		// 문장 출력
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
	}
}
