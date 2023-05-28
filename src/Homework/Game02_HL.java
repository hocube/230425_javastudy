package Homework;

import java.util.Random;
import java.util.Scanner;

public class Game02_HL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int win = 0;
		int totalgame = 0;

		while (true) {
			System.out.println("높고, 낮음 게임을 시작합니다.");
			System.out.print("높음(0), 낮음(1) 숫자 입력: ");
			int user = scan.nextInt();
			if (!(user == 0 || user == 1)) {
				System.out.println();
				System.out.println("다시 입력하세요");
				continue;
			}

			int com = (ran.nextInt(2));
			System.out.println("컴퓨터: " + com);
			System.out.println();

			if (com == user) {
				System.out.println("정답 입니다.");
				win++;
			} else {
				System.out.println("틀렸습니다.");
			}

			totalgame++;

			while (true) {
				System.out.println();
				System.out.print("계속 할까요?(y/n)");
				String str = scan.next();
				System.out.println();
				if (str.equalsIgnoreCase("y")) {
					break;
				} else if (str.equalsIgnoreCase("n")) {
					double per = (win / (totalgame * 1.0)) * 100;
					System.out.println("게임 횟수: " + totalgame);
					System.out.println("이긴 횟수: " + win);
					System.out.println("승률: " + (int) (per * 10) / 10.0 + "%");
					return;
				} else {
					System.out.println("다시 입력하세요.");
				}
			}
		}

	}//main
}//class