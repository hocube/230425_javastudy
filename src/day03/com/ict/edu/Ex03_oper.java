package day03.com.ict.edu;

public class Ex03_oper {
	public static void main(String[] args) {
		//비교연산자 : >, <, >=, <=, ==(같다), !=(같지 않다=다르다)
		//비교연산자를 사용하는 자료형은 문자, 정수, 실수 (boolean은 아님. 결과만!)
		//연산 결과는 무조건 boolean형으로 나오므로 boolean으로 저장한다.
		
		int su1 = 90;
		int su2 = 80;
		
		boolean res = su1 >= su2; 
		//su1 su2를 비교했을 때 su1이 크거나 작다라는 내용을 res에 저장
		System.out.println(res);
		
		double su3 = 89.999;
		double su4 = 80.0;
		
		res = su1 >= su3;  //int 90과 double 89.999비교. 
		System.out.println(res);
		//값 비교이기 때문에 정수보다 실수가 크다는건 여기선 x

		res = su2 == su4;  //int 80과 double 80.0비교. 
		System.out.println(res);
		
		char c1 = 'a';  //97
		char c2 = 'A';  //65
		
		res = su1 >= c1; //int 90과 char 97 비교
		System.out.println(res);
		
		res = c1 >= c2;  //char 97과 char 65 비교
		System.out.println(res);	
	}
}
