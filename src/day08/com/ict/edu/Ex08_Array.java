package day08.com.ict.edu;

import java.util.Iterator;

public class Ex08_Array {
public static void main(String[] args) {
	// 다차원 배열 : 1차원 배열이 여러개 모인것
	// 다차원 배열의 종류 : 기본 자료형과 참조 자료형
	//                고정길이 배열, 가변길이 배열(다차원 배열에만 존재)
	
	// 고정 길이 배열
	// 1. 선언 : 자료형[][] 이름;
	int su[][];
	
	// 2. 생성 : 이름 = new 자료형[1차원 배열의 수][1차원 배열 안에 존재하는 배열의 크기]
	su = new int[2][3];     // 1차원 배열이 2개이고 각 각 3개의 배열을 가지고 있다.
	
	// 3. 데이터 저장
	su[0][0] = 10;
	su[0][1] = 20;
	su[0][2] = 30;
	
	su[1][0] = 100;
	su[1][1] = 200;
	su[1][2] = 300;
	
	System.out.println(su);     //주소만 가지고 있음
	System.out.println(su[0]);  //주소만 가지고 있음
	System.out.println(su[1]);  //주소만 가지고 있음
	System.out.println("======================");
	
	// 다차원 출력
	// 밖은 2번 돌고, 안쪽은 3번 돈다.
	// new int[2][3]과 같다.
	System.out.println(su[0][0]);
	System.out.println(su[0][1]);
	System.out.println(su[0][2]);
	
	System.out.println(su[1][0]);
	System.out.println(su[1][1]);
	System.out.println(su[1][2]);
	System.out.println("======================");

	for (int i = 0; i < su.length; i++) {
		for (int j = 0; j < su[i].length; j++) {  //su밑에 있는 애들이 몇개인지 보는게 su[i]
			System.out.println(su[i][j]);
		}
	}





}
}
