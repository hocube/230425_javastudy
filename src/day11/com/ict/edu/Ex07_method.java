package day11.com.ict.edu;

public class Ex07_method {

	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	//변수가 있기 때문에 void를 만들 수 있다.
	
	//총점을 구하는 메서드
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	
	//평균을 구하는 메서드
	//위에서 sum이 만들어졌기 때문에 ()안에 굳이 뭘 넣을 필요가 없음.
	//sum을 k1에 넣어서 사용 가능 함. 
	public void getAvg() {
		avg = (int)(sum/3.0*10)/10.0;
	}
	
	//학점을 구하는 메서드
	//avg가 구해졌기 때문에 굳이 () 뭘 쓰지 않아도 hak 구할 수 있음.
	//avg를 double k1에 넣어서 사용 가능 함. 
	public void getHak() {
		if(avg >= 90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}

}
