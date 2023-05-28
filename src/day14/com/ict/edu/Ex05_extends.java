package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random {
	int su = nextInt();
	//상속을 하면 객체 생성하지 않고 그냥 가져다 쓸 수 있음.

	public void play() {
		System.out.println(su);
	}

	// static 메서드는 static 변수만 사용 가능
	public static void main(String[] args) {
		// int su = nextInt 		->오류
		// System.out.println(su);  ->오류
		
		//자기 자신이라도 객체를 만들자
		Ex05_extends test = new Ex05_extends();
		test.play();
	}
}
