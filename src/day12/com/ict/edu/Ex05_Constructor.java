package day12.com.ict.edu;

public class Ex05_Constructor {
	// 생성자 : 클래스를 객체로 만들 때 한 번 호출한다.
	// 생성자 목적 : 멤버 필드(변수와 상수)의 초기값 지정
	//      특징 : 생성자 이름은 클래스 이름이다.
	//		      반환형이 없는 메서드와 같다.
	//			  [접근제한자] 생성자 이름([인자]...) {실행 내용}
	// 			  하나의 클래스에 여러개의 생성자를 가질 수 있다. (생성자 오버로딩)
	//			  생성자가 없으면 객체 생성할 때 기본 생성자를 호출한다.
	//			  기본 생성자란 인자가 없는 생성자를 말한다.
	
	private String name ="홍길동";
	private int age = 24;
	private String addr = "충청도";
	
	
	//기본 생성자
	public Ex05_Constructor() {
		name = "일지매";
		age = 29;
		addr = "전라도";
	}
	
	// 기본 생성자가 아님
	// 생성자 오버로딩(생성자가 여러개 있는거)
	public Ex05_Constructor(String name) {
		this.name = name;
	}
	public Ex05_Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Ex05_Constructor(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}			 
}
