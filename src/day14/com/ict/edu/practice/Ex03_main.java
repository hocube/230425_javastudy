package day14.com.ict.edu.practice;

public class Ex03_main {
public static void main(String[] args) {
	Ex03_Sub sub = new Ex03_Sub();   //객체 생성
	System.out.println("메인에서 생성자 호출: " + sub);
	
	System.out.println(sub.name);
	System.out.println(sub.age);
	System.out.println(sub.addr);
	
	System.out.println(Ex03_Sub.computer);
	System.out.println(Ex03_Super.PlayStation);
}
}
