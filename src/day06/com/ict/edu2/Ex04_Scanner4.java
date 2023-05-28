package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		//for문으로 하기
		Scanner scan = new Scanner(System.in);
	
		System.out.print("원하는 반복 횟수 : ");
		int su = scan.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = scan.next();
		
//		for (int i = 0; i < su; i++) { //for문은 0부터 시작. 그래야 도는 횟수가 맞음.
//			System.out.println(str);   //i=1; i<su 만약 su가 3이면 1,2 2번 출력. 그렇기 때문에 틀림.
//									   //0부터 시작하면 su만큼 돈다/만약 1로 할거면 <= 로 해야 함.
		
		
		//while문으로 하기
		int i = 0;
		while (i < su) {
			System.out.println(str);
			i++;
		}

	}
}
