package com.javaex.chapter05.phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineText {
	public static void main(String[] args) throws IOException {
		try {
			// 파일 객체 생성
			File file = new File("D://javaStudy/workspace/javaEx/src/com/javaex/chapter05/phone/PhoneDB.txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			String a = "";

			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
				String[] s = line.split(" ");
				for (int i = 0; i < s.length; i++) {
					System.out.println(s[i]);
					a = s[s.length - 1];
				}
			}
			System.out.println(">>" + a);
			// .readLine() 은 끝에 개행문자를 읽지 않는다.
			bufReader.close();
		} catch (FileNotFoundException e) {
			// To do
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
