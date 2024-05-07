package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {
	//생성자 (기본)
	public ArraysEx2() { 
		
	}
	//생성자 (void)
	public void method1() {
		//숫자 배열 생성하기
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		//Arrays.sort() - 숫자 정렬하기
		Arrays.sort(num);
		
		//Arrays.toString() - 정렬된 내용 출력하기
		System.out.println("num : "+Arrays.toString(num));
		
		//Arrays.copyOf() - num 배열 복사하기 abc
		int[] abc = Arrays.copyOf(num, num.length);
		
		//Arrays.toString() - 정렬된 내용 출력하기
		System.out.println("abc : "+Arrays.toString(abc));
		
		//Arrays.equals() - num과 abc가 같은지 비교하기
		boolean same = Arrays.equals(num, abc);
		System.out.println("num과 abc가 일치하나요 : "+same);
		
		//Arrays.fill() - 숫자 6으로 모두 채우기
		int[] 채우기 = new int[3];
		Arrays.fill(채우기, 6);
		
		//Arrays.toString() - 채워진 채우기 변수를 출력
		System.out.println(Arrays.toString(채우기));
	}
	//메서드 (메인)
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
	}
}
