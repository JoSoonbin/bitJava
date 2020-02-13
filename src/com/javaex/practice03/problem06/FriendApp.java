package com.javaex.practice03.problem06;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요.");

		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 입력받기
			String fInfo = sc.nextLine();
			// 입력받은 친구정보를 공백으로 분리
			String[] infoArr = fInfo.split(" ");
			// Friend 객체 생성하여 데이터 넣기0
			friendArray[i] = new Friend();
			// 배열에 추가하기
			friendArray[i].setName(infoArr[0]);
			friendArray[i].setPhone(infoArr[1]);
			friendArray[i].setSchool(infoArr[2]);
		}

		// 출력
		for (int i = 0; i < friendArray.length; i++) {
			friendArray[i].showInfo();
		}

		sc.close();
	}
}
