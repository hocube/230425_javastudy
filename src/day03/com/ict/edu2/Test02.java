package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 몇 초일까요?
		// 1시간 60분 3600초  60*60
		
		/*
		 * int second = 1; 
		 * int minute = second * 60; 
		 * int time = minute * 60;
		 * System.out.println(time*2 + minute*40 + second*30 + "분");
		 */
		
		int h = 2 * 60 * 60; //시간 => 초
		int m = 40 * 60;     //분 => 초
		int s = 30; 
		
		int result = h + m + s;
		System.out.println("2시간40분30초는 "+ result + "초 입니다");
	}
}
