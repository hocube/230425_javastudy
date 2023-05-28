package day11.com.ict.edu;

public class Ex08_method {
	//배열은 같은 자료형을 여러개 저장할 수 있지만,
	//클래스를 이용하면 자료형이 다르더라도 여러개 저장할 수 있다.
	
	//단점은 멤버필드에 바로 접근할 수 있다.
	//해결책 : 접근제한자를 private으로 지정 (그러면 직접 접근 못한다)
	//       변경하는 메서드(setter())와 데이터를 return하는 메서드(getter())를 만들어 사용
	String name = "";
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	int rank = 0;
	
	// 이름, 국어, 영어, 수학 점수를 받아서
	// 총점, 평균, 학점을 한번에 처리하는 메서드
	
	// 값들을 집어넣는 메서드를 만들고, 값들을 꺼내는 메서드를 만들어야 함.

}
