package Homework;

	import java.util.Random;
	import java.util.Scanner;

	public class Game03_baseball {
		public static void main(String[] args) {

			int strike = 0;
			int ball = 0;

			int user[] = new int[3]; // 사용자 입력 숫자 저장할 배열
			int com[] = new int[3];  // 컴퓨터 숫자 저장할 배열

			// 컴퓨터 랜덤 값 중복 방지
			Random ran = new Random();
			for (int i = 0; i < com.length; i++) {
				com[i] = ran.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}

			// 컴퓨터 랜덤 값
			// 이부분 주석
			System.out.println(com[0] + " " + com[1] + " " + com[2]);

			// 사용자한테 숫자 입력받기
			Scanner scan = new Scanner(System.in);
			int totalgame = 1;

			while (strike < 3) {
				strike = 0;
				ball = 0;
				for (int i = 0; i < user.length; i++) {
					System.out.println(i + 1 + "번째 숫자(0~9): ");
					user[i] = scan.nextInt();

					// 0 ~ 9 사이 숫자가 아닐 때
					while (user[i] >= 10 || user[i] < 0) {
						System.out.println("0 ~ 9 사이의 숫자를 입력하세요");
						System.out.println((i + 1) + "번째 숫자(0~9): ");
						user[i] = scan.nextInt();

					}
				}

				// 입력 값, 컴퓨터 값 비교
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
							if (i == j) {
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				//totalgame >= 10만하면 10회 이후 정답 맞춰도 계속 할까요가 나옴.
				//10회 이상이고, 스트라이크가 3번 미만일 때라고 해야함.
				if (totalgame >= 10 && strike < 3) {
					while (true) {
						System.out.println("계속 할 까요?(y:계속/n:포기)");
						String str = scan.next();
						if (str.equalsIgnoreCase("y")) {
							break;
						} else if (str.equalsIgnoreCase("n")) {
							return;
						} else {
							System.out.println("다시 입력하세요");
						}
					}
				}

				if (strike == 3) {
					System.out.println("정답입니다. " + totalgame + "번째 만에 성공하셨습니다");
					break;
				} else if (strike == 0 && ball == 0) {
					System.out.println("아웃!");
				} else {
					System.out.println(strike + " strike," + " " + ball + " ball");
				}
				totalgame++;
			}

		}// main
	}// class
