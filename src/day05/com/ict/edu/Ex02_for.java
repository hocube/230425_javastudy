package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		//for문 : 정해진 규칙에 따라서 실행문을 반복 처리한다.
		//형식) for(초기식; 조건식; 증감식){
		//         조건식이 참일 때 실행할 문장;
		//         조건식이 참일 때 실행할 문장;
		//         }
		// ** for문을 마나면 무조건 초기식으로 이동
		//    초기식은 조건식으로 이동
		//    조건식이 참이면 for문 실행, 거짓이면 for문 실행하지 않는다.
		//    for문의 끝을 만나면 무조건 증감식으로 간다.
		
		// {}(블록)에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(사용불가)
		
		
		// 안녕하세요를 열번 출력하기
		// i는 변수(계속 변하니깐)
		for (int i = 1; i < 11; i++) {
			 System.out.println(i + "= 안녕하세요");
		}
		System.out.println("==============================");
		
		
		// 0~10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
		}
		System.out.println();   //이거 안 하면 계속 옆에가서 붙음.
		
		
		// 0~10까지 짝수만 출력
		for (int i = 0; i < 11; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// 0~10까지 홀수만 출력
		for (int i = 1; i < 11; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		//0~10까지 구하고, 그 중 짝수만 골라서 출력
		for (int i = 0; i < 11; i++) {
			if(i %2 == 0) {  //홀수 구하고 싶으면 i %2 == 1로 바꾸면 됨.
				System.out.print(i+" ");				
			}
		}
		System.out.println();
		System.out.println("==============================");
		
		
		//구구단 중 7단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("7*" + i + "=" + (7*i));
		}
		System.out.println("==============================");
		
		
		//1~10 누적합 (합계 구하기)
		//이전 저장 변수 = 0    ex)sum=sum + i
		//(누적합 공식) 이전 저장 변수 : 이전 저장 변수 + 현재값;
		
		//이전 저장 변수 = 1    ex)sum=sum * i / 0으로 곱하면 다 0되기 때문에 1로.
		//(누적곱 공식) 이전 저장 변수 : 이전 저장 변수 * 현재값;
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println("누적합 : " + sum);
		
		
		//0~10까지 짝수의 누적합 : 30
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i %2 == 0) {   //홀수 구할 땐 i %2 == 1
				even = even + i; 
			} 
		}System.out.println("짝수의 누적 합: " + even);
		
		
		// 7! = 7*6*5*4*3*2*1
		//누적 곱 구하기
		int sum1 = 1;
		for (int i = 7; i > 0; i--) {  
			//for(int i = 1; i < 8; i++)  //이렇게 해도 됨.
			sum1 = sum1 * i;
		}
		System.out.println("7! = " + sum1);
		
		
		
		//<숙제> for문을 이용한 누적 합 구하기.
		//문제 : 1 + (-2) + 3 + (-4) + 5 + (-6) + 7 + (-8) + 9 + (-10)
		
		/* 1부터 10까지인데
		짝수일 때는 : -
		홀수 일 때, 짝수 일 때 각각 틀림
		if else 써야 함.
		*/
		
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 1; i < 11; i++) {
			 if (i %2 == 0) {
				sum2 = sum2 + i; 
			} else {
				sum3 = sum3 + i;
			}
		}System.out.println("누적합 : " + sum2+sum3);
	}

}
