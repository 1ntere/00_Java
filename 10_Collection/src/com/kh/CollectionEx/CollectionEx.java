package com.kh.CollectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collection 인터페이스 파일들을 연결시켜주는 존재
List, Set의 부모클래스
순차적으로 회전하면서 코드를 조회하거나 코드 안에 작성한 내용을 순회하고,
추가 삭제 검색 등 기본 작업을 제공

메서드
sort() = 리스트를 기본 정렬 순서에 따라 정렬
	1. 숫자 : 오름차순 정렬, 작은 값에서 큰 값 순서로 정렬
	2. 문자열 : 문자의 사전 순서에 따라 정렬
	3. 우리가 파일을 만들어서 정한 기준
		compareTo() 메서드를 활용해서 정렬 기준을 작성할 수 있음
min, max = 최소값, 최대값
binary search (이진 탐색) = 이진 탐색을 사용해서 리스트에서 지정된 요소를 찾기
		정렬된 배열이나 리스트에서 특정한 값의 위치를 찾는 알고리즘
		배열 또는 리스트를 반으로 나눠서 탐색 범위를 좁혀가면서 값을 찾아내는 것
		二分 이분 (2 개로 나누는 것을 의미)
		二進 이진 (2 개의 갈래로 나아간다는 것을 의미)
addAll : 내가 추가하고자하는 모든 값을 추가
*/
public class CollectionEx {
	public static void main(String[] args) {
		//정렬
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		숫자들.add(3);
		숫자들.add(5);
		숫자들.add(4);
		숫자들.add(1);
		System.out.println(숫자들);//[3, 5, 4, 1]
		
		//Collection.sort - 오름차순으로 정렬하기
		Collections.sort(숫자들);//[1, 3, 4, 5]
			//작은 값부터 큰 값 순서로 정렬됨
		System.out.println(숫자들);
			//숫자들 = [1, 3, 4, 5]
		
		//ArrayList에서 add로 하나씩 추가하는 것이 아니라 한번에 값을 추가하기
										//()안에 Arrays.asList() - 넣고 싶은 만큼 추가 가능
		ArrayList<String> 색상들 = new ArrayList<>(Arrays.asList("Black", "White"));
		System.out.println(색상들);
			//색상들 = [Black, White]
	}
}
