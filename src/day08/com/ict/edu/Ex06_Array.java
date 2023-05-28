package day08.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		// 학급 인원 수 받아서 그만큼 돌리기

		Scanner scan = new Scanner(System.in);

		// 정보를 배열에 넣기 위해 배열을 미리 만들기 위해 인원 수를 물어본다.
		System.out.print("학생 수를 입력하세요>>");
		int su = scan.nextInt();

		// 미리 배열을 만든다.
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng = new int[su];
		int[] math = new int[su];
		int[] sum = new int[su];
		double[] avg = new double[su];
		String[] hak = new String[su];
		int[] rank = new int[su]; // 몇 명인지 모르기 때문에 1, 1, 1, 집어 넣을 수 없음

		for (int i = 0; i < su; i++) {
			System.out.println("이름 : ");
			name[i] = scan.next();

			System.out.println("국어 점수 : ");
			kor[i] = scan.nextInt();

			System.out.println("영어 점수 :");
			eng[i] = scan.nextInt();

			System.out.println("수학 점수 :");
			math[i] = scan.nextInt();

			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;

			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}

			rank[i] = 1; // 돌 때마다 1이 들어 감.
		}

		// 순위 (순위는 무조건 따로 해야함. 위에서 같이하면 안됨)
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (i == j)
					continue;
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < su; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}

	}// main
}// class
