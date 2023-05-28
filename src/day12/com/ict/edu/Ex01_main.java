package day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_main {
	public static void main(String[] args) {

		Ex01_method coffee = new Ex01_method();
		coffee.name = "커피 음료";
		coffee.price = 1000;
		// coffee라는게 생기고 그 안에 Ex01_method 클래스가 생기고
		// 그 안에 coffee.name = "커피 음료"; coffee.price = 1000;가 들어감

		Ex01_method ion = new Ex01_method();
		ion.name = "이온 음료";
		ion.price = 1500;
		// ion이라게 생기고 그 안에 Ex01_method 클래스가 생기고
		// 그 안에 ion.name = "이온 음료"; ion.price = 1500;가 들어감

		Ex01_method cola = new Ex01_method();
		cola.name = "탄산 음료";
		cola.price = 1200;

		Ex01_method juice = new Ex01_method();
		juice.name = "과일 음료";
		juice.price = 1800;

		// 이제 arr 이라는 방 4개짜리 배열을 만들어서 한 개씩 방 안에 넣어준다.
		// Ex01_method 클래스의 자료형을 가진!
		// 안에 구조가 같은(name, price가 있는) Ex12_method가 있어도 걔는 못 들어감.
		// 클래스 이름이 다르기 때문에! 꼭 Ex01_method만 들어갈 수 있음.

		/*
		 * Ex01_method arr = new Ex01_method(); arr[0] = coffee; arr[1] = ion; arr[2] =
		 * cola; arr[3] = juice;
		 */
		// 너무 길어! 한 줄로 할 수 있다!

		Ex01_method[] arr = { coffee, ion, cola, juice };

		
		// 스캐너로 금액 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>");
		int input = scan.nextInt(); // 돈 입력 받기
		
		
		// 음료들의 최소 금액을 구하자 (오름차순 해서 맨 처음것이 최소값, 맨 끝이 최대값)
		// 음료들보다 더 적은 돈을 넣으면 사먹을 수 없으니 
		if(input < 1000) {
			System.out.println("금액이 부족합니다");
		    System.out.println("잔돈 : " + input);  //들어온 값 그대로
		}else {
			System.out.println("커피\t이온\t탄산\t과일");
			
			// 입력금액과 각 음료수의 각 가격을 비교
			// 살 수 있는거 O,X로 표시
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].price <= input) { //넣은 돈이 가격보다 같거나 클수 있고
					System.out.print("O\t");
					//System.out.print(arr[i].name + "\t"); 
					//이렇게 쓰면 입력한 돈으로 살 수 있는 것만 뜸.
				}else {
					System.out.print("X\t");
				}
			}
			System.err.println();
			System.out.print("선택하세요 >> ");
			String drink = scan.next();    //번호를 받을 수도 있고, 글자를 받을 수도 있다.
			int output = 0;   //나가는 잔돈
			switch (drink) {
			case "커피": output = input - arr[0].price ; break;
			case "이온": output = input - arr[1].price ; break;
			case "탄산": output = input - arr[2].price ; break;
			case "과일": output = input - arr[3].price ; break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				output = input;
			}
			System.out.println("잔돈: " + output);
		}

	}// main
}// class
