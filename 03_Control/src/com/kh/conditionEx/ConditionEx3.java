package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	if 문으로 정수를 비교할 수 있고, 실수를 비교할 수 있고, 문자열 문자 등 모든 것을 비교할 수 있음
	
	대표적으로 정수 비교와 문자열 비교가 있음
	
	= 는 equal
	
	정수 비교
		if (숫자1 == 숫자2) {
			숫자1과 숫자2가 같을 때 실행할 출력문;
		}
	
	문자열 비교
		if (문자열1.equals("문자열2")) {
			문자열1과 문자열2가 같을 때 실행할 출력문;
		}
		
		문자열을 String 변수명에 넣어준다면 "문자열" 큰 따옴표를 붙여서 적지 않고
		지정해준 변수명을 적어주면 된다.
		
		String str = "문자열";
		if (str.equals(str)) {
			System.out.println("문자열이 동일합니다");
		}
		if ("문자열".equals(str)) {
			System.out.println("문자열이 동일합니다");
		}
		if (str.equals("문자열")) {
			System.out.println("문자열이 동일합니다");
		}
	*/
	
	public static void main(String[] args) {
		//정수 비교
		int number = 10;
		
		//만약에 숫자가 10이라면
		if (number == 10) {
			System.out.println("숫자가 동일합니다.");
		}
		
		//문자열 비교
		String str = "hello";
		
		//만약에 두 문자열이 같다면
		if (str.equals("hello") ) {
			System.out.println("두 문자열이 같습니다.");
		}
		
		String str1 = "둘";
		String str2 = "";
		
		if ("둘".equals(str1)) {
			System.out.println("모두 둘 입니다.");
		}

	}

}
