package practice3.model.vo;

//Animal extends
public class Rabbit extends Animal {
//필드
	private int weight;
	private String color;
//메서드
	//Setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Getter
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	//생성자(기본)
	public Rabbit() {
		
	}
	public Rabbit(String name, String kinds, int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	//@Override
	@Override
	public void speak() {
		System.out.println(super.toString() 
				+ " 몸무게는 " + weight + " kg 이며, 색상은 " + color + " 입니다.");
	}
}
