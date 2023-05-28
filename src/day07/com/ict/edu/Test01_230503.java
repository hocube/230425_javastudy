package day07.com.ict.edu;

public class Test01_230503 {
public static void main(String[] args) {
	
	//이름 홍길동, 국어 95, 영어 85, 수학 85점.
	//총합, 평균 구하고
	// 이름, 총점, 평균 코딩 (평균은 소수점 첫째 자리 까지)
	
	String name = "홍길동";
	int kor = 95;
	int eng = 85;
	int math = 85;
	
	int sum = (kor + eng + math);
	double avg1 = (double)(sum)/3;
	double avg2 = (int)(avg1*10)/10.0;
	
	System.out.println("이름 : " + name);
	System.out.println("총점 : " + sum);
	System.out.println("평균 : " + avg2);
	System.out.println("===============================");

	
	//3989초의 시, 분, 초 구하기
	int time = 3989;
	
	int h = 0;
	int m = 0;
	int s = 0;
	int res = 0;  
	
	h = time / (60*60);
	res = time % (60*60);
	m = res / 60;
	s = res % 60;
		
	System.out.println(h + "시간 " + m + "분 " + s + "초 ");
	System.out.println("===============================");

	
	//카페모카 8500원 친구와 둘이서 20000원 내고 주문.
	//잔돈 계산하라 (부가세 10% 포함 계산)
	int dan = 8500;
	int su = 2;
	int in = 20000;
	int vat = (int)((dan*su)*0.1);
	
	System.out.println(in - ((dan*su) + vat) + "원");
	System.out.println("===============================");
	
	
	//삼항 연산자로 int k1이 홀수인지 짝수인지 구하라
	int k1 = 987;
	String str = "";
	
	str = (k1 %2 ==1) ? "홀수" : "짝수";
	System.out.println("결과: " + str);
	System.out.println("===============================");

	
	//if~else로 char k2가 대문자인지, 대문자가 아닌지 판별하라
	char k2 = 'A';
	String str1 = "";

	if (k2 >= 'A' && k2 <= 'Z') {
		str1 = "대문자 입니다.";
	} else {
		str1 = "대문자가 아닙니다.";
	}
	System.out.println(k2 + "는 " + str1);
			
	System.out.println("===============================");

	
	//if~else. 
	//근무시간 8시간까지는 시간당 9620원. 8시간 초과한 시간만큼 1.5배 지급. 현재 근무한 시간 10시간. 급여 출력하라
	int work = 10;
	int limit = 8;
	int danga= 9620;
	int pay = 0;
	
	 if (work > limit) {
		 pay = (danga*limit) + (int)((work-limit)*danga*1.5);
	 }else {
		 pay = work * danga;
	 }
	 System.out.println(pay);
 }

}
