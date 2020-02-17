package com.javaex.chapter05;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
//			fin = new FileReader("c://windows/system.ini"); //"D://javaStudy/test.txt"
			fin = new FileReader("D://javaStudy/writeTest.txt"); // write 테스트 확인
			int c;
			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력오류");
		}
	}
}
