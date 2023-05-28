package day13.com.ict.edu;

public class Ex01_Construtor {
	//this와 this()
	//this : 객체 내부에서 객체 자신을 지칭하는 예약어
	//		 지역변수와 전역변수 이름이 같을 때 전역 변수 앞에 this를 붙인다.
	
	//this() : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	
	//전역변수
	private String name = "홍길동";
	private int age = 34;
	
	//기본 생성자
	//기본 생성자는 ctrl+스페이스바 하면 나옴
	public Ex01_Construtor() {
		//생성자가 다른 생성자를 호출 (반드시 첫번째 줄에서)
		this("임꺽정");
		System.out.println("기본 생성자 : " + this);
		//prn();   //생성자에서 메서드를 호출
		//this.prn();
	}
	
	//생성자 오버로딩(같은 이름의 생성자가 2개 이상 있음)
	public Ex01_Construtor(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void prn() {
		
	}
	
}
