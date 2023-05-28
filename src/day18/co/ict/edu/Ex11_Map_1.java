package day18.co.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		// keySet으로 키 관리
		Set<String> keys = map.keySet();

		esc: while (true) {
			System.out.print("나라 입력: ");
			String str = scan.next();
			if (keys.contains(str)) { // 있는 나리인지 없는 나라인지 확인
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다.");
			} else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			while (true) {
				System.out.print("계속 할 까요? (y/n)");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					break;
				}
			}
		}
	}
}
