package com.kh.ExceptionEx;

import java.util.*;

/*
Exception = 예외 상황 발생
예외는 컴퓨터에서 코드로 처리가능한 에러

해결 예시
try {
	예외를 발생시킬 수 있지만 작성하고 싶은 코드;
} catch(Exception e) {
	예외가 발생했을 때 보여줄 코드나 문구;
}

catch 문은 무제한으로 작성 가능

catch 문을 여러개 사용할 경우
	try {
		예외를 발생시킬 수 있지만 작성하고 싶은 코드;
	} catch(배열Exception e) {
		...
	
	} catch(Exception e) {
		예외가 발생했을 때 보여줄 코드나 문구;
	}
=> 맨 마지막에 catch(Exception e) 를 맨 마지막에 작성을 해줌
*/
public class ExceptionEx {
	private Scanner sc = new Scanner(System.in);
	
	
	//기본 생성자 : ctrl + space -> enter
	public ExceptionEx() {
		
	}
	//메서드 2개 만들고
	public void method1() {
		//	index	 0   1   2   3
		int[] 배열 = {10, 20, 30, 40}; //마지막 index가 3
		
		//for
						  //배열.length = 4
		for (int i = 0; i <= 배열.length; i++) {
			//System.out.println(배열[i]);
			/*
			★ 오류 발생
			for (int i = 0; i <= 배열.length; i++) {
				System.out.println(배열[i]);
			}
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
				at com.kh.ExceptionEx.ExceptionEx.method1(ExceptionEx.java:27)
				at com.kh.ExceptionEx.ExceptionEx.main(ExceptionEx.java:40)
			-----
			i가 4가 되면 배열[4]가 되는데 이 값은 존재하지 않기 때문에 println을 할 수 없기 때문
			=====
			★ 문제 해결 방안 1
			for (int i = 0; i < 배열.length; i++) {
				System.out.println(배열[i]);
			}
			=====
			★ 문제 해결 방안 2
			try {//시도하다
				System.out.println(배열[i]);
			} catch (Exception e) {
				System.out.println("배열의 인덱스를 벗어났습니다.");
			}
			*/
			
			try {//시도하다
				System.out.println(배열[i]);
			} catch (RuntimeException e) {
				System.out.println("1번 예외사항");
			} catch (Exception e) {
				System.out.println("배열의 인덱스를 벗어났습니다.");
			}
		}
	}
	
	//메인 메서드 : main, ctrl + space -> enter
	public static void main(String[] args) {
		ExceptionEx 예외발생 = new ExceptionEx();
		예외발생.method1();
	}
}
