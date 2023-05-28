package day15.com.ict.edu3;

//인터페이스: 서비스를 제공하는 목록
//		   상수와 추상 메서드만 가지고 있다.
//		   일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//		   객체 생성 안됨 (생성자도 없다.)
//		   다중 상속을 할 수 있다. (즉, 인터페이스는 여러 개의 인터페이스를 부모로 만들 수 있다.)
//		   클래스를 부모로 만들 수는 없다. 왜냐? 인터페이스는 상수와 추상 메서드만! 가지기 때문에
//		   '인터페이스가 같다' 라는 말은 '대체가 가능하다', '호환이 가능하다' 라는 뜻.

public interface Ex01_interface {
	// 모두 다 static final이다.
	final int SU1 = 10; // 상수라서 final 붙임
	static final int SU2 = 20;
	int su3 = 30;
	static int su4 = 40;

	// 추상 메서드
	public abstract void sound();

	// 추상 클래스에서는 abstract 안 붙으면 오류였지만
	// 추상 메서드에서는 abstract 안 붙여도 사용 가능
	public void play();

	// 일반 메서드 사용 불가
	// public void hobby() {};
	public static void like() {
		System.out.println("놀기 좋아");
	}
}
