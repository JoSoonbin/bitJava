package com.javaex.practice03.problem05;

public class StringUtil {
	public static String concatString(String[] args) {
		String s = "";
		for (int i = 0; i < args.length; i++) {
//			s += args[i];
			s = s.concat(args[i]); // 참조자료형은 메소드를 사용하는게 좋다.
		}
		return s;
	}
}
