package com.kh.IteratorEx;

import java.util.*;//java 폴더 밑에 util 폴더 아래 있는 모든 파일을 불러옴
/*파일 위치를 가져올 때
동일한 폴더 위치에서 많은 파일을 가져올 때는 * 을 사용해서 모두 가져오기를 해준다.
* : 전체선택

사용예시
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Iterator;
	
	=> import java.util.*
		(코드가 3줄에서 1줄로 요약됨)
*/

public class IteratorPre {

	public static void main(String[] args) {
		//100, 10, 20, 30, 50, 70
		
		//숫자를 추가하는 방법 1 - Arrays.asList();
		ArrayList<Integer> 숫자들 = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		
		//숫자를 추가하는 방법 2 - add();
		숫자들.add(70);
		
		//Iterator 생성
		Iterator<Integer> 반복하기 = 숫자들.iterator();
		
		//while문 사용해서 hasNext()로 다음 요소가 있는지 확인하고 next()로 출력하기
		while (반복하기.hasNext()) {
			System.out.println(반복하기.next());
		}
	}
}
