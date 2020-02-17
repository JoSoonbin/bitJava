package com.javaex.chapter05.AccountFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.javaex.practice03.problem07.Account;

public class AccountApp {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
		File[] subFiles = dir.listFiles();
		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일크기: " + f.length());
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		FileWriter fout = null;

		File f2 = new File("D://javaStudy//" + line + ".txt");
		if (!f2.exists()) {
			System.out.println(">>존재함!!");
			f2 = new File("D://javaStudy//" + line + ".txt");
		}
		listDirectory(new File("D://javaStudy"));
//		f2.renameTo(new File(line));File f2 = new File("D://javaStudy//" + line + ".txt");

		try {
//			fout = new FileWriter("D://javaStudy/Account.txt", false); // true면 이어쓰기
			fout = new FileWriter(f2, true);

			fout.write("\n-------------------------\n");
			fout.write("예금\t출금\t잔액\n");
			fout.write("-------------------------\n");

			while (true) {
				if (line.length() == 0)
					break;

//				fout.write(line, 0, line.length()); // 계좌번호
//				fout.write("\r\n", 0, 2);

				boolean run = true;
				int money;
				Account account = new Account(line);
				account.accountNo();

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
						fout.write(money + "\t" + 0 + "\t" + account.showBalance() + "\n");
						fout.flush();
						break;
					case 2:
						System.out.print("출금액> ");
						money = sc.nextInt();
						account.withdraw(money);
						fout.write(0 + "\t" + money + "\t" + account.showBalance() + "\n");
						fout.flush();
						break;
					case 3:
						System.out.print("잔고액> ");
						account.showBalance();
						fout.write(account.showBalance());
						fout.flush();
						break;
					case 4:
						System.out.println("종료");
						run = false;
						fout.close();
						break;
					default:
						System.out.println("다시 입력해주세요.");
						break;
					}
				}

			}
		} catch (IOException e) {
			System.out.println("입출력오류");
			e.printStackTrace();
		}
		sc.close();
	}
}
