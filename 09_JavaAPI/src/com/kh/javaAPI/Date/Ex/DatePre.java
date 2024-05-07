package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		//SimpleDateFormat 활용해서 날짜 만들기
		Date date = new Date();

		//1. 날짜 : yyyy-MM-dd
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시1 = 날짜1.format(date);
		System.out.println("현재 날짜 : "+날짜표시1);
		
		//2. 시간 : HH:mm:ss
		SimpleDateFormat 날짜2 = new SimpleDateFormat("HH:mm:ss");
		String 날짜표시2 = 날짜2.format(date);
		System.out.println("현재 시간 : "+날짜표시2);
		
		// 3. 날짜와 시간 : yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜표시3 = 날짜3.format(date);
		System.out.println("현재 날짜와 시간 : "+날짜표시3);
		
		// 4. 요일 : E
		SimpleDateFormat 날짜4 = new SimpleDateFormat("E");
		String 날짜표시4 = 날짜4.format(date);
		System.out.println("현재 요일 : "+날짜표시4);
	}
}
