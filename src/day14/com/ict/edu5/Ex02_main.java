package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
		//방법1. 이렇게 하면 생성을 두개 하지만,
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();

		dog.sound();
		dog.hobby();
		System.out.println(dog.eyes);
		System.out.println(dog.color);
		System.out.println();

		cat.sound();
		cat.hobby();
		System.out.println(cat.eyes);
		System.out.println(cat.color);
		System.out.println();

		
		// 방법2.
		// 객체 생성을
		// 부모 클래스 변수 = new 자식 클래스 생성자();로 함
		// 이렇게 하면 객체 생성은 조건에 따라 한번만 하게 됨. 
		// '다형성' 이라고 함.
		Ex02_Animal animal = null;  //초기값 설정
		int su = 1;
		if (su == 1) { // 1: 고양이
			animal = new Ex02_Cat();
		} else if (su == 2) { // 2: 강아지
			animal = new Ex02_Dog();
		}
		
		//오버라이딩 한 건,
		//둘 다 가지고 있으면 자식 것을 사용
		animal.sound();
		
		//부모 것만 나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		//자식 클래스가 가지고 있는 것은 사용 못 함.
		//animal.play();
	}
}