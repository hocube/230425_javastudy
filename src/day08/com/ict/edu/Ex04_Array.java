package day08.com.ict.edu;

public class Ex04_Array {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기값을 지정한다.
		// 2. 모든 사람과 비교해야 된다. (자기 자신은 제외)
		// 3. 나(i)보다 남(j)이 크면 내 순위를 증가시킨다.

		int[] su = { 90, 80, 70, 95, 90, 85, 75 };
		int[] rank = { 1, 1, 1, 1, 1, 1, 1 }; // 처음엔 다 1등으로 초기값

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				if (su[i] == su[j])
					continue; // 나 자신은 비교 안하니깐 제외//continue하면 밑에꺼 실행 X
				if (su[i] < su[j]) { // 나보다 남이 크면 rank를 ++ 해주세요.
					rank[i]++;
				}
			}
		}

		for (int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
		System.out.println();
		System.out.println("====================");

	}// main
}// class
