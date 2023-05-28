package day08.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {
public static void main(String[] args) {
	//내가 풀어본 거
	
	Scanner scan = new Scanner(System.in);
	
	//학생 수(스캐너) 받기
	System.out.print("학생 수를 입력하세요 : ");
	int su = scan.nextInt();
	
	int[][] arr = new int[su][8];
	
	
	//키보드로(스캐너) 번호, 국어, 영어, 수학 받고
	for (int i = 0; i < arr.length; i++) {
		System.out.println("번호 : ");
		arr[i][0] = scan.nextInt();
		
		System.out.println("국어 점수 : ");
		arr[i][1] = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		arr[i][2] = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		arr[i][3] = scan.nextInt();
		
		//총점, 평균, 학점, 순위(초기값 지정)
		arr[i][4] = arr[i][1] + arr[i][2] + arr[i][3];  //총점
		arr[i][5] = (int)((arr[i][4]/3.0*10)/10.0);   //평균
		
		//학점 6
		if (arr[i][5] >= 90) {
			arr[i][6] = 'A';
		} else if (arr[i][5] >= 80) {
			arr[i][6] = 'B';
		} else if (arr[i][5] >= 70) {
			arr[i][6] = 'C';
		} else {
			arr[i][6] = 'F';
		}
		//순위 7
		arr[i][7] = 1;
	}
	
	//순위 구하기
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(i == j) continue;
			if (arr[i][4] < arr[j][4] ) {
				arr[i][7]++;
			}
		}
		System.out.print(arr[i][7]);
		System.out.println();
	}
	
	//순위로 오름차순 정렬
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i][7] > arr[j][7]) {
				int[] temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	//출력
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if (j == 6) {
				System.out.print((char) arr[i][j]);

			} else {
				System.out.print(arr[i][j]);

			}
			if (j < arr[i].length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}//main
}//class
