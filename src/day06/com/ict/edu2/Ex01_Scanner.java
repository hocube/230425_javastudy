package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력장치 (모니터)
		// System.in  => 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야 된다.
		
		// java.lang 패키지 안에 존재하는 클래스는 아무런 제약 없이 사용가능(import 안함)
		// java.lang 패키지 외에 존재하는 클래스는 무조건 import를 해야한다.
		
		// import 방법) 1. 클래스 이름 뒤에서 ctrl + space
		//             2. ctrl + shift + o
		
		//nextChar( )는 존재하지 않는다. 그러므로 char은 사용 못함. 
		
		//해당 클래스 뒤에 커서를 뒤에 놓고 shift + F2 누르면 해당 클래스 API 설명서가 나타난다.
		Scanner scan = new Scanner(System.in);
	//   클래스   이름
	//   int    su  =  10; 과 같음
		
		System.out.print("이름 : ");
		// .next(); : 입력한 내용을 String으로 처리하는 메서드/숫자 문자 모두 가능
		String name = scan.next();    //.next는 띄어쓰기나 엔터를 치면 끝나버림.
		System.out.println("받은 내용 : " + name);
		
		System.out.print("나이 : ");
		String age = scan.next();    
		System.out.println("받은 내용 : " + (age+1)); //받은 내용 : 321 이렇게 나와버림. 문자라
		
		System.out.print("나이 : ");
		// .nextInt(); : 입력한 내용을 int로 처리하는 메서드/숫자만 가능. 문자 입력하면 오류.
		int age2 = scan.nextInt();    
		System.out.println("받은 내용 : " + (age2+1)); //얘는 숫자로 받아서 더하기가 되었음.
		
		System.out.print("키 : ");
		//.nextDouble() : 입력한 내용을 double로 처리하는 메서드/문자 입력하면 오류/정수 입력하면 자동으로 실수로 바뀜
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : " + ke);
		
		System.out.print("당신은 남성입니까? (true/false)");
		//.nextBoolean() : 입력한 내용을 boolean으로 처리하는 메서드/숫자 및 다른 문자 입력하면 오류
		boolean gender = scan.nextBoolean(); 
		System.out.println("받은 내용 : " + gender);
		if(gender) {
			System.out.println("당신은 남성입니다");
		}else {
			System.out.println("당신은 여성입니다");
		}
		
	}
}
