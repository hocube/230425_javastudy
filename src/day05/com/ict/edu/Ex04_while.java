package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		// while문 : for문과 같은 반복문
		/* 형식1)
		 *    초기식;
		 *    while(조건식) {
		 *      조건식이 참이면 실행할 문장;
		 *      조건식이 참이면 실행할 문장;
		 *      증감식;
		 *     }
		 *     while문의 끝을 만나면 조건식으로간다.
		 *     for문의 끝을 만나면 증감식으로 간다.
		 */
		/* 형식2)
		 *    초기식;
		 *    while(true) {
		 *      if(빠져나갈 조건) {
		 *        break;
		 *      }
		 *      조건식이 참이면 실행할 문장;
		 *      조건식이 참이면 실행할 문장;
		 *      증감식;
		 *     }
		 *     while문의 끝을 만나면 조건식으로간다.
		 *     for문의 끝을 만나면 증감식으로 간다.
		 */
		
		// 형식1) 1 ~ 10까지 출력
		int i = 1;
		while (i < 11) {    //실행하는 기준이니깐 11보다 작아야 함.
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("========================");
		
		
		// 형식2) 1 ~ 10까지 출력
		i = 1;
		while (true) {
			if(i >= 11)  break;   //빠져나가는 기준, 11이상이면 무조건 멈춰야 하니깐 >= 를 씀
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("========================");
		
		
		// while if 0 ~ 10까지 짝수 출력
		i = 0;
		while (i < 11) {
			if(i %2 ==0) {
				System.out.println("i = " + i);
			}
			i++;
		}
		System.out.println("========================");
		
		
		// 구구단 중 7단 출력
		i = 1;
		while (i < 10) {
			i++;
			System.out.println("7 * " + i + " = " + (7*i));
		}
		System.out.println("========================");

	
		// 1 ~ 10 누적합 (합계 구하기)
		i= 1;
		int sum = 0;
		
		while (i < 11) {
			sum = sum + i;
			i++;
		}System.out.println("누적합: " + sum);
		System.out.println("========================");
		
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("========================");
		
		
		//4의 배수로해서 하나씩 찍을 수도 있음.
		//0를 하나씩 쓴다면 총 16개를 써야함.
		i = 1;
		while (i < 17) {
			System.out.print("0 ");    //print이기 때문에 이 모양이 옆으로 16번 찍힘.
			if(i %4 == 0) {
				System.out.println( );
			}
			i++;
		}
		System.out.println("========================");
		
	
	}

}
