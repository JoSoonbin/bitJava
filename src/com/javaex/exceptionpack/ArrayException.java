package com.javaex.exceptionpack;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[] { 3, 6, 9 };

		try {
			System.out.println(intArray[3]);
		} catch (Exception e) {
//			System.out.println(e.toString()); // 발생한 에러 내용 출력
//			System.out.println(intArray[2]);
			// catch에 아무것도 안 써도 되긴 하지만...
		} finally {
			System.out.println("ByeBye~");
		}

		System.out.println("Program end...");
	}
}
