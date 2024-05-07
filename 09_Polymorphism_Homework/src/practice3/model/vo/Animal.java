package practice3.model.vo;

//abstract 추상 메서드를 사용하기 위해서는 class도 추상 클래스여야 함
public abstract class Animal {
//필드
	private String name;
	private String kinds;
//메서드
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds;
	}
	//생성자(기본)
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//생성자(필수)
	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	//toString
	@Override
	public String toString() {
		return "저의 이름은 " + name + " 이고, 종류는 " + kinds + " 입니다.";
	}
	//abstract
	public abstract void speak();
}
