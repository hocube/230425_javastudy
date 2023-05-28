package day11.com.ict.edu;

public class Ex01_method {
	// 클래스 :  멤버 필드, 멤버 메서드, 생성자
	// 멤버 필드 : 인스턴스 변수, 인스턴스 상수, static 변수, static 상수

	String name = "홍길동"; // 인스턴스 변수
	int kor = 80; // 인스턴스 변수
	int eng = 95; // 인스턴스 변수
	int math = 85; // 인스턴스 변수
	int total = 0; // 인스턴스 변수
	double avg = 0.0; // 인스턴스 변수
	
	
	// 멤버 메서드() : 동작, 기능, 실행하는 것
	// 형식) [접근 제한자] [메서드 종류] 반환형 메서드 이름 ([인자],...) { 실행할 내용 }
	// 메서드는 접근 제한자를 보통 public을 씀
	// 결과물의 자료형, 결과물이 아님!
	// ★★ 반환형 : 반드시 호출한 곳으로 되돌아 가는데, 실행 결과를 가지고 갈 때 실행결과의 자료형을 반환형
	//	         실행 결과를 가지고 가지 않으면 void라는 예약어를 사용한다. 
	
	// instance 메서드
	public void getTotal() {
		total = kor + eng + math;
		//return;     //void에도 쓸 수는 있지만! 갖고 갈게 없으니 굳이 쓰지 않는다.
					  //가져갈 데이터 타입이 없기 때문에 return뒤에 그냥 세미콜론 붙임.
	}
	
	// instance 메서드
	public int getTotal2() {
		int sum = kor + eng + math;  //반환형의 똑같은 데이터 타입의 변수로 만들기
		
		//변수로 만들어서 return하는 방법
		//반환형이 void가 아니면 맨 마지막 return 데이터 나 데이터를 가지고 있는 변수
		return sum;   //얘는 int라는 자료형이 있기 때문에 숫자 넣을 수 있음.
	}
	// instance 메서드
	public int getTotal3() {
		//또 다른 return 방법 
		return kor + eng + math + (int)ki; 
	}
	
	
	static double ki = 178.5;   //static 변수 선언 했음.
	
	// static
	public static void getAvg() {
		// static일 경우는 instance 변수 사용 불가
		// static은 미리 만들어짐.
		// static을 만든 후에  instance 변수 선언이 되었기 때문에 사용을 못함
		//avg = total / 3.0;   //그래서 이건 못 씀
		
		//ki가 static이므로 사용 가능
		ki = ki + 5;
	}
	
	public static double getAvg2() {
		return ki = ki + 0.7;
	}
}
