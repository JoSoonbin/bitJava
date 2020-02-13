package com.javaex.practice03.problem08;

public class Book {
	private int bookNum;
	private String title, writer;
	private boolean rental;

	public Book() {
	}

	public Book(int bookNum, String title, String writer) {
		this.bookNum = bookNum;
		this.title = title;
		this.writer = writer;
		this.rental = false;
	}

	public String getTitle() {
		return title;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getWriter() {
		return writer;
	}

	public boolean isRental() {
		return rental;
	}

	public void setRental(boolean rental) {
		this.rental = rental;
	}

	public void showInfo() {
		String rentalStr = isRental() ? "대여중" : "재고있음";
		System.out.println("책 제목:" + title + ", 작가:" + writer + ", 대여 여부: " + rentalStr);
	}
}
