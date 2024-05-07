package com.kh.SetEx;

import java.util.HashSet;

/*
set : 집합, 주머니
	순서를 유지하지 않음(자리 값이 없다)
		index를 이용해서 불러오기 불가능(set 불가능)
	중복 데이터 저장x(같은게 들어오면 덮어쓰기)
		List의 경우에는 같은 것을 add해도 저장이 가능했음
	
	┌ HashSet(대표)  : 처리 속도가 빠른 set
set ├ LinkedHashSet : 순서를 유지하는 set
	└ TreeSet       : 자동정렬되는 set
	
	HashSet 사용 예제
		사용 조건 1 : 객체에 equals() 오버로딩 되어 있어야함
		사용 조건 2 : 객체에 hashCode() 오버로딩 되어 있어야 함
	
			Set<자료형> 셋 = new HashSet<>();
			HashSet<자료형> 해시셋 = new HashSet<>();

Set에 사용되는 메서드
add()		데이터 추가
get()		자리 데이터 확인
remove()	데이터 제거
size()		데이터 크기 확인
clear()		데이터 모두 제거
contains()	특정 데이터가 존재하는지 확인
---
★ set()과 get()은 사용 불가
	get()은 보통 특정 index값의 데이터를 가져올 때 사용되며
		get(index값);으로 사용되고,
	set()은 보통 데이터를 수정할 때 사용되며
		set(index값, 목표값);으로 사용되는데
	Set은 순서가 없어서 index값이 존재하지 않으므로
	지정되는 자리값(index)이 없어서 사용 불가
*/

public class SetEx {

	public static void main(String[] args) {
		// Set 은 중복을 허용하지 않고 add로 추가받은 각각의 데이터를 순서없이 저장
		// List와 달리 index 순서가 없어서 get()과 set() 사용 불가능
		// 데이터 중복 확인에 많이 사용
		HashSet<String> set = new HashSet<>();
		
		//add - 데이터 추가
		set.add("로맨스");
		set.add("공포");
		set.add("액션");
		set.add("스릴러");
		System.out.println(set);//[공포, 로맨스, 스릴러, 액션]
		
		//remove - 데이터 제거
		set.remove("로맨스");
		System.out.println(set);//[공포, 스릴러, 액션]

		//size - 데이터 크기 확인
		System.out.println(set.size());//3
			//set[] = [공포, 스릴러, 액션] 이므로 3

		//clear - 데이터 모두 제거
		set.clear();
			//set[] = []

		//contains - 특정 데이터가 존재하는지 확인
		System.out.println(set.contains("스릴러"));//false
			//set[] = [] 이므로 "스릴러"가 set에 존재하지 않아서 false
		
		/*get() - 자리 데이터 확인 / set() - 데이터 수정*/
		/*
		★ 오류 발생
		System.out.println(set.get(1));
		-----
		set은 자리가 랜덤이어서 특정한 index번호로 배정된 데이터가 없음
		=====
		get() 사용 불가
		마찬가지의 이유로 set()도 사용 불가
		 */
	}
}