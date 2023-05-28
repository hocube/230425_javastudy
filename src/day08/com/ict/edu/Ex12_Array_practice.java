package day08.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array_practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 학생 수(스캐너) 받기
		System.out.println("학생 수를 입력하세요");
		int su = scan.nextInt();
		double[][] arr = new double[su][8];
		for (int i = 0; i < arr.length; i++) {
			double[] p = new double[8];

			// 키보드로(스캐너) 번호, 국어, 영어, 수학 받고
			System.out.print("번호");
			p[0] = scan.nextInt();

			System.out.print("국어 점수");
			p[1] = scan.nextInt();

			System.out.print("영어 점수");
			p[2] = scan.nextInt();

			System.out.print("수학 점수");
			p[3] = scan.nextInt();

			// 총점, 평균, 학점, 순위(초기값 지정)
			p[4] = p[1] + p[2] + p[3]; // 총점
			p[5] = (int) (p[4] / 3.0 * 10) / 10.0; // 평균

			if (p[5] >= 90) {
				p[6] = 'A';
			} else if (p[5] >= 80) {
				p[6] = 'B';
			} else if (p[5] >= 70) {
				p[6] = 'C';
			} else {
				p[6] = 'D';
			}

			p[7] = 1;
		}

		// 순위 구하기

		// 순위로 오름차순 정렬

		// 출력

	}// main
}// class
