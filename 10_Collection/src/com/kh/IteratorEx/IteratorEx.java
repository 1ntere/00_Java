package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

/*
Collection(List, Set, Map)을 반복하는데 사용

Enumeration (열거)	: 더 이상 권장되진 않음, Vector와 같은 오래된 버전 클래스에서만 사용됨
Iterator (반복자)		: 반복하는데 사용 (순차적으로 회진)
					  읽기만 가능, 추가하거나 삭제할 수 없음
ListIterator		: Iterator 업그레이드 버전
					  List(Vector, ArrayList, LinkedList) 에서만 사용
					  양방향으로 순차적 회진(回進 : 돌면서 나아가다) 가능
					  	= 앞뒤로 이동 가능
					  추가하거나 삭제 가능
					  
Iterator 밑에 있는 메서드
	hasNext()	: 다음이 있는지 없는지 확인
				  만약에 존재한다면 true, 존재하지 않는다면 false
	Next()		: 다음 것을 가지고 오는데 사용
				  next()는 사용하기 전에 hasNext()를 사용해서 그 다음이 있는지 없는지를 확인하고
				  	next()를 사용하는 것이 안전 (exception 에러 발생)
*/
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> 과일들 = new ArrayList<>();
		과일들.add("사과");
		과일들.add("블루베리");
		과일들.add("패션후르츠");
		과일들.add("망고");
		
		//Iterator 생성
		Iterator<String> 반복 = 과일들.iterator();
		
		//hasNext() - 다음 값이 있는지 확인 / true, false
		while (반복.hasNext()) {
			//next() - 다음 값 가지고 오기
			String 과일 = 반복.next();
			System.out.println(과일);
		}
			//망고 이후에는 값이 없으므로 반복.hasNext()가 false가 된다.
			//따라서 while 문을 나오게 됨
	}
}
