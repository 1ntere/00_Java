package com.kh.practice.student.model.vo;

public class Student {
//필드
	//이름 과목 점수
	private String name;
	private String subject;
	private int score;
//메서드
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	//기본 생성자
	public Student() {
		
	}
	//필수 생성자
	public Student(String name, String subject,
			int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	//자동 정렬 단축키 : ctrl + shift + f
	//return - String inform()
	public String inform() {
		return "이름:"+name+" / 과목:"+subject+
				" /점수:"+score;
	}
}
