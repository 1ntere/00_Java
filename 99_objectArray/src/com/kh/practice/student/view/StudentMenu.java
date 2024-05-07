package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

//사용자의 입장에서 바라보는 컴퓨터
public class StudentMenu {
	private StudentController ssm = new StudentController();
//메서드
	//기본 생성자
	public StudentMenu() {
		
	}
	//void - 학생 정보와 성적 결과 출력하는 메서드
	public void printStudentMenu() {
		//학생 정보 출력
		System.out.println("======= 학생 정보 출력 =======");
		//for-each문
		//String student로 했다면
			//학생의 이름 or 과목 or 점수 하나만 가져올 수 있음
		//하지만 Student student로 하면
			//이름과 과목과 점수를 모두 가져올 수 있음
		for (Student student :  ssm.printStudent()) {
			System.out.println(student.inform());
		}
		
		//학생 성적 출력
		System.out.println("======= 학생 성적 출력 =======");
		System.out.println("학생 점수 합계 : "+ssm.sumScore());
		System.out.printf("학생 점수 평균 : %.2f\n", ssm.avgScore()[1]);
			//double이므로 println이 아닌 printf가 쓰여짐
		//마지막으로 총합을 sumScore로 호출한다면 내가 가진 점수를 보여줌
		System.out.println("반 평균이 과락 이상 인가? : "+(ssm.avgScore()[1] >= StudentController.CUT_LINE));
		/*
		★ 의문
		boolean을 쓰지 않았는데 true와 false가 보여지는 이유
		-----
		      학생들의 평균    >=          합격 커트라인
		(ssm.avgScore()[1] >= StudentController.CUT_LINE)
		-----
		부등호 : 값이 같거나 크거나 작다는 것을 표현하기 위함
		       true와 false를 반환		
		*/
		System.out.println("==========================");
		
		//합격 여부 출력
		for (Student s : ssm.sArr) {
		/*
		위 코드를 작성하면서 StudentController 클래스에 있던 sArr이 private에서 public이 됨
		원래는 for (Student s : ssm.sArr) {하고
		StudentController 클래스에 있는 sArr을 public에서 private로 바꾸면 정상작동이 되나
		-----
		private를 그대로 놔두고 바꾸지 않기 위해서는
		Student 클래스에서 필드의 private 변수를 호출하기 위해 Setter와 Getter를 사용한 것처럼
		StudentController 클래스에서 private 변수인 sArr을 Setter와 Getter를 사용하고
		for (Student s : ssm.getsArr()) {로 바꾸면 됨
		*/
			if(s.getScore() > StudentController.CUT_LINE) {
				System.out.println(s.getName()+" 학생은 통과 입니다.");
			} else {
				System.out.println(s.getName()+" 학생은 재시험 대상입니다.");
			}
		}
	}
}
