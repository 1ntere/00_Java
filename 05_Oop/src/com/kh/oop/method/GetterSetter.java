package com.kh.oop.method;
	/*
	Setter
		객체의 속성 값을 설정하는 메서드
		객체 외부에서 속성 값을 변경할 수 있음
	
	Getter
		객체의 속성 값을 반환하는 메서드
		객체 외부에서 속성 값을 읽을 수 있음
	
	사용방법
		마우스 우클릭>Source>Generate Getters and Setters 설정
		
	단축키
		alt + shift + s 해준 후 Generate Getters and Setters 설정
	 */

public class GetterSetter {
	//필드
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	Person 사람1 = newPerson(2);
	사람1의 나이는 0에서 2가 됨
	
	Person 사람2 = new Person(3);
	사람2의 나이는 0에서 3이됨
	*/
	
	/*
	생성자와의 차이점
	생성자는 단체로 필수값을 지정해서 넣어라
	getter, setter는 하나의 값을 지정해서 넣음
	*/

	public static void main(String[] args) {
		
	}
}
