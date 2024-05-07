package com.kh.oop.basic;

public class Student {
	//필드
	public String name;
	public int age;
	public int grade;
	
	//학생인데 학생의 이름과 나이와 학년
	public Student() {
		
	}

	//생성자 메서드 (필수로 작성해야하는 생성자 메서드 만들기)
	//필수로 입력해야 하는 것 : 이름, 나이, 학년
	public Student(String inputName, int inputAge, int inputGrade) {
		this.name = inputName;
		this.age = inputAge;
		this.grade = inputGrade;
	}
	
	//출력 메서드(정보 출력 메서드)
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학년 : "+grade);
	}
	
	//최종 메인 메서드
	//학생 객체 생성하기
	//Student student1 김철수, 18, 3
	//Student student2 김영희, 20, 2
	public static void main(String[] args) {
		Student student1 = new Student("김철수",18,3);
		Student student2 = new Student("김영희",20,2);
		student1.info();
		student2.info();
		
		/* 아래도 맞는 코드
		Student student1 = new Student();
		
		student1.name = "김철수";
		student1.age = 18;
		student1.grade = 3;
		Student student2 = new Student();
		student2.name = "김영희";
		student2.age = 20;
		student2.grade = 2;
		
		student1.info();
		student2.info();
		*/
	}
	
}
