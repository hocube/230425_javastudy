package day12.com.ict.edu;

import java.util.Scanner;

public class Ex10_vm_main {
	public static void main(String[] args) {

		Ex10_vm coffee = new Ex10_vm("커피음료", 1000);
		Ex10_vm ion = new Ex10_vm("이온음료", 1500);
		Ex10_vm cola = new Ex10_vm("탄산음료", 1200);
		Ex10_vm juice = new Ex10_vm("과일음료", 1800);

		Ex10_vm[] arr = { coffee, ion, cola, juice };

		// 스캐너로 금액 받기
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("금액을 투입하세요 >>");
			int input = scan.nextInt(); // 돈 입력 받기

			System.out.println("커피\t이온\t탄산\t과일\t반환");

			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("O\t");
				} else {
					System.out.println("X\t");
				}
			}
			System.out.println("O");
			System.out.println("선택하세요 >>");
			String drink = scan.next();
			int output = 0;

			switch (drink) {
			case "커피":
				if (input >= arr[0].getPrice()) {
					output = input - arr[0].getPrice();
					System.out.println("남은돈: " + output);
				} else {
					System.out.println("돈이 모자릅니다.");
					continue;
				}
				break;
			case "이온":
				if (input >= arr[1].getPrice()) {
					output = input - arr[1].getPrice();
					System.out.println("남은돈: " + output);
				} else {
					System.out.println("돈이 모자릅니다.");
					continue;
				}
				break;	
			case "탄산":
				if (input >= arr[2].getPrice()) {
					output = input - arr[2].getPrice();
					System.out.println("남은돈: " + output);
				} else {
					System.out.println("돈이 모자릅니다.");
					continue;
				}
				break;
			case "과일":
				if (input >= arr[3].getPrice()) {
					output = input - arr[3].getPrice();
					System.out.println("남은돈: " + output);
				} else {
					System.out.println("돈이 모자릅니다.");
					continue;
				}
				break;
			case "반환":
					System.out.println("잔돈: " + input);
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				continue;
				}
			System.out.println("잔돈: " + output);
			
			if (input < arr[0].getPrice()) {
				System.out.println("잔돈이 부족합니다. 종료합니다");
			}
		}

	}// main
}// class
