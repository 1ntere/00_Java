package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		/*
		 비교 연산자
		 
		 데이터가 같은지 다른지를 비교할 때 사용
		 결과는 항상 true / false로 나타남
		 
		 사용 방법
		 a == b
		 	a 와 b 가 같으면 true
		 	a 와 b 가 다르면 false
		 a != b
		 	a 와 b 가 다르면 true
		 	a 와 b 가 같으면 false
		 	//true 가 나오면 끝나는 반복문을 처리하기 위해 사용
		 
		 ! : 부정할 때 사용하는 연산자
		 == : 같을 때 사용하는 연산자
		 */
		
		int a =10;
		int b =10;
		System.out.println("a == b 일 때 : "+ (a == b));
		
		//System.out.println("a == b 일 때 : "+ a == b);
		//괄호를 치지 않으면 오류가 남
		//☆) +(단항연산자) : 연산자 우선순위 2등, ==(비교연산자) : 연산자 우선순위 7등, 괄호 : 연산자 우선순위 1등
		//☆) 따라서 ==을 +보다 우선순위에 놓기 위해서 괄호를 침
		
		//★) System.out.println으로 무언가를 출력할 때
		//★) +는 "" 문자열이 있으면 각 각의 값을 이어주는 역할을 함
		//★) 문자열이 들어간 출력 프린트에서 연산(더하기 빼기 곱하기 나누기 true false)
		//★) 같은 작업을 진행하기 위해서는 우선순위 1번인 ()를 이용해서
		//★) 연산 작업을 우선로 진행하고 연산이 끝난 결과를 문자와 이어붙임
		
		System.out.println(a == b);
		//a와 b는 같은가? => true
		// 그냥 a==b 비교할 때는 오류가 나지 않음
		
		int c =20;
		int d =10;
		
		System.out.println(c != d);
		//c와 d는 다른가? => true
		
		// 1. a가 10이고, c가 20인데 == 를 사용했을 경우
		System.out.println("↓↓ a == c ↓↓");
		System.out.println(a == c);
		//a와 c가 같은가? => false	
	}

}
