package day12.com.ict.edu;

import java.util.Scanner;

public class Ex10_vm01_main {
public static void main(String[] args) {
	Ex01_method coffee = new Ex01_method();
	coffee.name = "커피";
	coffee.price = 1000;

	Ex01_method ion = new Ex01_method();
	ion.name = "이온";
	ion.price = 1500;

	Ex01_method cola = new Ex01_method();
	cola.name = "탄산";
	cola.price = 1200;

	Ex01_method juice = new Ex01_method();
	juice.name = "과일";
	juice.price = 1800;

	Ex01_method charge = new Ex01_method();
	charge.name = "잔돈반환";
	charge.price = 0;

	/*
	 * Ex01_method[] arr = new Ex01_method[4]; arr[0] = coffee; arr[1] = ion; arr[2]
	 * = cola; arr[3] = juice;
	 */
	/*
	 * 자판기 코드에서 입금액과 판매액 중에 입금액이 작으면 무조건 계산하지 않고
	 *  입금액 출력해야 된다. 잔돈이 판매액보다 크면 다시 구매할 수있는 선택 화면이 나와 야 한다.
	 *  잔돈이 판매액보다 작으면 잔돈 반환 메뉴에 반환메뉴를 추가 해서 입금 후
	 *  사지 않아도 될 수 있도록한다.
	 */

	Ex01_method[] arr = { coffee, ion, cola, juice, charge };
	Scanner scan = new Scanner(System.in);
	System.out.print("금액을 투입하세요 >>> ");
	int input = scan.nextInt();

	// 음료들의 최소금액을 구하자.(오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
	if (input < 1000) {
		System.out.println("금액이 부족합니다.");
		System.out.println("잔돈: " + input);
	} else {
		int output = 0;
		
		esc:
		while (true) {
			System.out.println("커피\t이온\t탄산\t과일\t잔돈반환");
			// 입력금액과 각 음료수의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].price <= input) {
					System.out.print("O\t");
				} else {
					System.out.print("X\t");
				}
			}
			System.out.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next();

			switch (drink) {
			case "커피":
				if (input >= 1000) {
					output = input - arr[0].price;
				} else {
					System.out.println("금액이 부족합니다");
					System.out.println("잔돈: " + input);
				}
				break;
			case "이온":
				if (input >= 1500) {
					output = input - arr[1].price;
				} else {
					System.out.println("금액이 부족합니다");
					System.out.println("잔돈: " + input);
				}
				break;
			case "탄산":
				if (input >= 1200) {
					output = input - arr[2].price;
				} else {
					System.out.println("금액이 부족합니다");
					System.out.println("잔돈: " + input);
				}
				break;
			case "과일":
				if (input >= 1800) {
					output = input - arr[3].price;
				} else {
					System.out.println("금액이 부족합니다");
					System.out.println("잔돈: " + input);
				}
				break;
			case "잔돈반환":
				output = input;
				break esc;
			}
			
			input = output;

			if (output < 1000) {
				System.out.println("잔돈: "+ output);
				break;
			}
			
		
		}
		System.out.println("잔돈은"+output);
	}
}
}
