package day13.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		
		//객체 생성 전에도 호출가능=클래스 이름.
		System.out.println(Ex02_static.su2);
		System.out.println();
		
		Ex02_static p1 = new Ex02_static();
		System.out.println(p1.su1); // 11
		System.out.println(p1.su2); // 11
		System.out.println();

		Ex02_static p2 = new Ex02_static();
		System.out.println(p2.su1); // 11
		System.out.println(p2.su2); // 12 //static에 현재 11이 저장 되어있음 거기에 +1
		System.out.println();

		Ex02_static p3 = new Ex02_static();
		System.out.println(p3.su1); // 11
		System.out.println(p3.su2); // 13 //static에 현재 12이 저장 되어있음 거기에 +1
		System.out.println();

		System.out.println(p1.su1); // 11
		System.out.println(p1.su2); // 13 //똑같은 p1이지만 중간에
									// static을 실행시켰었기 때문에 금액이 증감했다.
		
		//static은 공유를 한다!
		
	}//main
}//class
