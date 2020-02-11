package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		// 숫자 맞추기 게임
		char keepGame;
		int minNum = 1, maxNum = 100;
		int randomNum = (int)(Math.random() * maxNum) + minNum;
		System.out.println(">>" + randomNum);
		System.out.println("==========================");
		System.out.println("    [숫자 맞추기 게임 시작]");
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print(">>");
			num = sc.nextInt();
			if(num == randomNum) {
				System.out.println("맞았습니다!\n게임을 다시 하시겠습니까?(y/n)");
				keepGame = sc.next().charAt(0);
				if(keepGame == 'y') {
					randomNum = (int)(Math.random() * maxNum) + minNum;
					continue;
				}else {
					System.out.println("종료!");
					break;
				}
			} else if(num > randomNum) {
				System.out.println("더 낮게");
			} else {
				System.out.println("더 높게");
			}
		}
		
		sc.close();
	}
}
