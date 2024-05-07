package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		//직원 1에 대한 정보를 담을 변수 명 Employee 객체 생성
		Employee emp1 = new Employee();
		emp1.empNo = 1;
		emp1.empName = "감재식";
		emp1.gender = '남';
		System.out.println("=== 직원1 ===");
		System.out.println("사원 번호 : "+emp1.empNo);
		System.out.println("사원 이름 : "+emp1.empName);
		System.out.println("사원 성별 : "+emp1.gender);

		//직원 2 : 필수로 번호 이름 넣고
		//객체를 생성한 후 필수생성자로 작성하기		
		Employee emp2 = new Employee(2,"동그라미");
		System.out.println("=== 직원2 ===");
		System.out.println("사원 번호 : "+emp2.empNo);
		System.out.println("사원 이름 : "+emp2.empName);
		
		//직원 3 : 필수로 모두 작성해서 제출
		Employee emp3 = new Employee(3, "가나다", "마케팅",
				"사무직", 20, '남', 5000, 1000,
				"010-1234-5678", "서울시 강남구");
		System.out.println("=== 직원3 ===");
		System.out.println("사원 번호 : "+emp3.empNo);
		System.out.println("사원 이름 : "+emp3.empName);
		System.out.println("사원 부서 : "+emp3.dept);
		System.out.println("사원 직무 : "+emp3.job);
		System.out.println("사원 나이 : "+emp3.age);
		System.out.println("사원 성별 : "+emp3.gender);
		System.out.println("사원 연봉 : "+emp3.salary);
		System.out.println("사원 특봉 : "+emp3.bonusPoint);
		System.out.println("사원 폰번 : "+emp3.phone);
		System.out.println("사원 주소 : "+emp3.address);
		
		/* 아래의 경우도 맞는 코드
		Employee emp3 = new Employee();
		emp3.empNo = 3;
		emp3.empName = "가나다";
		emp3.dept = "마케팅";
		emp3.job = "사무직";
		emp3.age = 20;
		emp3.gender = '남';//char의 경우 작은 따옴표 사용
		emp3.salary = 5000;
		emp3.bonusPoint = 1000;
		emp3.phone = "010-1234-5678";
		emp3.address = "서울시 강남구";
		*/
	}
}
