package com.javaex.helloworld;

public class MultiMinNumber {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;

		while (true) {
			if ((i % 6 == 0) && (i % 14 == 0)) {
				count++;
				System.out.println(count + ": " + i);
				if(count == 10)
					break;
			}
			i++;
		}
	}
}
