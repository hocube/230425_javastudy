package day15.com.ict.edu2;

public abstract class Ex01_Abstract {
	//추상 클래스와 추상 메서드
	//추상 메서드 : 메서드에서 body(몸통=블록={ }=실제 실행 내용을 기록하는 부분)를 가지고 있지 않은 메서드
	//			 구체적 실행 내용이 없음.
	//			 반드시 abstract 예약어를 붙여야 한다.
	
	//추상 클래스 : 일반클래스가 가지는 멤버 필드, 멤버 메서드, 생성자를 가질 수 있다.
	//			 하나 이상의 추상 메서드를 가지고 있는 클래스를 말한다.
	//			 반드시 abstract 예약어를 붙여야 한다.
	
	String name = "홍길동";
	
	//일반 메서드
	public void play() {
		System.out.println("놀자");
	}
	public String sound() {
		return "6시간 이상 잠자기";
	}
	
	
	//추상 메서드
	//public void hobby(); ->이렇게 하면 오류남.
	
	//추상 메서드
	public abstract void hobby();
}
