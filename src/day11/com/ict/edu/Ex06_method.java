package day11.com.ict.edu;

public class Ex06_method {
	//변수 없이 리턴해서
	
	//총점을 구하는 총점 리턴하는 메서드
	public int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
		
		// 이렇게 해도 됨.
		// return kor + eng + math;
	}
	
	//평균을 구하는 메서드
	public double getAvg(int sum) {
		double avg = (int)(sum/3.0*10)/10.0;
		return avg;
		
		// 이렇게 해도 됨.
		// public double getAvg(int kor, int eng, int math)
		// double avg = (int)(kor + eng + math/3.0*10)/10.0;
	}
	
	//학점을 구하는 메서드
	public String getHak(double avg) {
		String hak = "";
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
		return hak;
		
	}
}
