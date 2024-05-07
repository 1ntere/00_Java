package com.kh.MapEx;

import java.util.HashMap;
import java.util.Map;

public class MapPre {
//메서드
	//생성자 (기본)
	public MapPre() {
		
	}
	
	//void
	private void practice1() {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "에그마요");
		map.put(3, "로티세리바베큐");
		map.put(1, "스파이시쉬림프");
		System.out.println(map);//{1=스파이시쉬림프, 2=에그마요, 3=로티세리바베큐}
			//정렬까지 해서 나옴
	}
	
	private void practice2() {
		//							<> 안에는 자료형을 넣어도 되고 안 넣어도 됨
		Map<String, String> map = new HashMap<>();
		
		map.put("학원", "서울시 강남구");
		map.put("등산", "서울시 관악구");
		map.put("롯ㅇ타워", "서울시 송파구");
		System.out.println(map);//{등산=서울시 관악구, 학원=서울시 강남구, 롯데ㅇ타워=서울시 송파구}
			//map = {등산=서울시 관악구, 학원=서울시 강남구, 롯ㅇ타워=서울시 송파구}
		
		//get() - 롯ㅇ타워가 어디 있는지 출력
		System.out.println("롯ㅇ타워는 어디에 있나요? : " + map.get("롯ㅇ타워"));
			//map.get("롯ㅇ타워") - key "롯데타워"의 value "서울시 송파구"를 가져옴
		
		//remove() - 등산 삭제
		map.remove("등산");//map = {학원=서울시 강남구, 롯ㅇ타워=서울시 송파구}
		System.out.println(map);//{학원=서울시 강남구, 롯ㅇ타워=서울시 송파구}
		
		//for-each, KeySet() - 전체목록 출력
		for (String a : map.keySet()) {
			String 위치 = map.get(a);
				//서울시 강남구와 서울시 송파구는 value이다.
			System.out.println(a+"은(는) "+위치+"에 있습니다.");
		}
	}
	
	//containsValue() - 특정 값(value)이 존재하는지 확인
	public void practice3() {
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("체리", 300);

		//200원짜리 과일이 존재하는가?
		System.out.println("가격이 200원인 과일이 존재하는가? : " + map.containsValue(200));//true
			//map = {체리=300, 사과=100, 바나나=200}
			//value가 200인 바나나가 존재하기 때문에 true
		
		//체리가 존재하는가?
		System.out.println("체리 있나요? : " + map.containsKey("체리"));//true
			//map = {체리=300, 사과=100, 바나나=200}
			//key가 체리인 바나나가 존재하기 때문에 true
		/*containsValue와 containsKey 모두 true와 false 값으로 출력 됨*/
		
		//크기 조회
		System.out.println("현재 map의 크기 : " + map.size());//3
			//map = {체리=300, 사과=100, 바나나=200}
			//map의 크기는 3이다.
	}
	
	public void practice4() {
		//변수명 map
		Map<Integer, String> map = new HashMap<>();
		
		//put() - 1-에그마요, 2-로티세리바베큐, 3-스테이크앤치즈, 4-스파이시쉬림프
		map.put(2, "로티세리바베큐");
		map.put(3, "스테이크앤치즈");
		map.put(1, "에그마요");
		map.put(4, "스파이시쉬림프");
		System.out.println(map);//{1=에그마요, 2=로티세리바베큐, 3=스테이크앤치즈, 4=스파이시쉬림프}
			//순서를 바꿔서 넣어도 알아서 정렬되어 저장됨 (index값 존재)
		
		//get() - 3번 메뉴가 무엇인지 확인
		System.out.println("3번 메뉴 : " + map.get(3));//스테이크앤치즈
		
		//size() - 총 메뉴의 갯수 확인
		System.out.println("총 메뉴의 갯수 : " + map.size());//4
			//map = {1=에그마요, 2=로티세리바베큐, 3=스테이크앤치즈, 4=스파이시쉬림프}
		
		//remove() = 4번 메뉴를 지워줌
		map.remove(4);
			//map = {1=에그마요, 2=로티세리바베큐, 3=스테이크앤치즈}
		
		//isEmpty() - map이 비어있는지 확인하기
		System.out.println("메뉴가 비었나요? : "+map.isEmpty());//false
			//map = {1=에그마요, 2=로티세리바베큐, 3=스테이크앤치즈} 이므로 false
		System.out.println("===============");
		
		//for-each, keySet() - 모든 메뉴 보기, 1번 방법
		for (int i : map.keySet()) {
			String 메뉴 = map.get(i);
			System.out.println(i+"번 메뉴 : " + 메뉴);
		}
		System.out.println("===============");
		
		//for-each, Map.Entry, entrySet() - 모든 메뉴 보기, 2번 방법
			//Map.Entry : 키-값을 동시에 가져옴
			//keySet() 대신에 entrySet()을 사용
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		System.out.println("===============");
		
		//clear() - 모두 삭제
		map.clear();
		System.out.println(map);//{}
			//map = {}
		System.out.println("메뉴가 비었나요? : "+map.isEmpty());//true
	}
	
	//메인 메서드
	public static void main(String[] args) {
		MapPre mp = new MapPre();
		//mp.practice1();
		//mp.practice2();
		mp.practice3();
		//mp.practice4();
	}
}
