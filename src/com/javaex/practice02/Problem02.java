package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		// 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요
		double avg; 
		int sum = 0;
		
		int[] intArray = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요>>");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		
		avg = sum/intArray.length;
		System.out.println("평균은 " + avg + " 입니다.");
		
		sc.close();
	}
}
