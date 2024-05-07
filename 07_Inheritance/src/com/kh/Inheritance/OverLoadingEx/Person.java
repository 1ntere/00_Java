package com.kh.Inheritance.OverLoadingEx;

public class Person {
	
//필드 : 변수명을 작성 해주는 곳
	private String name;
	private int age;
	
//메서드 : 특정 행동을 하기 위해 묶는 코드
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	//생성자 (기본)
		//오버로딩(똑같은 메서드 이름인데 안에 있는 매개변수가 다를 때 사용)
	public Person() {
		
	}
	//생성자 (필수)
		//오버로딩(똑같은 메서드 이름인데 name이 필수로 들어가야 하는 메서드)
	public Person(String name) {
		this.name = name;
	}
	//생성자 (필수)
			//오버로딩(똑같은 메서드 이름인데 name과 age가
			//필수로 들어가야 하는 메서드)
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	//void
	public void displayInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
