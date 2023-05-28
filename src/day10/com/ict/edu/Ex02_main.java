package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// static; 객체 생성 없이, 클래스이름.변수이름
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		System.out.println("===============");

		// instance는 객체 생성 후 접근
		// 객체 생성)
		// 클래스 이름 참조변수 = new 생성자([인자]);
		// ★★ 해당 클래스의 생성자가 없으면 기본 생성자 사용
		// ★★ 기본 생성자란 인자가 없는 생성자, 클래스() = 기본생성자()
		// ↓ 인자가 없는 기본 생성자
		Ex02_class test = new Ex02_class(); // 객체 생성
		// 클래스 생성자
		System.out.println(test);
		System.out.println("===============");

		// 객체 생성 후
		// 접근법; 참조 변수. 멤버 필드
		System.out.println(test.name);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);
		System.out.println(test.sum);
		System.out.println("===============");

		// 변수와 상수의 차이
		// instance
		test.name = "일지매"; // 변수라 값 변경 가능
		// test.GENDER = "여성"; //상수라서 값 변경 못 함

		// static
		Ex02_class.sum = 1000; // 변수라 값 변경 가능
//			Ex02_class.AVG = 12345;   //상수라서 값 변경 못 함

		System.out.println(test.name);
		System.out.println(Ex02_class.sum);

	}
}