package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex02_Scanner2 {
	public static void main(String[] args) {
		// 키보드 입력 정보를 받아서 일 처리하자
		Scanner scan = new Scanner(System.in);
		
		
		// 키보드에서 받은 숫자가 홀수, 짝수인지 판별하자
		System.out.print("숫자 입력 : ");
		int su = scan.nextInt();
		String str = "";

		if (su % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		
		System.out.println(su + "는 " + str + " 입니다.");
	
		
		//총점을 받아서 60이상이면 합격, 아니면 불합격
		System.out.print("총점 입력 : ");
		int total = scan.nextInt();
		str = "";
		
		if (total >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println("당신의 점수는 " + total + "이고, 당신은 " + str + " 입니다.");
		
		
	}//main
}//class
