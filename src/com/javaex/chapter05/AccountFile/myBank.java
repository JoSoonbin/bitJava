package com.javaex.chapter05.AccountFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
 *  은행 프로그램
 *  계좌번호에 해당하는 file 만들고
 *  (1)예금(입금) (2)출금  (3)잔액
 *  
 *  1. 계좌번호 입력받고
 *  2. 계좌종류대로 수행
 *  3. file에 해당내역 기록
 */
public class myBank {
	public static void main(String[] args) {
		Date d = new Date();
		boolean run = true, run2 = true;
		int money = 0; // 잔고
		String s; //
		int calcuMoney;

		while (run) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("계좌번호를 입력하세요");
				String accNum = sc.nextLine();
				run2 = true;
				File f = new File("D://javastudy/Account" + accNum + "이용 내역.txt");
				FileWriter fw = new FileWriter(f, true);
				fw.append(d + " " + accNum + "계좌 이용 내역\n");
				while (run2) {
					System.out.println("원하는 서비스를 입력하세요.");
					System.out.println("1.입금  | 2.출금  | 3.잔고  | 4.종료 후 다른 계좌 이용  |  5. 종료 ");
					int service = sc.nextInt();
					if (service == 1) {
						// 잔고 + 예금
						calcuMoney = sc.nextInt();
						if (calcuMoney <= 0) {
							System.out.println("잘못된 금액을 입력하였습니다.");
						} else {
							money += calcuMoney;
							s = Integer.toString(money);
							System.out.println(calcuMoney + "원 입금");
							fw.append(s + "원 입금하였습니다.");
							fw.append("\r\n");
						}
					} else if (service == 2) {
						// 잔고 - 출금
						calcuMoney = sc.nextInt();
						if (calcuMoney == 0 || calcuMoney < 0) {
							System.out.println("잘못된 금액을 입력하였습니다.");
						} else if (calcuMoney > money) {
							System.out.println("잔액이 부족합니다");
						} else {
							money -= calcuMoney;
							s = Integer.toString(money);
							System.out.println(calcuMoney + "원 출금");
							fw.append(s + "원 출금하였습니다.");
							fw.append("\r\n");
						}
					} else if (service == 3) {
						// 잔고 출력
						System.out.println("현재 잔고 :" + money);
						fw.append("현재 잔고 : " + money);
						fw.append("\r\n");
					} else if (service == 4) {
						System.out.println("계좌 변경");
						money = 0;
						fw.close();
						run2 = false;
					} else {
						System.out.println("종료");
						run2 = false;
						run = false;
						fw.close();
						sc.close();
					}
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
	}
}
