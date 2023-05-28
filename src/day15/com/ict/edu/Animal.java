package day15.com.ict.edu;

//'final'은 3곳에 붙일 수 있음: 1. class 앞, 메서드 앞, 3.변수 앞 
//1. 변수 앞에 final :(=상수) 데이터 변경 방지
//2. 메서드 앞에 final :(=오버라이딩 방지) 메서드 내용 변경 방지
//3. 클래스 앞에 final :(=상속 방지) 자식 클래스 생성 방지

public class Animal {
	int eye = 2;
	String color = "그레이";

	public void sound() {
		System.out.println("울음 소리");
	}

	public void hobby() {
		System.out.println("좋아하는 행동");
	}

	//final: 오버라이드 금지! 
	public final void sleep() {
		System.out.println("8시간 이상 잠을 잔다.");
	}
	//자식 클래스에서 수정을 못하게 하려면 'final'을 붙임
}
