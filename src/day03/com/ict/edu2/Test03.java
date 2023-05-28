package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		// 3989초는 몇 시간, 몇 분, 몇 초 인가?
		// 1시간은 60분 60*60초
		
		//int time = 3989;
		//int hour = time/(60*60);
		//int minute = time/60 - hour*60;
		//int second = time%60;
		//System.out.println(hour + "시간 " + minute + "분 " + second + "초 ");
		
		//답
		// 초를 시간, 분, 초로 구하기
		int time = 3989;
		int h = 0;    // 시
		int m = 0;    // 분
		int s = 0;    // 초
		int res = 0;  // 나머지
		
		h = time / (60*60);     // 1시간
		res = time % (60*60);   // 389
		m = res / 60;           // 분  (몫)
		s = res % 60;           // 초  (나머지)
		
		System.out.println(h + "시간 " + m + "분 " + s + "초 " + "입니다");
		
	}
}
