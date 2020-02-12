package com.javaex.practice02;

public class Problem05 {
	public static void main(String[] args) {
		// 로또 (중복체크 하기)
		// 이중 반복문 제어하기
		int[] no = new int[6];

		for (int i = 0; i < no.length; i++) {
			no[i] = (int) (Math.random() * 45) + 1;

			// 중복검사
			// i는 현재 입력된 방번호 <-- 중복인지 검사해야 됨
			// j는 비교대상 [0]부터 순서대로 검사해서 i이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
			for (int j = 0; j < i; j++) {
				if(no[i] == no[j]) {
					i--; 
					break;
				}
			}
		}

		for (int j = 0; j < no.length; j++) {
			System.out.print(no[j] + " ");
		}
	}
}
