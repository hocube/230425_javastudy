package day08.com.ict.edu;

import java.util.Arrays;

public class Ex11_Array {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		// 번호, 총점, 평균, 학점, 순위
		int[] p1 = { 1, 270, 90, 'A', 1 }; // 1차원 배열
		int[] p2 = { 2, 210, 70, 'C', 1 }; // 1차원 배열
		int[] p3 = { 3, 180, 60, 'F', 1 }; // 1차원 배열
		int[] p4 = { 4, 300, 100, 'A', 1 }; // 1차원 배열
		int[] p5 = { 5, 285, 95, 'A', 1 }; // 1차원 배열

		// 1차원 배열을 다차원배열로 넣자
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;

		// 순위를 구하자
		// arr[0][1]
		// arr[1][1]
		// arr[2][1]
		// arr[3][1]
		// arr[4][1]을 끄집어 내서 비교
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue; // 자기 자신 제외
				if (arr[i][1] < arr[j][1]) { // [0][1]번의 총점과
					arr[i][4]++; // [1][1],[2][1],[3][1],[4]의 총점을 비교
				}
			}
		}
		// 자리변경을 위한 임시 변수 필요
		// 순위로 오름차순 정렬
		int[] temp = new int[5];
		// int[] temp = {0, 0, 0, 0, 0} 도 가능
		// 빈방에 p1 = { 1, 270, 90, 'A', 1 }; 이러넉 5개가 들어가야하기 때문에 배열로 설정.

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					temp = arr[i]; // i 기준. 내 정보를 빈 방에 넣고
					arr[i] = arr[j]; // 남의 정보를 나에게 넣기
					arr[j] = temp; //
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 3) { // 3일 땐 char로 바꿔서 학점 나오도록.
					System.out.print((char) (arr[i][j]) + "\t");
				} else {
					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}

	}// main
}// class