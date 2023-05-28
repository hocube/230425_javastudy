package day14.com.ict.edu.practice;

public class Ex03_Sub extends Ex03_Super {
String name = "홍반장";
int age = 13;
double weight = 78.9;
private String cat = "야옹이";

static String computer = "10세대";

public Ex03_Sub() {
System.out.println("자식 클래스: " + this);
}

public void play() {
	String name = "홍두께";
	System.out.println(name);  //홍두께
	System.out.println(this.name);  //홍반장
	System.out.println(super.name);  //홍길동
	
	System.out.println(weight);
	System.out.println(this.addr);
	
	System.out.println(addr);
	System.out.println(this.addr);
	System.out.println(super.addr);
	
	System.out.println(Ex03_Sub.computer);
	System.out.println(Ex03_Super.PlayStation);
	}
}
