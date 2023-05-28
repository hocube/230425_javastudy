package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Ex04_get_set[] arr = new Ex04_get_set[5];

		for (int i = 0; i < arr.length; i++) {
			
			Ex04_get_set person = new Ex04_get_set();

			System.out.print("이름: ");
			person.setName(scan.next()); 

			System.out.print("국어: ");
			person.setKor(scan.nextInt());

			System.out.print("영어: ");
			person.setEng(scan.nextInt());

			System.out.print("수학: ");
			person.setMath(scan.nextInt());

			person.setSum(person.getKor() + person.getEng() + person.getMath());
			person.setAvg((int)(person.getSum() / 3.0 * 10) / 10.0); // 평균

			// 학점
			if (person.getAvg() >= 90) {
				person.setHak("A학점");
			} else if (person.getAvg() >= 80) {
				person.setHak("B학점");
			} else if (person.getAvg() >= 70) {
				person.setHak("C학점");
			} else {
				person.setHak("F학점");
			}

			// 순위
			person.setRank(1);

			arr[i] = person; // 5번 만들어진 person을 arr배열의 각 방에 들어가도록.

		} // 이제 값은 다 들어갔음.

		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].getSum() < arr[j].getSum()) { // 클래스 배열은 .이름 으로 출력해야 함.
					arr[i].setRank(arr[i].getRank()+1);
				}

			}
		}

		// 정렬
		Ex04_get_set tmp = new Ex04_get_set(); // 클래스 단위로 저장되고 있기 때문에 임시 변수도 클래스 단위로
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}

	}// main
}// class
