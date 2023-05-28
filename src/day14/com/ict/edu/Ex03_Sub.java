package day14.com.ict.edu;

//자식 클래스에서 부모 클래스를 선택해서 상속 관계를 맺는다.
public class Ex03_Sub extends Ex03_Super {
	// 자식 클래스에서 부모 클래스를 선택해서 상속관계를 맺는다.
	// 상속 관계: 자식클래스가 부모 크래스의 멤퍼 빌드와 멤버 메서드를
	// 마음대로 사용할 수 있음.
	// 형식: class 자식 클래스 extends 부모 클래스
	// 특징: 모든 클래스는 하나의 부모클래스를 갖는다.
	// 부모 클래스가 없으면 object가 부모 클래스다.
	// 다중 상속을 지원하지 않는다.(즉 부모클래스는 하나만 존재한다.)

	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";

	static String computer = "10세대";

	public Ex03_Sub() {
		System.out.println("자식 클래스: " + this);
	}

	public void play() {
		String name = "홍두께";

		// 변수 우선 순위
		// 지역 변수 > 전역 변수(this) > 부모 클래스 변수(super)
		System.out.println(name); // 홍두께
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동

		// 지역변수가 없고, 전역변수, 부모 클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);

		//this : 전역변수,   super : 부모 클래스 변수
		System.out.println(addr); // 부모만 가지고 있은거
		System.out.println(this.addr); // 부모만 가지고 있은거
		System.out.println(super.addr); // 부모만 가지고 있은거

		// private인 경우
		System.out.println(cat);
		// 상속이라도 private은 접근할 수 없다.
		// System.out.println(dog);
		// System.out.println(super.dog);

		// static인 경우
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_Super.PlayStation); //추천
		
		System.out.println(PlayStation);
		System.out.println(this.PlayStation);
		System.out.println(super.PlayStation);
		System.out.println(Ex03_Sub.PlayStation);  //추천
	}
}
