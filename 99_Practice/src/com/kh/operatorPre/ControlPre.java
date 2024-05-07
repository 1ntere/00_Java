package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	
	
	//실습문제 1번 홀수, 짝수 나타내기
	public static void practice1() {//키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다 출력
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수를 입력하세요 : ");
	int number = sc.nextInt();
	
	//양수이면서 짝수 일때만 짝수입니다.
	//만약에 숫자가 2로 나누었을 때 나머지가 0이라면 짝수이다.
	if (number > 0) {
		if (number % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	} else {
		System.out.println("양수만 입력해주세요.");
	}
	}
	
	public static void practice2() {//세 과목의 점수를 입력 받아 합격 여부 판별하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		//합계와 평균 계산
		int totalScore = korean + english + math;
		double averageScore = (double) totalScore / 3.0;
		
		//합격 여부 판별
		if (korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
				System.out.println("국어 점수 : "+korean);
				System.out.println("영어 점수 : "+english);
				System.out.println("수학 점수 : "+math);
				System.out.println("합    계 : "+totalScore);
				System.out.println("평    균 : "+averageScore);
				
				System.out.println("축하합니다, 합격입니다!");
			} else {
			System.out.println("불합격입니다.");
		}		
}
	
	public static void practice3() {// 1 ~ 12 사이의 수를 입력 받아 해당 달의 일수를 출력하기
		/*
		2월 윤달은 생각하지 않습니다
		OO월은 잘못 입력한 달입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이 정수 입력 : ");
		int month = sc.nextInt();
		
		/* switch (month) {
		case 2:
			System.out.println(month+"월은 28일까지 있습니다.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println(month+"월은 30일까지 있습니다.");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월은 31일까지 있습니다.");
			break;
		default :
			System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
		*/
		int daysMonth = 0;
		
		switch (month) {
		case 2:
			daysMonth = 28;
			break;
		case 4: case 6: case 9: case 11: 
			daysMonth = 30;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			daysMonth = 31;
			break;
		default :
			System.out.println(month+"월은 잘못 입력된 달입니다.");
			daysMonth = 0;
			//return;			
		}
		System.out.println(month+"월은 "+daysMonth+"일까지 있습니다.");
		
	}
	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		//출석비율 계산
		double attendPer = (double) attend / 20 * 100;
		
		//평가 비율에 따른 총점 계산
		// 중간 20 기말 30 과제 30 출석 20 = 100점 만점
		double midScore = mid * 0.2;
		double finScore = fin * 0.3;
		double assigScore = assig * 0.3;
		double attendScore = attendPer * 0.2;
				
		double totalScore = midScore + finScore + assigScore + attendScore;

		//
		if (attendPer > 70) {
			System.out.println("==========결과==========");
			System.out.println("중간 고사 점수(20) : "+midScore);
			System.out.println("기말 고사 점수(30) : "+finScore);
			System.out.println("과제 점수       (30): "+assigScore);
			System.out.println("출석 점수       (20): "+attendScore);
			System.out.println("총점 : "+totalScore);
			
			if (totalScore >= 70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
			
		} else {
			System.out.println("==========결과==========");
			System.out.println("Fail [출석 횟수 부족 ("+attend+"/20)]");
		}
	}
	
	public static void main(String[] args) {
		// practice1();
		// practice2();
		practice3();
		// practice4();
		// practice5();

	}

}
