package day16.com.ict.edu;

public class Ex05_MemberInnerClass {

	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	// 생성자
	public Ex05_MemberInnerClass() {
		System.out.println("외부 생성자: " + this);
	}

	// 메서드 //메인 메서드 아니기 때문에 private와 static도 모두 가져올 수 있다.
	public void play() {
		int money = 1000;
		System.out.println("외부 메서드: " + name);
		System.out.println("외부 메서드: " + money);
	}

	// 내부 클래스
	public class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;

		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}

		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);

			// 외부클래스의 멤버도 마을대로 사용 가능 (private 도 가능)
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);

			// 외부클래스의 메서드도 호출가능
			play();
		}
	}

}