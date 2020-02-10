package com.javaex.helloworld;

import java.util.Scanner;

public class ConsoleIo {
	public static void main(String[] args) {
		// 이름을 입력받아 출력하는 프로그램
		System.out.print("이름을 입력해주세요 \n이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("당신의 이름은 " + name + "입니다.\n");
			    
				
		//이름과 나이를 입력받아 출력하는 프로그램
		System.out.print("이름을 입력해주세요 \n이름: ");
		name = sc.nextLine();
		System.out.print("나이를 입력해주세요 \n나이: ");
		int age = sc.nextInt();
		System.out.println("당신의 이름은 " + name + ", 나이는 " + age + "입니다.\n");
			    
		sc.close();
	}
}
