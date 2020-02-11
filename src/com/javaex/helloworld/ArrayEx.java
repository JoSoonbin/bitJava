package com.javaex.helloworld;

public class ArrayEx {
	public static void main(String[] args) {
//		int[] intArray = new int[5];
//		intArray[0] = 3;
//		intArray[1] = 6;
//		intArray[2] = 9;
//		
//		int result = 0;
//		for(int i = 0; i <= intArray.length; i++) {
//			result = result + intArray[i];
//		}
//		System.out.println("intArray의 4번째 값: " + intArray[3]);

		// Lotto Array
//		int[] lottoArray = new int[6];
//		for(int i = 0; i < lottoArray.length; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			lottoArray[i] = num;
//		}
//		
//		for(int i = 0; i < lottoArray.length; i++) {
//			System.out.print(lottoArray[i] + " ");
//		}

		// 배열비교
		int[] leftArray = new int[] { 10, 20, 30 };
		int[] rightArray = new int[] { 10, 20, 30 };

		for (int i = 0; i < leftArray.length; i++) {
			if (leftArray.length == rightArray.length) {
				if (leftArray[i] == rightArray[i]) {

				} else {
					System.out.println(i + " 번째 값이 다릅니다.");
				}
			} else {
				System.out.println("두 배열의 길이가 다릅니다.");
				break;
			}
		}

	
	}
}
