package day08.com.ict.edu;

public class Ex05_Array {
	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 85, 95, 75, 85, 95 };
		int[] math = { 100, 95, 90, 100, 100 };

		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		String[] hak = new String[name.length];
		int[] rank = { 1, 1, 1, 1, 1 };

//		sum[0] = kor[0] + eng[0] + math[0];
//		            .
//		            .
//		avg[0] = (int)(sum[0]/3.0 *10)/10.0;
//  		       	.
//		            .
//		if(avg[0] >= 90) {
//			hak[1] = "A학점";
//		}else if(avg[0] >= 80) {}
//				    .
//				    .

		// for문을 이용해서 반복 처리한다
		for (int i = 0; i < name.length; i++) {
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
			// 순위, 정렬 못 함
		}
		// 순위를 구하자 (sum으로 비교하자)
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
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i] + "\t"); // 지금은 다 1등으로 나옴.
		}

	}// main
}// class