package practice3.model.vo;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Rabbit;
import practice3.model.vo.Horse;

//true면 토끼
//false면 말이 들어감
public class AnimalWorld {
	public static void main(String[] args) {
		//5개짜리 Animal 타입의 객체 배열 생성
		Animal[] animals = new Animal[5];
		
		//무작위
		Random random = new Random();
		
		for (int i = 0; i < animals.length; i++) {
			if (random.nextBoolean()) {
				animals[i] = new Rabbit("토끼" + i, "토끼", random.nextInt(10) + 1, "흰색");
			} else {
				animals[i] = new Horse("말" + i, "말", "마구간", "검은색");
			}
		}
		for(Animal a : animals) {
			a.speak();
		}
	}
}
