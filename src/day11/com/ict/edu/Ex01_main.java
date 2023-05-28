package day11.com.ict.edu;

public class Ex01_main {
	
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 호출 가능
		// static 호출 : 클래스 이름.변수,   클래스 이름.메서드
		System.out.println(Ex01_method.ki);  //178.5
		
		Ex01_method.getAvg();   //void
		System.out.println(Ex01_method.ki);  //178.5 + 5 = 183.5
		System.out.println("================");
		
		
		//생성자 만들기
		//stack에 t1이라는게 만들어 지고,
		//heap 메모리 공간에 Ex01_method이라는 클래스가 만들어짐.
		//그 안에 Ex01_method 안에 선언해놓은 멤버 필드(변수들)가 다 들어 감.
		//t1을 부르면 Ex01_method클래스로 감.
		Ex01_method t1 = new Ex01_method();
		//만약 Ex01_method t2 = new Ex01_method();로 한개 더 만들면 
		//Ex01_method에 있는 변수들이 다시 생성됨. 같은 구조의 아파트에 윗집, 아랫집 처럼
		//하지만 t2는 아직 메서드를 실행하지 않았기 때문에 값이 초기값 그대로인 상태.
		
		//instance 호출 방법: 참조변수.변수,  참조변수.메서드
		String n = t1.name;   //t1에 있는 name변수 호출하면
							  //Ex01_method에 있는 "홍길동"을 불러와 호출된 것을 
							  //n에 저장
		
		//void는 호출한 곳으로 아무것도 가져오지 않는다.
		//저장할게 없기 때문에 변수 생성하지 않는다.
		//Ex01_method에 getTotal은 void이기 때문에!
		t1.getTotal();
		
		//total 값이 변경된 것을 확인할 수 있다.
		int k1 = t1.total;     //원래 0이였던 토탈이 메서드로 실행되어서 값이 변했음 
		System.out.println(n);
		System.out.println(k1);
		System.out.println("================");
		
		
		double k2 = Ex01_method.getAvg2();  
		System.out.println(k2);
		//현재 키 183.5(위에서 한번 출력했었기 때문에) + 0.7 하면 =184.2
		//static은 새로 만들어도 자기가 원래 가지고 있던 최종값을 그대로 가지고 있다.
		//instance는 새로 만들면 다시 초기값이 저장되어 있다. 
		//static은 따로 클래스가 1개 만들어 짐. 
		//인스턴스처럼 t1, t2, t3 이렇게 여러개 만들어지지 않음.
		//그래서 static 클래스 1개로 t1, t2, t3..와 공통으로 사용. 
		//인스턴스는 자기 것만 바꾸지 남의 것은 못 바꿈.
 	}
}
