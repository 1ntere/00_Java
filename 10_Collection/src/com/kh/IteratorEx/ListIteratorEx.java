package com.kh.IteratorEx;

import java.util.*;

/*
ListIterator

next는 앞에서부터 순차적으로 출력
hasNext()		: 다음 값이 존재하는지 true, false로 확인
Next()			: 다음 값 가져오기

previous는 뒤에서부터 순차적으로 출력
hasPrevious()	: 이전 값이 존재하는지 true, false로 확인
previous()		: 이전 값 가져오기

값을 추가하거나 삭제할 수 있음
add()			: 추가
remove()			: 삭제
*/
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 색상들 = new ArrayList<>();
		색상들.add("빨강");
		색상들.add("화이트");
		색상들.add("초록");
		
		//리스트이터레이터 생성
		ListIterator<String> 반복하기 = 색상들.listIterator();
		
		//hasNext(), next()
		System.out.println("앞에서부터 출력");
		while (반복하기.hasNext()) {
			String 색상 = 반복하기.next();
			System.out.println(색상);
		}
			//색상들에서 빨강, 화이트, 초록 순서대로 출력됨
		System.out.println("===============");
		
		//hasPrevious(), previous()
		System.out.println("뒤에서부터 출력");
		while (반복하기.hasPrevious()) {
			String 색상 = 반복하기.previous();
			System.out.println(색상);
		}
			//색상들에서 반대로 초록, 화이트, 빨강 역순으로 출력됨
		System.out.println("===============");
		
		System.out.println(색상들);
			//색상들 = [빨강, 화이트, 초록]
		System.out.println("===============");
		
		System.out.println("add를 사용해서 색상 추가하기");
		반복하기.add("파랑");
		
		System.out.println(색상들);//[파랑, 빨강, 화이트, 초록]
			//★ add를 해서 추가한 색상은 앞에 추가가 됨
			//색상들 = [파랑, 빨강, 화이트, 초록]
		
		/* 바로 반복하기.remove();를 사용하면 오류가 발생함 */
		//반복하기.remove();
		/*
		★ exception 오류 발생
		Exception in thread "main" java.lang.IllegalStateException
			at java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980)
			at com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:55)
		-----
		add 값을 추가하면 추가한 값은 배열의 맨 앞으로 이동함
		하지만 리스트의 끝에 위치
		더 이상 다음 값이 없기 때문에 삭제할 수 있는 값이 존재하지 않음.
		=====
		★ 문제 해결 방안
		반복하기.previous();
		반복하기.remove();
			next()를 호출해서 현재 위치를 변경한 다음에 remove()를 호출하거나
			previous()를 호출해서 현재 위치를 변경한 다음에 remove()를 호출
		*/
		
		//next() 나 previous()를 사용해서 현재 위치를 파랑의 위치로 이동
		반복하기.previous();
		반복하기.remove();
	}
}
