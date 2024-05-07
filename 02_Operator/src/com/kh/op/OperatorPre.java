package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	public static void main(String[] args) {
	//최종 출력해주는 메인 메서드
	// 메서드 : 특정 상태나 기능을 정리해놓은 집합
		method1();
	}
	public static void method1() {
	// 최종으로 출력하는 메서드는 아님
	// 내가 필요할 때 꺼내서 사용하는 메서드
		
	// public void method1() {
	// 오류1) 최종 메서드를 주석처리하고, 위의 코드"public void method1() {"만 쓰면 오류가 뜸
		// 해결방안1) 위의 코드를 주석처리하고, 최종 메서드
		// 해결방안2) 최종 메서드 아래에 method1(); 작성
	// 오류2) static이 없으면 또 오류남
		// static : 고정된 이라는 뜻을 가지고 있음
		// static 이 붙는 것은 자료형이나 변수에 담아서 쓰는것이 아니라
		// 단독으로 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현
		// 해결방안) public static void method1() {로 수정
		
		// 1. int num1 = 10, int num2 = 3
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		int 더하기 = num1+num2;
		System.out.println("더하기 : "+더하기);
		int 빼기 = num1-num2;
		System.out.println("빼기 : "+빼기);
		int 곱하기 = num1*num2;
		System.out.println("곱하기 : "+곱하기);
		int 나누기 = num1/num2;
		System.out.println("나누기 : "+나누기);
		//3; 몫 3.33333의 실수부분 3
		// 만약에 num2 = 4이면; 2
		// ;10/4의 몫이 2.5이므로 실수부분 2
				
		// 2. double num3 = 2.5, double num4 = 3.5
		// 더하기 빼기 곱하기 나누기 결과를 출력하기
		double num3 = 2.5;
		double num4 = 3.5;
		System.out.println("num3 = "+num3);
		System.out.println("num4 = "+num4);
		
		double sum2 = num3+num4;
		System.out.println("덧셈 결과 : "+sum2);
		double sub2 = num3-num4;
		System.out.println("뺄셈 결과 : "+sub2);
		double mul2 = num3*num4;
		System.out.println("곱셈 결과 : "+mul2);
		double div2 = num3/num4;
		System.out.println("나눗셈 결과 : "+div2);
		// double을 사용하니까 소수점 자리도 출력이 됨
		
		// 3. Scanner를 이용해서 입력 받은 값을 계산하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력하세요 : ");
		int b = sc.nextInt();
		
		int sum3 = a+b;
		System.out.println("덧셈 결과 sum : "+sum3);
		int sub3 = a-b;
		System.out.println("뺄셈 결과 sub : "+sub3);
		int mul3 = a*b;
		System.out.println("곱셈 결과 mul : "+mul3);
		int div3 = a/b;
		System.out.println("나눗셈 결과 div : "+div3);		
	}

}
