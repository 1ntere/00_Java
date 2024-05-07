package com.kh.interfaceEx;

public class 기계실행 {
	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
		
		세탁기 세탁기 = new 세탁기();
		세탁기.전원켜기();
		세탁기.전원끄기();
		
		//어린이용 기계 실행
		어린이용계산기 c1 = new 어린이용계산기();
		c1.전원켜기();
		
		//어린이용 계산기 기능 테스트
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + c1.합(a, b));
		System.out.println(a + " - " + b + " = " + c1.차(a, b));
		System.out.println(a + " * " + b + " = " + c1.곱(a, b));
		System.out.println(a + " / " + b + " = " + c1.몫(a, b));
		System.out.println(a + " % " + b + " = " + c1.나머지(a, b));
		c1.전원끄기();
		
		//중학생계산기 실행
		중학생계산기 m1 = new 중학생계산기();
		m1.전원켜기();
		
		a = 5;
		b = 3;
		/*
		★ 오류 발생
		int a = 5;
		-----
		위에서 이미 a 와 b 의 자료형을 int로 설정해주었기 때문에
		다시 자료형을 쓸 필요가 없다.
		=====
		★ 문제 해결 방안
		a = 5;
		*/
		
		System.out.println(a + " + " + b + " = " + m1.합(a, b));
		System.out.println(a + " - " + b + " = " + m1.차(a, b));
		System.out.println(a + " * " + b + " = " + m1.곱(a, b));
		System.out.println(a + " / " + b + " = " + m1.몫(a, b));
		System.out.println(a + " % " + b + " = " + m1.나머지(a, b));
		m1.전원끄기();
	}
}
