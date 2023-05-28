package day15.com.ict.edu;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		//이렇게 하는 순간 부모인 Animal이 먼저 만들어지고
		//그 다음 자신이 만들어짐
		//부모가 먼저 만들어져야 자식이 사용할 수 있음.
		
		System.out.println(cat.eye); 
		System.out.println(cat.color); //부모랑 자식에게 둘 다 있을 땐 자식꺼가 나옴.
		
		//부모께 실행 됨. 부모한테만 있으니깐.
		//cat.sound();
		cat.hobby();
		cat.sleep();
		cat.play();
		cat.sound(); 
		//cat 클래스에서 sound 오버라이딩 후 이렇게 수정하면 "야옹 야옹"으로 출력. 
	}
}
