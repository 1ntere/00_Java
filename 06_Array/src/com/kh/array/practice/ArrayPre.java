package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
//메서드
	//생성자 (기본)
	public ArrayPre() {
		
	}
	
	//메서드 (void)
	public void practice1() {
		//배열을 사용해서 전체 합 구하기
		//배열을 사용할 때 제일 먼저
		//숫자인지 문자열인지 문자인지 실수인지 구분을 해준 후 [] 표시 작성
		
		// length = 5
		// index     0  1  2  3  4
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;//처음 결과는 0
		
		// for-each 문 : 처음부터 끝까지 반복해서 무언가를 진행할 때 사용
		// ========  진  행  상  황  ========
		//        1   {1, 2, 3, 4, 5}
		//        2   {1, 2, 3, 4, 5}
		//        3   {1, 2, 3, 4, 5}
		//        4   {1, 2, 3, 4, 5}
		//        5   {1, 2, 3, 4, 5}
		for (int 숫자 : num) {
			// num 안에 있는 모든 숫자가 하나씩 숫자 안에 들어가고
			// 숫자들의 합
			result += 숫자; //result = 1 + 2 + 3 + 4 + 5
		}
		System.out.println("숫자들의 합 : "+result);
	}
	
	public void practice2() {
		//ArrayList 사용해서 물건 추가하기
		
		//new ArrayList<>() : <>안에 String을 넣어도 되고 안 넣어도 됨
		ArrayList<String> goods = new ArrayList<>();
		
		//add - 상품 추가
		goods.add("컴퓨터");
		goods.add("냉장고");
		goods.add("T  V");
		goods.add("에어컨");
		
		//println(goods) - 모두 보기 1
		System.out.println(goods);//[컴퓨터, 냉장고, T  V, 에어컨]
		
		//
		//for-each 문 - 모두 보기 2
		for (String a : goods) {
			System.out.print(a+" ");
		}//컴퓨터 냉장고 T  V 에어컨
	}
	
	public void practice3() {
		//배열을 사용해서 최대 값 찾기
		int[] numbers = {3, 7, 2, 9, 1};
		int max = numbers[0];
		for (int num : numbers) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("최대값 : "+max);
	}
	
	public void practice3_1() {
		//ArrayList를 사용해서 최대 값 찾기
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(1);
		
		
		
		//int max = numbers[numbers.length-1];
		//System.out.println("최대값 : "+max);
	}
	
	public void practice4() {
		//찾음 , 못 찾음
		// 과일가게 사과 바나나 딸기 오렌지
		String[] fruits = {"사과", "바나나", "딸기", "오렌지"};
		
		String search = "바나나";
		boolean found = false;//아직은 찾았는지 안 찾았는지 모르기 때문
		
		//for-each 문 활용해서 바나나 찾기
		// 				{"사과", "바나나", "딸기", "오렌지"}
		for (String f : fruits) {
			//만약에 내가 찾는 과일과 이름이 똑같다면 찾았다~! 해주기
			if (f.equals(search)) {
				found = true;
				break;//찾았기 때문에 if 문 탈출
			}
		}
		System.out.println(search+ " 찾음? : "+
				(found ? "찾음" : "못 찾음"));
				//(found ? "A" : "B")
				//true 면 A, false 면 B
	}
	
	public void practice5() {
		//스캐너 활용 동물 입력하고 배열에 동물이 있는지 확인할 것
		//practice4의 search를 스캐너로 변경
		String[] zoo = {"코끼리", "원숭이",
				"푸바오", "토끼", "공작"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ㅇㅇㅇ 동물원 입니다. ===");
		System.out.print("어떤 동물을 찾을까? : ");
		String search = sc.next();
		boolean found = false;
		
		for (String animal : zoo) {
			if (animal.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search+" 있음? : "+
				(found ? "ㅇㅇ" : "ㄴㄴ"));
	}
	
	
	
}

