package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	/*
	Student[] sArr = new Student[5];
	
			┌ sArr[0] 김길동 자바 100
			├ sArr[1] 박길동 디비 50
	Student ├ sArr[2] 이길동 화면 85
	  sArr	├ sArr[3] 정길동 서버 60
			└ sArr[4] 홍길동 자바 20
	
	*/
	
	public Student[] sArr = new Student[5];
	//5개가 들어갈 배열을 만들어주는데 학생으로 만들어주세요.
	
	public static final int CUT_LINE = 60;//상수 (변수x)
	//상수는 변수와 달리 대문자로 씀
	
//메서드
	//기본 생성자
	public StudentController() {
		//0번째 학생 ~ 4번째 학생 값을 넣어주기
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	//return
	public Student[] printStudent() {
		return sArr;
	}
	//학생들의 점수를 모두 더해서 총점을 계산
	public int sumScore() { //점수 합한 값 전달
		int sum = 0;//초기값
		for (Student s : sArr) {
			sum += s.getScore();
		}
		//마지막으로 총합을 sumScore로 호출한다면 내가 가진 점수를 보여줌
		return sum;
	}
	//총점을 받아서 평균 구하기
	public double[] avgScore() {
		double[] avgArr = new double[2];
		avgArr[0] = sumScore();
			//위에서 만든 모든 학생의 총점 더한 값을 저장하는 공간
		avgArr[1] = avgArr[0] / sArr.length;
			//평균 = (총점 / 총 학생수)
		return avgArr;
	}
		//avgScore() 안에 avgArr[]배열이 존재 
		//avgArr[0] : 총 점수, avgArr[1] : 평균  
}
