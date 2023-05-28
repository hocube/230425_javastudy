package day08.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {
	public static void main(String[] args) {
		// 정렬하기
		int[] su = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };

		// 자리 변경을 위한 임시변수 필요 (임시 방)
		int tmp = 0;

		for (int i = 0; i < su.length - 1; i++) { // 비교하는 애, 끝까지 가지 않고 뒤에서 앞자리 까지만 가기 때문에 -1
			for (int j = i + 1; j < su.length; j++) { // 비교 대상, j는 끝까지 가지만 두번째 자리 부터 시작하기 때문에 i+1
				// 비교하기 (오름차순 (i>j), 내림 차순 (i<j)) 때 자리 변경하자.
				if (su[i] > su[j]) {
					tmp = su[i]; // i를 임시 방에 넣으세요.
					su[i] = su[j]; // j값 i로 저장
					su[j] = tmp; // j에 임시 방 값을 넣어주세요.
				}
			}
		}

		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		System.out.println("=======================");

		// Arrays 클래스는 배열, 복사, 정렬, List로 전환 등
		// 배열에 관련된 기능을 제공하는 클래스
		// 오름차순 정렬은 sort()로 가능
		// 내림차순은 없음

		// sort 사용 (오름차순)
		int[] su2 = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };
		Arrays.sort(su2);
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println();
		System.out.println("=======================");

		// 내림차순
		Integer[] su3 = { 13, 14, 19, 18, 12, 11, 17, 20, 15, 16 };
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println();
		System.out.println("=======================");

	}// main
}// class
