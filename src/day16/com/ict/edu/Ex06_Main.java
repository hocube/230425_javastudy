package day16.com.ict.edu;

public class Ex06_Main {
public static void main(String[] args) {
	// 내부 클래스를 별도로 객체 생성할 수 없다. (static은 제외)
	//Dog test = new Dog();  
	
	//Member 내부 클래스 만드는 방식으로도 사용 불가
	Ex06_Local test = new Ex06_Local();
	
	//메서드 안에 있으므로 메서드를 실행해야 내부 클래스를 생성할 수 있음.
	//Ex06_Local.Dog exam = test.new Dog();
	test.play();
	//메서드가 끝나면 내부 클래스도 사라진다.
	//메서드가 끝나기 전에 내가 하고 싶은걸 다 해야함.
}
}
