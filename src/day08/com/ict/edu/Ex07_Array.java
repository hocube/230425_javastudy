package day08.com.ict.edu;

import java.util.Arrays;

public class Ex07_Array {
	public static void main(String[] args) {

		// 가장 큰 값과 가장 작은 값 구하기
		int[] su = { 90, 87, -20, 120, 67, 23, 40, 53 };

		// 오름 차순
		Arrays.sort(su);

		System.out.println("가장 작은 값: " + su[0]); // 정렬하면 맨 앞이 가장 작은 값
		System.out.println("가장 큰 값: " + su[su.length - 1]); // 정렬하면 맨 뒤가 가장 큰 값
															// 길이 값과 인덱스 값은 1 차이 나기 때문에 -1

	}// main
}// class
