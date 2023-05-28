package Homework;

	import java.util.Random;
	import java.util.Scanner;

	public class Game01 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Random ran = new Random();
			int win = 0;
			int totalgame = 0;
			
			esc: while (true) {
				System.out.println("가위:0, 바위:1, 보:2");
				System.out.print("숫자 입력: ");
				int num = scan.nextInt();
				if (!(num == 0 || num == 1 || num == 2)) {
					System.out.println();
					System.out.println("다시 입력하세요.");
					continue;
				}
				int com = (ran.nextInt(3));
				System.out.println();
				System.out.println("사용자: " + num + ", " + "컴퓨터: " + com);

				if (num == 0) {
					if (com == 0) {
						System.out.println("무승부!");
					} else if (com == 1) {
						System.out.println("졌습니다!");
					} else if (com == 2) {
						System.out.println("이겼습니다!");
						win++;
					}
				} else if (num == 1) {
					if (com == 0) {
						System.out.println("이겼습니다!");
						win++;
					} else if (com == 1) {
						System.out.println("무승부!");
					} else if (com == 2) {
						System.out.println("졌습니다!");
					}
				} else if (num == 2) {
					if (com == 0) {
						System.out.println("졌습니다!");
					} else if (com == 1) {
						System.out.println("이겼습니다!");
						win++;
					} else if (com == 2) {
						System.out.println("무승부!");
					}
				} else {
					System.out.println();
					System.out.println("다시 입력하세요.");
					continue;
				}
				
				totalgame++;
				
				while (true) {
					System.out.println();
					System.out.print("계속 할까요?(y/n)");
					String str = scan.next();
					if (str.equalsIgnoreCase("y")) {
						break;
					} else if (str.equalsIgnoreCase("n")) {
						double per = (win / (totalgame*1.0)) * 100;
						System.out.println("게임 횟수: " + totalgame);
						System.out.println("이긴 횟수: " + win);
						System.out.println("승률: " + (int)(per * 10)/10.0 + "%");
						return;
					} else {
						System.out.println("다시 입력하세요");
					}
				}
			}
		}// main
	}// class
