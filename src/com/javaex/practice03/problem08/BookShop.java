package com.javaex.practice03.problem08;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		boolean run = true;
		Book[] books = new Book[10];
		books[0] = new Book(1, "트와일라잇", "스테파니메이어");
		books[1] = new Book(2, "뉴문", "스테파니메이어");
		books[2] = new Book(3, "이클립스", "스테파니메이어");
		books[3] = new Book(4, "브레이킹던", "스테파니메이어");
		books[4] = new Book(5, "아리랑", "조정래");
		books[5] = new Book(6, "젊은그들", "김동인");
		books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
		books[7] = new Book(8, "귀천", "천상병");
		books[8] = new Book(9, "태백산맥", "조정래");
		books[9] = new Book(10, "풀하우스", "원수연");

		System.out.println("***** 도서 정보 출력하기 *****");
		displayBookInfo(books);

		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("   1.대여 | 2.반납 | 3.목록 | 4.종료");
			System.out.println("----------------------------------");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
				int bnum = sc.nextInt();

				// (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드 0)을 체크 합니다.
				if (books[bnum - 1].getBookNum() == 0) {
					System.out.println(">> " + books[bnum - 1].getTitle() + "이(가) 대여중 입니다. 대여할 수 없습니다.");
					System.out.println();
				} else {
					System.out.println(">> " + books[bnum - 1].getTitle() + "을(를) 대여 했습니다. 재밌게 읽어요~^^");
					System.out.println();
					books[bnum - 1].setBookNum(0);
				}
				break;
			case 2:
				System.out.print("반납할 책의 번호를 입력하세요: ");
				bnum = sc.nextInt();

				if (books[bnum - 1].getBookNum() == 0) {
					System.out.println(">> " + books[bnum - 1].getTitle() + "을(를) 반납했습니다. 감사합니다.");
					books[bnum - 1].setBookNum(bnum);
					System.out.println();
				} else {
					System.out.println(">> 빌린책이 아닙니다!!!!");
				}
				break;
			case 3:
				System.out.println("***** 도서 정보 출력하기 *****");
				displayBookInfo(books);
				break;
			case 4:
				System.out.println("종료~");
				run = false;
				break;
			default:
				break;

			}
		}

		sc.close();

	}

	// (2) 전달받은 배열을 모두 출력하는 메소드
	private static void displayBookInfo(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getBookNum() == 0) {
				books[i].setRental(true);
				books[i].showInfo();
			} else {
				books[i].setRental(false);
				books[i].showInfo();
			}
		}
	}
}
