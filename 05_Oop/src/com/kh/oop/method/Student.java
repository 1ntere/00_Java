package com.kh.oop.method;

public class Student {
	//필드
	private String name;
	private int age;
	private int grade;
	
	//기본생성자
	private Student() {
		
	}
	
	//필수생성자 (이름, 나이, 학년)
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	//return 메소드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void info() {
		System.out.println("학생의 이름 : "+name);
		System.out.println("학생의 나이 : "+age);
		System.out.println("학생의 학년 : "+grade);
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		Student student1 = new Student("박영수", 15, 2);
		Student student2 = new Student("김영희", 17, 1);		
		student1.info();
		student2.info();
	}
}
