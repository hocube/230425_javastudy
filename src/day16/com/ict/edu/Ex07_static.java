package day16.com.ict.edu;

//public static class Ex07_static { //일반 클래스에서는 static 사용 불가
public class Ex07_static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	// 생성자
	public Ex07_static() {
		System.out.println("외부 생성자: " + this);
	}

	// 메서드 //메인 메서드 아니기 때문에 private와 static도 모두 가져올 수 있다.
	public void play() {
		int money = 1000;
		System.out.println("외부 메서드: " + name);
		System.out.println("외부 메서드: " + money);
	}

	// 내부 클래스의 멤버 변수가 static이면 class를 static으로 만들어야 한다.
	// 멤버 변수와, 멤버 메서드에만 static을 쓴다.
	// 권장 사항은 아님
	public static class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;
		static int count = 30;

		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}

		public void prn() {
			int weight = 79;
			System.out.println(addr);
			System.out.println(roomNumber);  //외부거와

			// 외부클래스의 멤버도 마을대로 사용 가능 (private 도 가능)
			//System.out.println(name);   오류
			//System.out.println(age);    오류
			System.out.println(gender);  
			      //static(gender는 static)은 사용 가능

			// 외부클래스의 메서드도 호출가능
			//play();
		}
	}
}
