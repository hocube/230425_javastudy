package day18.co.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Ex11_Map {
//map 이용 //키  나라 //value 수도//
//키를 집어넣으면 답이 나오도록
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장 시키고
		// 원하는 나라가 key 값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		String su = "";
		int su1 = 0;

		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("나라를 입력하세요");
			su = scan.next(); 
			System.out.println("입력하신 국가의 수도는 " + map.get(su) + "입니다.");
			System.out.println("계속할까요? 1.y / 2.n");
			su1 = scan.nextInt();
			if (su1 == 2) break;

		}

	}
}
