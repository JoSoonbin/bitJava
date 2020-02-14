package com.javaex.practice04.problem03;

public class SmartPhone extends MusicPhone {
	public void execute(String str) {
		if (str.equals("앱"))
			app();
		else if (str.equals("음악"))
			playMusic();
		else
			super.execute("010-1234-5678");
	}

	public void app() {
		System.out.println("앱실행");
	}
}
