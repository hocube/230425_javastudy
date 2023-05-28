package day15.com.ict.edu2;

public abstract class Ex04_Abstract {
	String name = "홍길동";

	public abstract void sound();

	public void play() {
		System.out.println("산에서 놀기");
	}
	
	//방법1
//	public String getName() {
//		return name;
//	}
	
	//방법2
	public abstract String getName();
	
}
