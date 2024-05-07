package com.kh.ListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
	 ┌ Vector     : Java1 버전(Java 초기버전)에서 제일 먼저 등장해서 사용된 것
List ├ ArrayList  : 검색엔 좋지만, 데이터 삽입과 삭제가 빈번한 경우 부적합
	 └ LinkedList : 검색엔 부적함, 데이터 삽입과 삭제에는 좋음

	List
	 └ Vector
	 └ ArrayList
	 └ LinkedList
*/
public class ListPre {
//메서드
	//생성자(기본)
	public ListPre() {

	}
	//void - Vector
	public void VectorEx() {
		Vector<String> 백터 = new Vector<>();
		백터.add("자바");
		백터.add("파이썬");
		백터.add("C");
		System.out.println(백터);//[자바, 파이썬, C]
	}
	//void - LinkedList
	public void LinkedEx() {
		LinkedList<String> 링크드리스트 = new LinkedList<>();
		링크드리스트.add("말");
		링크드리스트.add("호랑이");
		링크드리스트.add("송아지");
		System.out.println(링크드리스트);//[말, 호랑이, 송아지]
	}
	//void - ArrayList	
	public void ArrayEx() {
		ArrayList<String> 어레이리스트 = new ArrayList<>();
		어레이리스트.add("사과");
		어레이리스트.add("바나나");
		어레이리스트.add("포도");
		System.out.println(어레이리스트);//[사과, 바나나, 포도]
	}

	//main
	public static void main(String[] args) {
		ListPre li = new ListPre();
		li.VectorEx();
		li.LinkedEx();
		li.ArrayEx();
	}
}