package com.javaex.chapter05.AccountFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.javaex.practice03.problem07.Account;

public class AccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>계좌번호를 입력하세요: ");
		String line = sc.nextLine();
		File file = new File("D://javaStudy/Account " + line + ".txt");
		File fileInfo = new File("D://javaStudy/AccountNumber.txt"); // 고객 정보 파일
		FileWriter fout = null;

		// 현재 날짜
		SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String today = now.format(time);

		try {
			boolean run = true;
			int money;
			String accBalance = "-";
			boolean fileExist = false;
			Account account = new Account(line);

			// 고객 정보 가져오기
			if (fileInfo.exists()) {
				FileReader fr = new FileReader(fileInfo);
				BufferedReader br = new BufferedReader(fr);
				String info;
				String[] s;
				while ((info = br.readLine()) != null) {
					System.out.println(info);
					s = info.split(" ");
//					account.setName(s[2]);
//					account.setPhone(s[3]);
					for(int i=0; i<s.length; i++) {
						System.out.println(i+">>"+s[i]);
					}
				}
			}

			// 계좌번호가 존재하면, 잔액 가져오기
			if (file.exists()) {
				fileExist = true;
				System.out.println(">>기존 고객 입니다.");
				// 입력 스트림 생성
				FileReader filereader = new FileReader(file);
				// 입력 버퍼 생성
				BufferedReader bufReader = new BufferedReader(filereader);
				String balresult = "";
				while ((balresult = bufReader.readLine()) != null) {
					String[] s = balresult.split("\t");
					accBalance = s[(s.length) - 1];
				}
				fout = new FileWriter(file, true);
//				bufReader.close();
			} else {
				// line 입력받은거 정보 나누기
				System.out.print(">>신규 고객 입니다. 성명과 연락처를 입력해주세요.\n>>");
				String info = sc.nextLine();
				String[] s = info.split(" ");
				account = new Account(line, s[0], s[1]);

				// 신규 고객 정보 저장하기
				fout = new FileWriter(fileInfo, true);
				fout.append(line + " " + account.getName() + " " + account.getPhone() + "\r\n");
				fout.close();

				file = new File("D://javaStudy/Account " + line + ".txt");
				fout = new FileWriter(file, true);
				fout.write("계좌:" + line + ", 성명:" + account.getName() + ", 연락처:" + account.getPhone() + "\r\n");
				fout.write("------------------------------------------------\n");
				fout.write("날짜\t\t예금\t출금\t잔액\n");
				fout.write("------------------------------------------------\n");
			}

			if (fileExist)
				account.setBalance(Integer.parseInt(accBalance, 10));
			System.out.println("계좌: "+line+", 성명: "+account.getName()+", 연락처: "+account.getPhone());
			while (run) {
				System.out.println();
				System.out.println("------------------------------");
				System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("------------------------------");
				System.out.print("선택> ");
				int menuNo = sc.nextInt();
				switch (menuNo) {
				case 1:
					System.out.print("예금액> ");
					money = sc.nextInt();
					account.deposit(money);
					fout.append(today + "\t+" + money + "\t" + 0 + "\t" + account.showBalance() + "\n");
					break;
				case 2:
					System.out.print("출금액> ");
					money = sc.nextInt();
					account.withdraw(money);
					fout.append(today + "\t" + 0 + "\t-" + money + "\t" + account.showBalance() + "\n");
					break;
				case 3:
					System.out.print("잔고액> ");
					account.showBalance();
					break;
				case 4:
					System.out.println("종료");
					fout.close();
					sc.close();
					run = false;
					break;
				default:
					System.out.println("다시 입력해주세요.");
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("입출력오류");
			e.printStackTrace();
		}
	}
}
