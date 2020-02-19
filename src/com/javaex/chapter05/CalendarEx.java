package com.javaex.chapter05;
import java.util.Calendar;

public class CalendarEx {
	public static void printCalendarSimple(Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int hourO
	}
	
	public static void main(String[] args) {
		while(true) {
			Calendar now = Calendar.getInstance();
			printCalendarSimple(now);
		}
		
	}
}