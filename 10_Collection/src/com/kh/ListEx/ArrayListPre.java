package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();

		//add - 사과 바나나 오렌지
		a.add("사과");
		a.add("바나나");
		a.add("바나나");
		System.out.println(a);//[사과, 바나나, 바나나]

		//get(1)을 사용해서 index 1에 들어있는 값 반환
		System.out.println(a.get(1));

		//set(1, "포도")을 사용해서 바나나를 포도로 변경
		a.set(1, "포도");//바나나 -> 포도
			//index   0    1     2
			//a[] = [사과, 포도, 바나나]
		System.out.println(a.get(1));//포도

		//size - 크기 반환
		System.out.println(a.size());//3
			//a[] = [사과, 포도, 바나나]이므로 a의 size는 3

		//isEmpty() - 리스트가 비어있는지 확인
		System.out.println(a.isEmpty());//false
		//a[] = [사과, 포도, 바나나]이므로 false

		//remove(2) - 지정된 자리 제거
		a.remove(2);//바나나 제거
		System.out.println(a);//[사과, 포도]
			//a[] = [사과, 포도]

		//remove("사과") - 사과 제거
		a.remove("사과");
		System.out.println(a);//[포도]
			//a[] = [포도]

		//clear() - 모두제거
		a.clear();
		System.out.println(a);//[]
			//a[] = []
		
		//isEmpty() - 리스트가 비어있는지 확인
		System.out.println(a.isEmpty());//true
			//a[] = []이므로 true
	}
}