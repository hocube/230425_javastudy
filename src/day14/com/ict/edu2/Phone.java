package day14.com.ict.edu2;

public class Phone {
	String number = "010-1234-5678";
	
	public void call() {
		System.out.println("전화 기능");  //공통 기능(부모)
	}
	public void sms() {
		System.out.println("문자 기능");  //공통 기능(부모)
	}
}
