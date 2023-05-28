package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전체 횟수, 짝수 횟수, 짝수가 나온 퍼센트 구하기 (소수점 첫 째자리 까지 구하자)
		int count = 0;  //전체 횟수
		int even = 0;   //짝수 횟수
		
		while(true) {
		count++;
		System.out.print("숫자 입력 : ");
		int su = scan.nextInt();
		String str = "";
		
		if (su %2 == 0) {
			str = "짝수";
			even++;
		}else {
			str = "홀수";
		}
		System.out.println(su + "는 " + str + " 입니다");
		
		System.out.print("계속 할까요?(1. yes,  2. no)  >>>");
		int s1 = scan.nextInt();
		if (s1 == 2)  break;
	 }
	 double per = (even / (count*1.0)) * 100;
	 
	 System.out.println("전체 개수 : " + count);
	 System.out.println("짝수 개수 : " + even);
	 System.out.println("퍼센트 : " + (int)(per*10)/10.0 + "%");
		
 }//main
}//class
