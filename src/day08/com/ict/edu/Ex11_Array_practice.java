package day08.com.ict.edu;

import java.util.Iterator;

public class Ex11_Array_practice {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		//번호, 총점, 평균, 학점, 순위 
		int[] p1 = { 1, 270, 90, 'A', 1 };
		int[] p2 = { 2, 210, 70, 'C', 1 };
		int[] p3 = { 3, 180, 60, 'F', 1 };
		int[] p4 = { 4, 300, 100, 'A', 1 };
		int[] p5 = { 5, 285, 95, 'A', 1 };
		
		arr[0] = p1; //{ 1, 270, 90, 'A', 1 }
		arr[1] = p2; 
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
			
		
		// 순위를 구하자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				if (arr[i][1] < arr[j][1]) {
					arr[i][4]++;					
				}
			}
		}

		// 순위로 오름 정렬
		// 자리 변경위한 변수 선언
		int[] temp = new int [5];
		//int [] temp = {0, 0, 0, 0, 0} 이렇게도 가능.
		
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i][4] > arr[j][4]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// 출력 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)(arr [i][j]) + "\t");
				}else {
					System.out.print(arr [i][j] + "\t");
				}
			}
		System.out.println();
		}
	

		/*
		 * 4, 300, 100, 'A', 1 5, 285, 95, 'A', 1 1, 270, 90, 'A', 1 2, 210, 70, 'C', 1
		 * 3, 180, 60, 'F', 1
		 */

	}
}