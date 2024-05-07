package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {
	//생성자 (기본)
	public ArrayListEx2() {
		
	}
	//생성자 (void)
	public void method1() {
		//딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		//add - 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get - {0, 1, 2} 각 index 자리에 값 출력하기
		System.out.println("list.get(0): "+list.get(0));//딸기
		System.out.println("list.get(1): "+list.get(1));//바나나
		System.out.println("list.get(2): "+list.get(2));//사과
		System.out.println("---------------");
		
		//set - "바나나" -> "키위" 수정
		list.set(1, "키위");//{"딸기", "키위", "사과"}
		System.out.println(list.get(1));
		System.out.println("---------------");
		
		//size - 크기 확인 [index 숫자를 넣지 않음]
		System.out.println("바구니 크기 : "+list.size());//3
		System.out.println("---------------");
		
		//remove - 키위 삭제
		list.remove(1);
		System.out.println(list.get(1));//"사과"
		//{"딸기", "키위", "사과"}에서 "키위" 지웠으므로
		//{"딸기", "사과"}가 되어
		//index 1에 있는 과일은 "사과"가 된다
		System.out.println("---------------");
		
		//isEmpty - 비어있는지 확인 [index 숫자를 넣지 않음]
		System.out.println("장바구니 비어 있나요? : "+
					list.isEmpty());//false
		System.out.println("---------------");
		
		//for 문 - 장바구니 뭐뭐 들어가 있는지 확인하기
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
		/*
		[앞으로 사용할 for 문]
		for (내가 만들어줄 변수 명 : 반복할 변수 명) {
			System.out.println();
		}
		*/
		for (String 과일 : list) {
			System.out.println(과일);
		}
		//=> 훨씬 단순함
	}

	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		//add - 사자 호랑이 고양이 강아지
		// 단축키 (한 줄 복사해서 밑에 붙여넣기) : ctrl + alt + ↓
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size - 동물이 몇 마리 있는지 확인 [index 숫자를 넣지 않음]
		System.out.println("동물원의 총 동물 수 : "+
					animal.size()+" 마리");
		System.out.println("----------");
		
		//get - 동물 확인
		System.out.println("동물 0 : "+animal.get(0));
		System.out.println("동물 1 : "+animal.get(1));
		System.out.println("동물 2 : "+animal.get(2));
		System.out.println("동물 3 : "+animal.get(3));
		System.out.println("----------");
		
		//set - 고양이 -> 토끼
		animal.set(2, "토끼");
		
		//remove - 강아지 삭제
		animal.remove("강아지");
		//위의 코드 대신에 animal.remove(3); 를 사용해도 됨
		
		//for 문 - get 출력
		for(String 동물 : animal) {
			System.out.println("동물 : "+동물);
		}
		System.out.println("----------");
		
		//clear - 모두 삭제 [index 숫자를 넣지 않음]
		animal.clear();
		
		//isEmpty - 모두 삭제가 되었는지 확인
		System.out.println("모두 이사합니다.");
		System.out.println("동물들이 모두 비어있나요? : "+
				animal.isEmpty());
	}
	
	public void method3() {
		//피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		
		System.out.println("=== 피자 메뉴 ===");
		
		//add - 고구마 포테이토 페페로니
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		
		//get - 출력하기
		System.out.println("피자 0 : "+pizza.get(0));
		System.out.println("피자 1 : "+pizza.get(1));
		System.out.println("피자 2 : "+pizza.get(2));
		System.out.println("----------");
		
		//set - 페페로니 -> 파인애플
		pizza.set(2, "파인애플");
		
		//remove - 파인애플 제거
		pizza.remove("파인애플");
		
		//for 문 - 출력
		for (String 피자 : pizza) {
			System.out.println("피자 : "+피자);
		}
		System.out.println("----------");
		
		//☆ 모든 메뉴를 한번에 출력하는 방법
		System.out.println("모든 메뉴 보기 : "+pizza);
		System.out.println("----------");
		
		//clear - 메뉴 모두 삭제
		System.out.println("피자 가게가 사라질 예정입니다.");
		pizza.clear();
		
		//isEmpty - 메뉴 모두 삭제됐는지 확인
		System.out.println(pizza.isEmpty());
	}
	
	public static void main(String[] args) {
		ArrayListEx2 ale = new ArrayListEx2();
		//ale.method1();
		//ale.method2();
		ale.method3();
	}
}
