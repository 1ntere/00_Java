package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {
	
	/*
	public static void method1()
	//if 문 활용 : 숫자 값 2개를 받아서 숫자 2개가 일치하는지 확인
	같다면 같습니다. 출력하고, 같지 않다면 같지 않습니다. 출력하기	
	
	public static void method2()
	//if 문 활용 : 문자 값 2개를 받아서 문자 2개가 일치하는지 확인
	
	public static void method3()
	//if 문 활용 : double로 실수 값 2개를 받아서 실수 2개가 일치하는지 확인
	
	*/
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1+" 과 "+num2+" 는 같습니다.");
		} else {
			System.out.println(num1+" 과 "+num2+" 는 같지 않습니다.");
		}
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 1 : ");
		String str1 = sc.nextLine();
		System.out.print("문자 2 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println(str1+" 과 "+str2+" 는 같습니다.");
		} else {
			System.out.println(str1+" 과 "+str2+" 는 같지 않습니다.");
		}
	}

	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 1 : ");
		double double1 = sc.nextDouble();
		System.out.print("실수 2 : ");
		double double2 = sc.nextDouble();
		
		if (double1 == double2) {
			System.out.println(double1+" 과 "+double2+ " 는 일치합니다.");
		} else {
			System.out.println(double1+" 과 "+double2+ " 는 일치하지 않습니다.");
		}
	}
	
	
	//최종으로 실행할 메인 메서드
	public static void main(String[] args) {
		// method1();
		// method2();
		method3();
		
	}

}

