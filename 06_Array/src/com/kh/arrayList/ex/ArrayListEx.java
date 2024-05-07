package com.kh.arrayList.ex;

import java.util.ArrayList;

/*
★★★★★★★★★★★★★★★★★★★★★★★
ArrayList
리스트는 배열과 비슷하지만 크기가 제한이 되어있지 않다는 점에서 다름
원하는 만큼 담을 수 있음

★ ArrayList를 Class 명으로 사용하지 말 것!
원래 Class 명이 ArrayList였으나
ArrayListEx로 이름을 Refactor > Rename 해줌

사용 예제
ArrayList<자료형> 변수명 = new ArrayList<자료형>();

	+ <자료형>을 쓸 때
	int		 	-> Integer
	String	 	-> String
	double	 	-> Double
	char		-> Character
	
	+ 외우기
	add 		추가
	get 		반환
	set 		수정
	remove 		삭제
	size 		개수 확인
	isEmpty 	비어있는지 확인
	clear 		모두 삭제
*/
public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//index의 자리 위치 0
		
		//isEmpty - 비어있는지 확인하기
		System.out.println(num.isEmpty());//true
		//자리가 비어있기 때문에 true라고 나옴
		
		//add - 지정하기
		num.add(10); //index 0의 자리에 10이 지정됨
		
		//get - 반환하기
		System.out.println("추가 확인 : "+num.get(0));
		//현재 index 0 에 저장된 값 : 10
		
		//isEmpty - 비어있는지 확인하기
		System.out.println(num.isEmpty());//false
		//num.add(10);으로 index 0의 자리에 10을 지정함
		//자리가 비어있지 않기 때문에 false라고 나옴
		
		//size - 크기 확인 [size를 사용 o, length 사용 x]
		System.out.println(num.size());
		
		//set - 수정하기(수정하는 위치(자릿값), 수정하고자 하는 값)
		num.set(0, 20);//index 0의 자리를 20으로 수정함
		
		//get - 반환하기
		System.out.println(num.get(0));
		//현재 index 0 에 저장된 값 : 20
		
		//remove - 삭제하기
		num.remove(0);
		
		//삭제했기 때문에 아무것도 없으므로 get이 아니라 isEmpty 사용
		//isEmpty - 비어있는지 확인하기
		System.out.println(num.isEmpty());//true
	}
}
