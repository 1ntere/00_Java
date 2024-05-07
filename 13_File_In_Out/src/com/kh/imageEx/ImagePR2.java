package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class ImagePR2 {
//바탕화면에 이미지폴더/동물이름.txt 파일 만들어준 후
	//동물이름 소 고양이 돼지 토끼 호랑이 이름을 \n 이용해서 만들어주고
	//동물이름.txt 만들어 준 다음에
	//좋아하는동물이름.txt 로 파일 이름 변경한 다음 삭제하기
	public static void main(String[] args) throws Exception {
		String 바탕화면경로 = System.getProperty("user.home") + "/Desktop";
		
		//폴더 만들기
		File 폴더 = new File(바탕화면경로 + "/이미지폴더");
		폴더.mkdirs();
		System.out.println(폴더.getName() + " 폴더 생성 완료!");
		
		//파일 만들기
		File 파일 = new File(폴더 + "/동물이름.txt");
		파일.createNewFile();
		System.out.println(파일.getName() + " 파일 생성 완료!");
		
		//animal List만들기
		ArrayList<String> animal = new ArrayList<>(Arrays.asList("소", "고양이", "돼지", "토끼", "호랑이"));
		
		//write 하기
		for (int i = 0; i < animal.size(); i++) {
			if (i == 0) {
				FileWriter 글쓰기 = new FileWriter(파일);
				글쓰기.write(animal.get(i) + "\n");
				글쓰기.close();
				System.out.println(i + "번 동물 작성 완료");
			} else if (i > 0 && i < animal.size()) {
				FileWriter 글쓰기 = new FileWriter(파일, true);
				글쓰기.write(animal.get(i) + "\n");
				글쓰기.close();
				System.out.println(i + "번 동물 작성 완료");
			}
		}
		System.out.println("모든 동물 작성 완료");
		
		//파일 이름 변경하기
		File 새로운이름 = new File(바탕화면경로 + "/좋아하는동물이름.txt");
		if (파일.exists()) {
			//만약에 폴더 이름을 성공적으로 변경했다면
			if (파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			} else {
				System.out.println("파일 이름 변경에 실패했습니다.");
			}
		} else {
			System.out.println("파일 이름이 존재하지 않습니다. 만들어주세요^^.");
		}
		
		
		//삭제하기
			//매커니즘 : 폴더 삭제하고 파일 삭제
			//이유 : 폴더 삭제를 할 때 폴더안에 파일이 존재한다면 폴더가 삭제 되지 않음
		//항상 폴더 안에 파일이 존재하는지 확인하고 폴더 안에 파일이 하나도 존재하지 않는다면 삭제해야함
		//배열을 이용해서 파일 목록을 받고 파일 목록이 없다면 삭제
		File[] 파일목록 = 폴더.listFiles();
		System.out.println("폴더 안에 있는 파일 목록 : " + 파일목록);
		for (File f : 파일목록) {
			System.out.println(f.getName());
		}
		
		새로운이름.delete();
		System.out.println("파일을 성공적으로 삭제하였습니다.");
		
		if (폴더.delete()) {
			System.out.println("폴더를 성공적으로 삭제하였습니다.");
		} else {
			//만약에 폴더가 열려있거나 사용중이면 삭제가 안 됨
			//폴더 안에 파일이 숨겨져 있을 경우 - 삭제 권한 문제
			System.out.println("폴더 삭제에 실패했습니다.");
		}
	}
}
