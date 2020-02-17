package com.javaex.chapter05;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		byte b[] = new byte[6]; // 비어있는 byte배열
		try {
			FileInputStream fin = new FileInputStream("D://javaStudy/byteTest.txt");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("D://javaStudy/byteTest.txt에서 읽은 배열을 출력합니다.");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i] + " ");
			}
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("D://javaStudy/byteTest.txt에서 읽지 못했습니다. 경로명을 체크해보세요");
		}
	}
}
