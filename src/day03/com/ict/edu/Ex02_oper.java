package day03.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		// 증감연산자 : 해당 변수의 값을 1씩 증가나 감소를 시킨다.
		// ++변수 : 현재 변수값을 먼저 1증가하고 나머지를 실행 (우선 순위가 가장 높다)
		// 변수++ : 현재 변수값으로 실행 후 나중에 변수값을 1증가
		int su1 = 10;
		int su2 = 10;
		
		System.out.println(++su1);//현 시점에서 먼저 증가시키고(11) 다른 일을 함.
		System.out.println(su2++);//현재 값 10으로 다 하고 세미콜론 만나서 끝나고 다음 줄에서 증가
		
		System.out.println(su1);
		System.out.println(su2);
		
		char c1 = 'b';
		char c2 = 'B';
		
		System.out.println(++c1);
		System.out.println(c2++);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
