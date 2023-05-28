package day14.com.ict.edu4;

public class Ex01_Sub extends Ex01_Super{
	//자식한테 상속을 써준다.
	String name = "홍반장";
	int age = 13;
	double weight = 78.4;
	
	// this() : 자기 자신의 생성자를 뜻한다.
	// 			생성자의 첫번째 줄에 있어야 다른 생성자 호출
//	public Ex01_Sub() {
//		this("홍두께", 14); //this는 자기 자신의 생성자를 뜻한다. 바로 밑에 애를 뜻 함.
						  //↓
//	}					  //↓ (String name, int age) 이걸 뜻 함.
	
	//super() : 부모 클래스 생성자를 뜻한다.
	//자식 클래스 생성자 첫 줄에 부모 클래스 생성자가 숨어있다.
	//그게 바로 super()
	public Ex01_Sub() {
		// public Ex01_Super 이렇게 숨어있음.
		//super("서울 마포구");  //이렇게 쓸 수 있다.
		//얘는 인자가 있기 때문에 인자 있는 생성자로 가야함.
		this("kkk",14);// super랑 this를 첫줄에 같이 못 씀.
					   // 그래서 얘가 밑으로 넘어가서 아래에서 super해 줌.
	}
	
	public Ex01_Sub(String name, int age) {
		super(); //얘는 기본 생성자로 가야함.
		this.name = name;
		this.age = age;
	}
}
