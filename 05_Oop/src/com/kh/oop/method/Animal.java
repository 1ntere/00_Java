package com.kh.oop.method;

public class Animal {
	//필드
	public String name;
	public int age;
	
	//기본 생성자
	public Animal() {
		
	}
	
	//필수 생성자 = name, age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//return으로 이름 받기
	public String getName() {
		return name;
	}
	
	//return으로 나이 받기
	public int getAge() {
		return age;
	}
	
	//void로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 : "+name);
		System.out.println("동물 나이 : "+age);
	}
	
	public static void main(String[] args) {
		//동물 변수명 = dog ("강아지", 1);
		Animal dog = new Animal("강아지", 1);
		System.out.println("강아지 이름 : "+dog.getName());
		System.out.println("강아지 나이 : "+dog.getAge());

		//동물 변수명 = cat ("고양이", 2);
		Animal cat = new Animal("고양이", 2);
		cat.info();
	}
}
