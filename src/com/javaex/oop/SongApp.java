package com.javaex.oop;

public class SongApp {
	public static void main(String[] args) {
		Song s = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		s.showInfo();
		
		Song s1 = new Song();
		s1.setTitle("거짓말");
		s1.setArtist("BIGBANG");
		s1.setAlbum("Always");
		s1.setComposer("G-DRAGON");
		s1.setYear(2007);
		s1.setTrack(2);
		s1.showInfo();
		
		s.setTitle("벚꽃엔딩");
		s.setArtist("버스커버스커");
		s.setAlbum("버스커버스커1집");
		s.setComposer("장범준");
		s.setYear(2012);
		s.setTrack(4);
		s.showInfo();
		
		Song Song2 = new Song("BTS", "DNA");
		Song2.showInfo();
		
		Song Song22 = new Song("BB", "AAA");
		Song22.showInfo();
	}
}
