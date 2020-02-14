package com.javaex.practice04.problem05;

public class SoundApp {
	public static void main(String[] args) {
		printSound(new Cat());
		
		int x = 1;
		int y = x++;
		x = 1;
		int z = ++x;
		
		System.out.println(y +" "+ z);
	}

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
