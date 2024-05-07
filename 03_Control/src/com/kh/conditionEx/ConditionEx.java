package com.kh.conditionEx;
// 패키지 : 작성한 파일의 폴더 위치

import java.util.Scanner;

// 조건문 기능용 클래스
public class ConditionEx {
	/* 
	if : 주어진 조건이 참일 때 실행되는 코드 블록
	else : 조건이 거짓일 때 실행되는 코드 블록(필수가 아님)

	사용방법
	if (조건문) {
	조건이 참일 경우 실행할 코드 작성
	만약에 조건문의 조건이 참이 아닐 경우 자동으로 실행 종료
	}
	 */
	
	public static void method1() {//메서드1 : 19세 이상은 성인입니다. 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//만약에 고객의 나이가 19세 이상이라면 성인입니다. 를 출력할 것
		if (age >= 19) {
			System.out.println("성인입니다.");
			// age의 값이 19 이상이면 성인입니다. 출력되게 하기
		} else {
			System.out.println("성인이 아닙니다.");
			// 만약에 age 값이 성인이 아니라면 성인이 아닙니다. 출력되게 하기
		}
	}

	public static void method2() {/*만약에 num이 짝수인 경우 짝수입니다. 출력하기
		num이 홀수인 경우 홀수입니다. 출력하기.*/		
		int num = 2;
		
		//(num이 짝수일 경우) = (num % 2 == 0)
		if (num % 2 == 0) {
			System.out.println("짝수입니다!!!");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	public static void method3() {
		/* 만약에 학생의 나이가 0보다 크고 14보다 작을 때 어린이라고 표현하기
			0~13 어린이
		1. 범위 
			0보다 커야 함
			14보다 작아야 함
		
		14부터는 어린이가 아닙니다.
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age > 0 && age < 14) {
			System.out.println("어린입니다.");
		} else {
			System.out.println("어린이가 아닙니다.");
		}
		
	}
	
	public static void practice1() {/*나이가 10세 이상 20세 미만 일 때는 10대
									이 외에는 10대가 아님 출력*/
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이 : ");
		int age = sc.nextInt();
	
		if (age >= 10 && age < 20) {
		System.out.println("10대 입니다.");
		} else {
		System.out.println("10대가 아닙니다.");
		}
	}
	
	public static void practice2() {/*나이가 80세 이상이면 80세 이상입니다. 출력하기*/	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("나이 : ");
		int age = sc.nextInt();
	
		if (age >= 80) {
		System.out.println("80세 이상입니다.");
		} else {
			System.out.println("80세 미만입니다.");
		}
	}
	
	// 최종메서드
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		practice2();

	}

}
