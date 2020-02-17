package com.javaex.chapter03;

public class StringMethod {
	public static void main(String[] args) {
		String greeting = "Hello JAVA!";
		System.out.println(greeting.charAt(0));
		System.out.println(greeting.charAt(10));
		System.out.println(greeting.substring(1, 3));

		String a = "a";
		String b = "a";
		if (a.equals(b)/*a == b */) {
			// 주소값이 같으리라는 보장이 없다. 컴퓨터 환경에 따라 다르기 때문에!
			// ==를 사용하기 보다는 equals()를 사용하는게 안전하다
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		System.out.println(a.toUpperCase());
		System.out.println(">>".concat(greeting).concat(b));

	}
}
