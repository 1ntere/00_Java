package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ssm = new EmployeeController();
	
	public EmployeeMenu() {
		
	}
	
	public void EmployeeMenu() {
		System.out.println("======= 직원 정보 출력 =======");
		for (Employee e : ssm.printEmployee()) {
			System.out.println(e.inform());
		}
		
		System.out.println("======= 직원 성적 출력 =======");
		System.out.println("직원 점수 합계 : "+ssm.sumScore());
	}
}
