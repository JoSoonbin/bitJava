package com.javaex.chapter05;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte[] b = { 7, 51, 3, 4, -1, 34 };
		try {
			FileOutputStream fout = new FileOutputStream("D://javaStudy/byteTest.txt");
			for (int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("D://javaStudy/byteTest.txt에 저장할 수 없었습니다. 경로명을 확인해주세요.");
			return;
		}
		System.out.println("D://javaStudy/byteTest.txt을 저장하였습니다.");
	}
}
