package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

/*
★★★★★ 중요 ★★★★★

	┌ ★ HashMap		: 빠른 검색 속도 (가장 많이 사용)
Map ├ TreeMap		: 정렬된 데이터를 필요할 경우 사용
	└ LinkedHashMap	: 순서를 유지하면서 저장하기 때문에 순서가 중요한 경우 사용

Map : 특정 키를 입력하면 해당되는 값을 얻을 수 있는 Collection 객체

사용예시
	key:value
	
	key(열쇠)	= 키
	value	= 값
	
메서드
	put(key, value)		 : 지정된 키와 지정된 값의 쌍을 추가
	get(key)			 : 지정된 키에 저장된 값을 보여줌
	containsKey(key)	 : 지정된 키가 존재하는지 확인
	containsValue(value) : 지정된 값이 존재하는지 확인
	remove(key)			 : 지정된 키와 키에 저장된 값을 제거
	keySet()			 : 키를 포함하는 집합을 반환
	values()			 : 모든 값들을 포함하는 컬렉션을 리스트로 반환
	entrySet()			 : 모든 키-쌍을 포함하는 집합을 반환
*/
public class MapEx {
	public static void main(String[] args) {
		//Map 생성
		Map<String, Integer> 학생들 = new HashMap<>();
		
		//put(key, value) - 추가하기
		학생들.put("철수", 90);
		학생들.put("영희", 85);
		학생들.put("민수", 88);
		학생들.put("철수", 90);
		
		//전체보기
		System.out.println(학생들);//{철수=90, 영희=85, 민수=88}
			//("철수", 90)을 2번 넣었는데 1번만 들어감
		
		//get() - 조회하기
		System.out.println("철수의 성적 : " + 학생들.get("철수"));
		
		//remove() - 삭제하기
		학생들.remove("영희");
			//학생들 = {철수=90, 민수=88}
		
		//전체보기
		System.out.println("전체 학생들 : "+학생들);//{철수=90, 민수=88}
		
		//key의 값은 중복이 될 수 없음 (key의 value는 유일해야함)
		//따라서 맨 마지막 값으로 덮어씌워짐
		학생들.put("철수", 80);//철수(key)의 값(value)이 80으로 바뀜
		System.out.println(학생들);//{철수=80, 민수=88}
		
		//학생들 성적 출력하기
		//for-each 문 : 학생들에 들어있는 key를 모두 가지고 와서 배열해놓는 keySet()활용
		for (String 이름 : 학생들.keySet()) {
			//각 학생의 성적 조회
			int 성적 = 학생들.get(이름);
			System.out.println(이름+ "의 성적은 "+성적+"점");
		}
	}
}
