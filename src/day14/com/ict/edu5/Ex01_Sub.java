package day14.com.ict.edu5;

public class Ex01_Sub extends Ex01_Super {
	int weight = 35;
	
	//ctrl+스페이스바
	//정보은닉(부모껄 숨겼음)
	//부모 메서드 가지고 왔지만 내용은 바꿨음.
	@Override
	public void sound() {
		System.out.println("음악 소리");
	}
	
	//메서드
	public void hobby() {
		System.out.println("잠자기");
	}
}
