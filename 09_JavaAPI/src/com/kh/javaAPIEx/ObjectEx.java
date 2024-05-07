package com.kh.javaAPIEx;
/*
Object : 모든 자바 클래스의 최상위 클래스
		 모든 클래스가 기본으로 상속받는 클래스
		 Object 클래스는 기본으로 사용한다는 개념이 있기 때문에
		 굳이 new Object로 불러와서 사용하진 않음
		 기본으로 모든 클래스는 Object를 기본으로 쓸 수 있게 만들어짐
		 대표 메서드 : equals toString
*/
public class ObjectEx {
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Object에서 부터 내려오는 메서드입니다.";
	}
	
	public static void main(String[] args) {
		//Object는 기본이기 때문에 굳이 new를 사용해서 공간 생성하진 않음
		//그러나 그렇다고 해서 만들 수 없는 것은 아님
		
		//Object 위에 마우스를 올리고 노란색 화면 위에 있는 @옆에 있는 아이콘으로 누르면
		//Object 파일로 이동해서 볼 수 있음
		Object 오브젝트 = new Object();
		
		System.out.println(오브젝트);//java.lang.Object@5e91993f
	}
}
