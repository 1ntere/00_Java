package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	public static void main(String[] args) {
		Stack<Integer> 스택 = new Stack<>();
		
		//push() - 스택에 값을 추가
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		
		//pop() - 현재 스택의 맨 위에 있는 값 반환하고 제거
		int 탑 = 스택.pop();
		System.out.println(탑);//20
			//20이 반환되어 출력되고 사라짐
		
		//peek() - 현재 스택의 맨 위에 있는 값 반환
		int 맨위값확인 = 스택.peek();
		System.out.println(맨위값확인);//40
			//현재 스택의 맨 위에 있는 값 : 40
		
		//isEmpty() - 스택에 값이 존재하는지 확인
		boolean 비어있나요 = 스택.isEmpty();
		System.out.println(비어있나요);//false
			//현재 스택에는 10 30 50 40, 총 4개의 값이 존재
		
		//size() - 스택의 크기 확인
		System.out.println(스택.size());//4
			//현재 스택에는 10 30 50 40, 총 4개의 값이 존재
	}
}
