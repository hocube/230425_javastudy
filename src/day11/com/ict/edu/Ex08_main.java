package day11.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위를 기준으로 오름차순 정렬해서 출력 하자

		Scanner scan = new Scanner(System.in);

		// Ex08_method로 만들어진 객체만 저장하는 배열=> 객체형 배열 = 참조자료형 배열
		// int[] k1 = new int []; 여기서 자료형 이름 대신 클래스 이름을 쓰면 됨.
		Ex08_method[] arr = new Ex08_method[5];

		for (int i = 0; i < arr.length; i++) {
			// 객체 생성
			// 이번엔 안에다 만들어야 함. 새로운 값이 나올 때마다 저장해야 하기 때문에
			Ex08_method person = new Ex08_method();
			// for문 돌때마다 person이 5개 만들어지지만 모두 다른 것임.
			// person 5개에 각가 다른 내용이 저장됨.

			System.out.print("이름: ");
			person.name = scan.next(); // Ex08_method 클래스에 있는 변수명에 직접 집어 넣기

			System.out.print("국어: ");
			person.kor = scan.nextInt();

			System.out.print("영어: ");
			person.eng = scan.nextInt();

			System.out.print("수학: ");
			person.math = scan.nextInt();

			person.sum = person.kor + person.eng + person.math; // 총점
			person.avg = (int) (person.sum / 3.0 * 10) / 10.0; // 평균

			// 학점
			if (person.avg >= 90) {
				person.hak = "A학점";
			} else if (person.avg >= 80) {
				person.hak = "B학점";
			} else if (person.avg >= 70) {
				person.hak = "C학점";
			} else {
				person.hak = "F학점";
			}

			// 순위
			person.rank = 1;

			arr[i] = person; // 5번 만들어진 person을 arr배열의 각 방에 들어가도록.

		} // 이제 값은 다 들어갔음.

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].sum < arr[j].sum) { // 클래스 배열은 .이름 으로 출력해야 함.
					arr[i].rank++;
				}

			}
		}

		// 정렬
		Ex08_method tmp = new Ex08_method(); //클래스 단위로 저장되고 있기 때문에 임시 변수도 클래스 단위로
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].rank > arr[j].rank) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name + "\t");
			System.out.print(arr[i].sum + "\t");
			System.out.print(arr[i].avg + "\t");
			System.out.print(arr[i].hak + "\t");
			System.out.println(arr[i].rank);
		}

	}// main
}// class