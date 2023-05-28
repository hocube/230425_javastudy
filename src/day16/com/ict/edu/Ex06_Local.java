package day16.com.ict.edu;

//Local 내부 클래스
public class Ex06_Local {
	String name = "둘리";
	public Ex06_Local() {
		System.out.println("외부 생성자: " + this);
	}
	
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	public void play() {
		int age = 24;
		//static int eyes = 2; 내부 클래스 안에는 static 못 쓰기 때문에 내부 클래스를 만든다.
		
		//내부 클래스
		class Dog{
			String addr = "서울 용산구";
			public Dog() {
				System.out.println("내부 생성자: " + this);
			}
			public void prn() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(addr);
				//System.out.println(str);  //쓸 수 없음 sound 안에서 실행됐다가 끝남.
			}//내부 클래스 메서드의 끝
		}//내부 클래스 끝
		Dog dog = new Dog();
		dog.prn();
	}//외부 클래스 멤버 메서드 끝
}
