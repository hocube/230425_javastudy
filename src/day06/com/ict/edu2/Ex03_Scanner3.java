package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*근무시간이 8시간까지는 시간당 9620원이고
		  8시간을 초과한 시간 만큼은 1.5배 지급한다.
		  근무시간을 입력받고, 얼마를 받아야하는지 계산하라
		  받는 정보 숫자 (if문)
		 */
		 System.out.print("근무시간: ");
		 int work = scan.nextInt();		 
		 int dan = 9620;
		 int pay = 0;
		 
		 	if(work > 8) {
		 	  pay =	(8 * dan) + (int)((work-8)*dan*1.5);
		 	}else {
		 	  pay =	work * dan;
		 	}
		 System.out.println("금액 : " + pay);
		 System.out.println("=========================");
		
		
		/*menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
          3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
          친구와 함께 2잔을 10000 내고 먹었다.
          선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
          (친구와 같은 음료을 먹어야 한다.)
          메뉴를 번호로 집어넣어야함.
          받는 정보 숫자
        */
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         int menu = scan.nextInt();
         String name = "";
         int dan2 = 0;
         int su = 2;
         int in = 10000;
         int total = 0;
         int vat = 0;
         pay = 0;
         
          if (menu == 1) {
        	 name = "카페모카";
			 dan2 = 3500;
		} else if (menu == 2) {
       	 	 name = "카페라떼";
			 dan2 = 4000;
		} else if (menu == 3) {
       	     name = "아메리카노";
			 dan2 = 3000;
		} else if (menu == 4) {
       	     name = "과일쥬스";
			 dan2 = 3500;
		}
		 
          total = dan2 * su;
          vat = (int)(total * 0.1);
          pay = in - (total + vat);
          
        System.out.println("잔돈 : " + pay);
		System.out.println("=========================");
		
		
		/* 나라를 입력하면 수도가 출력되게 하자
		   한국 => 서울,  중국 => 베이징,  일본 => 도쿄,  미국 => 워싱턴
		   이 외에는 데이터 없음 (swtich ~ case로 풀기)
		   받는 정보 문자
		 */
		System.out.print("나라 : ");
		String na = scan.next();
		String res ="";
		
		switch (na) {
		case "한국" : res = "서울";  break;
		case "중국" : res = "베이징";   break;
		case "일본" : res = "도쿄";   break;
		case "미국" : res = "워싱턴";   break;
		default: res = "데이터 없음"; break;
		}
		System.out.println(na + "의 수도는 : " + res + "입니다");
		System.out.println("=========================");
	
	}
}
