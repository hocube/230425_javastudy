package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식 클래스를 객체로 만들면 부모 클래스는 먼저 알아서 만들어진다.
		Ex03_Sub sub = new Ex03_Sub();
		System.out.println("메인에서 생성자 호출: " + sub);
		
		System.out.println(sub.name); //부모꺼에 가지도 않음.
		System.out.println(sub.age);  //부모께에 가지도 않음.
		System.out.println(sub.addr); //addr은 부모에 있기 때문에 부모껄 가져옴.
		
		
		//외부에서는 private 호출 안됨
		//pirvate은 static이여도 안됨.
		//System.out.println(sub.cat);
		//System.out.println(sub.dog);
		
		
		//static (접근 제한자가 우선 순위가 높다.)
		//이게 더 올바르다
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Sub.PlayStation);
	}
}
