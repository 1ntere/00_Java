package com.kh.op;

import java.util.Scanner;

// class 바깥에는 package와 import 만 작성할 수 있음
// 이 외 개발자가 실행하고자 하는 내용은 class 내부에 작성해줘야함

public class OperatorEx2 {
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
	
	// 메서드1() : Scanner를 사용하지 않는 메서드
	public static void 메서드1() {
		int num1 = 20;
		int num2 = 5;
		int 더하기 = num1+num2;
		int 빼기 = num1-num2;
		int 곱하기 = num1*num2;
		int 나누기 = num1/num2;
		System.out.println("더하기 : "+더하기);
		System.out.println("빼기  : "+빼기);
		System.out.println("곱하기 : "+곱하기);
		System.out.println("나누기 : "+나누기);
	}
	
	// 메서드2() : double
	public static void 메서드2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		// double 더하기 빼기 곱하기 나누기 실행
		double sum = num3+num4;
		double sub = num3-num4;
		double mul = num3*num4;
		double div = num3/num4;
		
		System.out.println("sum : "+sum);
		System.out.println("sub : "+sub);
		System.out.println("mul : "+mul);
		System.out.println("div : "+div);
	}
	
	// 메서드3() -> Scanner 사용 메서드
	// 메서드 옆에 있는 ()는 나중에 어떤 값을 받을 때 사용
	// 값을 받을 일이 없으면 ()를 빈 공간으로 유지
	public static void 메서드3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("num5 숫자를 입력하세요 : ");
		int num5 = sc.nextInt();
		//키보드로 작성한 숫자가 num5로 들어올 수 있게 변수 선언
		System.out.print("num6 숫자를 입력하세요 : ");
		int num6 = sc.nextInt();
		//키보드로 작성한 숫자가 num6로 들어올 수 있게 변수 선언
		
		//키보드로 전달받은 숫자를 더하기 빼기 곱하기 나누기
		int sum1 = num5+num6;
		int sub1 = num5-num6;
		int mul1 = num5*num6;
		int div1 = num5/num6;
		
		System.out.println("sum1 : "+sum1);
		System.out.println("sub1 : "+sub1);
		System.out.println("mul1 : "+mul1);
		System.out.println("div1 : "+div1);
		
		//sc.close();
	}
	
	// 메서드 4를 만들어서 스캐너로 double 더하기 빼기 곱하기 나누기 출력
	// double num7 = sc.nextDouble();
	// double num8 = sc.nextDouble();
	// 더하기 double sum2
	// 빼기 double sub2
	// 곱하기 double mul2
	// 나누기 double div2	
	public static void 메서드4() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("숫자를 입력해보기 ↓");		
		System.out.print("num7 숫자를 입력하세요 : ");
		double num7 = sc1.nextDouble();
		System.out.print("num8 숫자를 입력하세요 : ");
		double num8 = sc1.nextDouble();
		
		double sum2 = num7+num8;
		double sub2 = num7-num8;
		double mul2 = num7*num8;
		double div2 = num7/num8;
		
		System.out.println("더하기 : "+sum2);
		System.out.println("빼기  : "+sub2);
		System.out.println("곱하기 : "+mul2);
		System.out.println("나누기 : "+div2);
		
		//sc1.close();
	}
	
	// 최종 제출 메인 메서드
	public static void main(String[] args) {
		// 앞으로는 만든 메서드 중에서
		// 출력하고 싶은 메서드만 작성할 것
		
		메서드1();
		// 만약에 메서드1() 안에 작성한 내용을 출력하고 싶다면
		// 최종 제출 메인 메서드 밑에 메서드1(); 이라고 작성 후 출력하면 가능
		
		메서드2();
		// 메서드2(); 를 주석처리하고 실행하면 메서드1()만 출력됨
		
		메서드3();
		
		메서드4();		
		// ★질문 : 왜 메서드3() 마지막에 sc.close();하면 메서드3()을 주석처리 하지 않았을 때 메서드4()에서 오류가 나는지?
		// 내가 찾은 해결방안1 : 메서드3()을 주석 처리
		// 내가 찾은 해결방안2 : 메서드3() 마지막에 sc.close();를 주석 처리 하면 메서드3()을 주석처리 안해도 오류가 나지 않음
		// 설명 : 메서드4()가 시작되기도 전에 메서드1~4()를 모두 다 닫아버려서 메서드4()가 실행이 안됨
	}

}
