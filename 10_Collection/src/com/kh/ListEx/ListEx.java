package com.kh.ListEx;

import java.util.ArrayList;
import java.util.List;

/*
List : 자료를 순차적으로 나열한 자료 구조(배열과 비슷)
인덱스가 존재함
인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능
인터페이스 객체로 생성이 불가능함
다형성으로 이용할 수 있음

사용예제
	List list = new.ArrayList(3); //3칸짜리 list 생성
	
	E(Element) : 요소를 뜻하는 상징적인 글자(자료형x)

 */
public class ListEx {
	public static void main(String[] args) {
		
	//List 객체 생성하고 ArrayList 인스턴스 생성
	/*
	★ 오류 발생
	List list = new ArrayList(3);
	로 List 하게 되면 <>로 자료형을 지정해주지 않아서 노랗게 경고가 발생
	=====
	★ 문제 해결
	List<Object> list = new ArrayList(3);
	자료형을 Object인 List로 설정해주면 된다
	Object 대신에 String Integer Boolean 등등 모두 사용 가능
	*/
		List<Object> list = new ArrayList(3);
			//일단 3칸짜리 Object 자료형의 list 배열을 만들어줌
		
		//add를 사용해서 List에 추가할 수 있음
		list.add("아무거나");//아무거나
		list.add(new Object());//java.lang.Object@1c4af82c
			//Object의 주소를 추가해줌
		list.add(123123);//123123
			//List의 자료형이 Object일 때는 str, int, boolean 등등
			//서로 다른 자료형 추가 가능
		list.add(false);
			//List는 3을 초과하면 크기가 자동으로 늘어나기 때문에 에러 발생 x
		System.out.println(list);//
	}
}