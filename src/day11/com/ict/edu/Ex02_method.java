package day11.com.ict.edu;

public class Ex02_method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	int sum = 0; // 여기다 써야 함. 메서드 안에다 쓰면 안 됨.
	double avg = 0.0; // 여기다 써야 함. 메서드 안에다 쓰면 안 됨.
	String hak = ""; // 여기다 써야 함. 메서드 안에다 쓰면 안 됨.

	// 모두 void로 만들겠다.
	// 총점 구하는 메서드
	public void getSum() {
		sum = kor + eng + math;
		// int sum = kor + eng + math; -> 이렇게 쓰면 안되고 위에 선언
		// 지역변수(sum)는 getSum을 호출해야지만 쓸 수 있음.
		// sum은 밑에 괄호가 끝나면 없어져 버림.
	}

	// 평균 구하는 메서드
	public void getAvg() {
		avg = sum / 3;
		// double avg = sum/3; -> 이렇게 쓰면 안되고 위에 선언
		// 얘 기준에서는 위에 있는 sum을 찾을 수없음.
	}

	// 학점 구하는 메서드
	public void getHak() {
		// String hak = ""; -> 이렇게 쓰면 안되고 위에 선언
		if (avg >= 90) {
			hak = "A";
			// avg는 지역변수라 여기서 찾을 수 없음.
		} else if (avg >= 80) {
			hak = "B";
		} else if (avg >= 70) {
			hak = "C";
		} else {
			hak = "F";
		}

	}

}// class
