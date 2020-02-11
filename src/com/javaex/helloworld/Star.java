package com.javaex.helloworld;

public class Star {
	public static void main(String[] args) {
		for(int i = 1; i < 7; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for(int i = 0; i < 6; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k < (i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
