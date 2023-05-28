package day15.com.ict.edu;

public class Cat extends Animal {
	String color = "삼색이";
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹~");
	}
	
	public void play() {
		System.out.println("창 밖을 바라본다.");
	}
	
	//부모 클래스에서 해당 메서드에 final이 붙어 있으면 Override 안 됨.
	//변경만 못하지 사용은 가능! (부모 클래스걸로 사용)
//	@Override
//	public void sleep() {
//		System.out.println("12시간 이상 잠을 잔다.");
//	}
}
