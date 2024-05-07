package com.kh.example.practice4.model.vo;

public class Student {
	//필드
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	//setter 메서드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	//getter 메서드
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	//기본 메서드
	public Student() {
		
	}
	//void 메서드
	public void information() {
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+grade);
		System.out.println("반  : "+classroom);
		System.out.println("키  : "+height);
		System.out.println("성별 : "+gender);
		System.out.println("---------------");
	}	
}
