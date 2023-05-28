package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		/* break와 continue
		   break : 현재 위치의 블록을 탈출하는 예약어(명령어)
		   continue : continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		   보통 if문과 함께 사용한다.
		   break는 for문과 while문에 모두 사용, continue는 for문에 사용
		 */
		
		//1부터 10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//1부터 10까지 출력. 6일 때 break 사용/ if문이 위에 있을 때/ 5까지만 출력 
		for (int i = 1; i < 11; i++) {
			if(i == 6)  break;
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//1부터 10까지 출력. 6일 때 break 사용/ if문이 아래에 있을 때
		//print가 밑에 있기 때문에 6까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6)  break;
		}
		System.out.println();
		System.out.println("===================================");

		
		//1부터 10까지 출력. 6일 때 continue 사용
		//6일 때는 화면 출력하지 않고 바로 증감식으로 가기 때문에 출력 x
		for (int i = 1; i < 11; i++) {
			if(i == 6)  continue;
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//1부터 10까지 출력. 6일 때 continue 사용
		//print가 위에 있으니깐 이미 6을 찍었음. 6만난 후 다시 continue만났기 때문에 증감식으로 돌아감.
		//이럴 경우에는 6을 빼고 싶었으나 빼지 못했음.
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if(i == 6)  continue;
		}
		System.out.println();
		System.out.println("===================================");
		
		
		//0 ~ 10까지 홀수만 출력. (평소 사용하던 일반적인 if문) // 평소 사용하던 if문 
		for (int i = 0; i < 11; i++) {
			if(i %2 == 1) {
			System.out.println(i);
			}
		}System.out.println();

		
		//0 ~ 10까지 홀수만 출력. (continue 이용) // continue 사용 if문
		//i %2 == 0(짝수)를 넣은 이유는 짝수일 때 출력 안하는거기 때문에.
		//continue는 continue 밑에껄 출력하지 않는다. 그렇기 때문에 짝수는 출력하지 않는다.
		//그럼 홀수만 출력된다.
		for (int i = 0; i < 11; i++) {
			if(i %2 == 0) continue;
				System.out.println(i);
				}
		
		
		
		
		
	}//main
}//class
