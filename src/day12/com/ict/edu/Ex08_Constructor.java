package day12.com.ict.edu;

public class Ex08_Constructor {
	//얘네들은 초기값
	//생성자가 들어오는 순간 의미 없어짐
	private String name ="물";
	private int price = 500;
	
	//생성자    생성자 만들었기 때문에 기본 생성자 쓸 수 없다. 물론 만들면 쓸 수있다.
	public Ex08_Constructor(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
