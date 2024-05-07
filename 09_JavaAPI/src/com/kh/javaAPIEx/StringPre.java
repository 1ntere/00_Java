package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		//Substring 메서드를 사용해서 문자열의 Today 추출
		String 문제1 = "Today is a beautiful day.";
		String 정답1 = 문제1.substring(0,5);
		System.out.println(정답1);
		
		//toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programing is fun and challenging";
		String 정답2 = 문제2.toUpperCase();
		System.out.println(정답2);
		
		//toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 정답3 = 문제3.toLowerCase();
		System.out.println(정답3);
		
		//split 사용해서 문자열을 " "로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] 정답4 = 문제4.split(" ");
		for (String a : 정답4) {
			System.out.println(a);
		}
		
		//replace 사용해서 more을 less 로 대체
		String 문제5 = "the more, the better";
		String 정답5 = 문제5.replace("more", "less");
		System.out.println(정답5);
		
		//charAt 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char 정답6 = 문제6.charAt(6);//h
			//charAt으로 가져온 것은 String이 아니라 char이다.
		System.out.println(정답6);
		
		//Substring 메서드를 사용해서 his 부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 정답7 = 문제7.substring(14,문제7.length());
		System.out.println(정답7);
	}
}
