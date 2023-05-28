package day14.com.ict.edu4;

public class Ex01_main {
public static void main(String[] args) {
	//자식 객체를 생성하면 부모 객체가 먼저 만들어진다.
	//자식 클래스, 부모 클래스의 생성자가 없으면 기본 생성자로 호출
	//객체가 만들어졌다는건 생성자를 한번 했다는 거
	//우리 눈에는 안보이지만 sub랑 super에 기본 생성자가 있음.
	Ex01_Sub test = new Ex01_Sub();  //생성자
	System.out.println(test.name);
	System.out.println(test.age);
	System.out.println(test.weight);
	System.out.println(test.addr);
	System.out.println();
	
	
	Ex01_Sub test2 = new Ex01_Sub("일지매", 21);
	System.out.println(test2.name);
	System.out.println(test2.age);
	System.out.println(test2.weight);
	System.out.println(test2.addr);
}
}
