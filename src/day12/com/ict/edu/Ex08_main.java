package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_Constructor coffee = new Ex08_Constructor("커피음료", 1000);
		Ex08_Constructor ion = new Ex08_Constructor("이온음료", 1500);
		Ex08_Constructor cola = new Ex08_Constructor("탄산음료", 1200);
		Ex08_Constructor juice = new Ex08_Constructor("과일음료", 1800);

		Ex08_Constructor[] arr = { coffee, ion, cola, juice };

		// 스캐너로 금액 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>");
		int input = scan.nextInt(); // 돈 입력 받기

		// 음료들의 최소 금액을 구하자 (오름차순 해서 맨 처음것이 최소값, 맨 끝이 최대값)
		// 음료들보다 더 적은 돈을 넣으면 사먹을 수 없으니
		if (input < 1000) {
			System.out.println("금액이 부족합니다");
			System.out.println("잔돈 : " + input); // 들어온 값 그대로
		} else {
			System.out.println("커피\t이온\t탄산\t과일");

			// 입력금액과 각 음료수의 각 가격을 비교
			// 살 수 있는거 O,X로 표시
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) { // 얻어내서 하는거니깐 get!Price사용
					System.out.print("O\t");
				} else {
					System.out.print("X\t");
				}
			}
			System.err.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next(); // 번호를 받을 수도 있고, 글자를 받을 수도 있다.
			int output = 0; // 나가는 잔돈
			switch (drink) {
			case "커피":
				output = input - arr[0].getPrice();
				break;
			case "이온":
				output = input - arr[1].getPrice();
				break;
			case "탄산":
				output = input - arr[2].getPrice();
				break;
			case "과일":
				output = input - arr[3].getPrice();
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				output = input;
			}
			System.out.println("잔돈: " + output);
		}
	}
}
