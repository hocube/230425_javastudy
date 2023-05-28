package day14.com.ict.edu4;

public class Ex01_Super {
	String name = "홍길동";
	int age = 54;
	String addr = "서울 방학동";
	String car = "제네시스";
	
	//자식 클래스에서 부모의 기본 생성자를 잘 쓰고 있었는데 
	//밑에껄 생성하면 기본 생성자가 사라지면서 자식 클래스에서 오류남!
	//왜나면 자식 클래스에서 super 기본 생성자가 되어있음.
//	public Ex01_Super(String addr) {
//		this.addr = addr;
//	}
	
	public Ex01_Super() {

	}
	
	
	public Ex01_Super(String addr) {
		this.addr = addr;
	}

}
