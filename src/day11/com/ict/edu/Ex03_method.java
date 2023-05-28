package day11.com.ict.edu;

public class Ex03_method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 75;
	
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//모두 반환형 있음
	//총점 구하는 메서드
	public int getSum() {
		sum = kor + eng + math;
		return sum;   //반환형 있으니깐 return 써주기
		//return을 사용했기 때문에 이따 main에서 내가 굳이 따로 호출할 필요 없다.
	}
	
	//평균 구하는 메서드
	public double getAvg() {
		avg = sum/3;
		return avg;
	}
	
	//학점 구하는 메서드
	public String getHak() {
		if (avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		return hak;
	}
		
}
