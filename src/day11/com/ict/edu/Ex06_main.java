package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점 구하고 출력하자

		// 스캐너로 이름, 국어, 영어, 수학 점수를 받고
		// 총점 구하는 메서드를 옆에다 만들어서 국어 영어 수학 점수를 던져서 총점을 구해주고 나에게 다시 줌.
		// 나한테 다시 오니깐 리턴 있음
		// 평균을 구하기 위해 총점을 다시 던져주고 평균을 나한테 다시 줌. 리턴

		Scanner scan = new Scanner(System.in);

		// 1차원 배열 먼저 만들기
		// 1차원 배열은 같은 데이터타입끼리 묶어짐

		// 만약, 2차원 배열로 하려면 String은 못하고 double로 해야 함.
		// hak은 char로 변경해서 사용해야함.
		// 리턴해주는 메소드들도 double과 hak은 char로 바꿔줘야 함.
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		//객체 생성
		Ex06_method ex06 = new Ex06_method();

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

			
			// 총점 구하기 (메서드 불러와서)
			sum[i] = ex06.getSum(kor[i], eng[i], math[i]);
			
			// 평균 구하기 (메서드 불러와서)
			avg[i] = ex06.getAvg(sum[i]);
			
			// 학점 구하기 (메서드 불러와서)
			hak[i] = ex06.getHak(avg[i]);
		}//for

		
		// 출력하기
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(hak[i]);  //\t하면 옆으로 계속 가니깐 빼기!
		}

	}
}
