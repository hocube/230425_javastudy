package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {
		// 논리 연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		// 논리 연산자의 대상은 boolean형 (계산하려면 참,거짓이여야 하기 때문에. 숫자 들어오면 X)
		// 결과는 boolean형, 조건식에 사용됨.
		
		// AND = && = 논리곱 = 교집합
		// 주어진 조건들이 모두 true 일 때만 결과는 true
		// false가 있으면 결과는 false
		// false 이후는 연산하지 않는다.
		// **AND 조건을 이용하면 범위를 지정할 수 있다.
		// a >= 10 && a <= 20   -> a는 10부터 20까지의 범위를 지정한 것. 
		
		int su1 = 10;
		int su2 = 7;
		boolean result;
		result = (su1 >= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 >= 5);
		System.out.println(result);
		
		result = (su1 >= 7) && (su2 <= 5);
		System.out.println(result);
		
		result = (su1 <= 7) && (su2 <= 5);
		System.out.println(result);
		
		System.out.println("=========================");
		//         12    10      >  7        12      12    7 
		result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		
		System.out.println("========================="); 
		su1 = 10;
		su2 = 7;
		//         12    10          7 : 앞에가 거짓이라 뒤에꺼 계산 안하기 때문에 su2는 7이다.
		result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		//범위 지정
		int su3 = 34;
		// su3은 20 ~ 30 사이에 존재하는 값이다.
		result = su3>=20 && su3<=40;
		System.out.println(result);
		
		//char c1이 소문자이냐?
		char c1 = 'G';
	    result = c1>='a' && c1<='z';
	    System.out.println(result);
		
	}
}
