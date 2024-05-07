package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	//4자리 비밀번호 만들기
	public void practice11() {
		/*
		정수를 이용해서 4자리 비밀번호를 만들려고 한다.
		4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우 성공
		중복 값이 있으면 '중복 값 있음'
		자리수가 안 맞으면 '자리 수 안 맞음' 출력
		단, 제일 맨 앞자리 수의 값은 1 ~ 9사이의 정수 (0 안됨)
		*/
		
		//비밀번호는 정해진게 아니라 입력해서 정해야 함
		Scanner sc = new Scanner(System.in);
		
		//비밀번호를 우리가 만족할 때까지 출력 (반복한다는 의미)
		while (true) {
			System.out.print("비밀번호 입력 (1000~9999) : ");
			int password = sc.nextInt();
			
			//자리 수 안 맞음
			if (password<1000 || password>9999) {
				System.out.println("4자리 비밀번호가 아닙니다.");
				System.out.println("자리 수 안 맞음");
				continue;
			}
			
			//자리값
			int[] digits = new int[4]; //4자리만 허용 (0 ~ 3)
			digits[0] = password/1000; //천의자리
			digits[1] = (password/100) % 10; //백의자리
			digits[2] = (password/10) % 10; //십의자리
			digits[3] = password % 10; //일의자리
			
			
			//중복 값 있음
			boolean isTrue = true;
			
			//★★★★★ length : 크기
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						isTrue = false;
						break;
						//만약에 i 자리 숫자와 j 자리 숫자 가 같다면 isTrue 를 false로 지정해라 
					}
				}
			}
			
			//중복 값 있음
			if (!isTrue) {
				System.out.println("중복값이 있음");
			} else {
				System.out.println("비밀번호 생성 성공");
				break;//비밀번호를 최종적으로 잘 생성하면 모두 종료
			}
			
			/*
			★ 오류 발생
			중복되는 값을 입력하면 출력에서 아무것도 안나오고 그냥 멈춤 
			//★★★★★ length : 크기
			for (int i = 0; i < digits.length; i++) {
				for (int j = i + 1; j < digits.length; j++) {
					if (digits[i] == digits[j]) {
						isTrue = false;
						break;
						//만약에 i 자리 숫자와 j 자리 숫자 가 같다면 isTrue 를 false로 지정해라 
					}
				}
				if (!isTrue) {
					break;
					//isTrue가 false면 break
				}
				//중복 값 있음
				if (!isTrue) {
					System.out.println("중복값이 있음");
				} else {
					System.out.println("비밀번호 생성 성공");
					break;//비밀번호를 최종적으로 잘 생성하면 모두 종료
				}
			}
			-----
			★ 문제 해결 방안
			if (isTrue) {
				break;
			}
			가 for 문 안에 있어서 그럼
			for 문 바깥으로 옮기기			
			*/
		}
	}
}
