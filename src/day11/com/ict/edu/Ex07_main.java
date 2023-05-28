package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];

		// 객체 생성
		Ex07_method test = new Ex07_method();

		// 입력 받기
		for (int i = 0; i < kor.length; i++) {

			System.out.print("이름: ");
			name[i] = scan.next();

			System.out.print("국어 점수: ");
			kor[i] = scan.nextInt();

			System.out.print("영어 점수: ");
			eng[i] = scan.nextInt();

			System.out.print("수학 점수: ");
			math[i] = scan.nextInt();

			//총점 구하기 
			//void였기 때문에 나한테 안 넘어옴, 자기가 전역변수로 가지고 있음
			//총점->평균->학점 순서로 구해야 함. 순서 틀리면 안돼!
			test.getSum(kor[i], eng[i], math[i]);  //이걸론 나한테 안 옴. 하지만 실행은 됐음.
			sum[i] = test.sum;  //test.sum에 들어 온 값을 sum[i]에 집어 넣는다.

			// 평균 구하기 (메서드 불러와서)
			test.getAvg( );
			avg[i] = test.avg;

			// 학점 구하기 (메서드 불러와서)
			test.getHak( );
			hak[i] = test.hak;
			
		} // for

		// 출력하기
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(hak[i]); // \t하면 옆으로 계속 가니깐 빼기!
		}
	}
}
