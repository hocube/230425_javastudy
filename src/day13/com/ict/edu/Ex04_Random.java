package day13.com.ict.edu;

import java.util.Random;

public class Ex04_Random {
	public static void main(String[] args) {
		// 난수(정해지지 않은 수)를 발생하는 방법
		
		// Math.random(), Random 클래스
		//   ↑ static (클래스. 이니깐)
		
		
		// 1. Random 클래스
		Random ran = new Random();   //객체 생성
		
		// 각종 기본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생 (음수도 나옴)
		System.out.println("boolean형: " + ran.nextBoolean());
		System.out.println("int형: " + ran.nextInt());  //인자 없는 int
		System.out.println("long형: " + ran.nextLong());
		
		// double은 0.0이상(포함) 1.0미만(포함 X)에서 난수 발생
		System.out.println("double형: " + ran.nextDouble());
		
		// ★특정 범위를 지정하는 방법
		// 1. nextInt(범위) : 0 ~ 범위 전까지(범위 포함 X) 난수 발생 (정수로 나옴)
		System.out.println("int(범위): " + ran.nextInt(5));   // 0 ~ 4
		
		// 2. (int)(nextDouble() * 범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		// 위에 nextInt와 값은 같지만 얘가 값이 겹칠 확률이 더 적음.
		System.out.println("int(범위): " + (int)(ran.nextDouble() * 5));   // 0 ~ 4
		
		//nextInt(), nextLong(), ran.nextDouble() 사용한 후 /3 해서
		//0을 가위로 하고, 1을 바위로 하고, 2를 보로 하고...
		
		System.out.println("=========================");
		
		
		
		
		
		// Math 클래스 : 전체 메서드가 static, 객체 생성없이 호출 가능
		// 1) random()
		System.out.println("Math.random: " + Math.random());  //0.0 ~ 1.0미만
		
		// 특정 범위 지정
		System.out.println("Math.random(0~4): " + (int)(Math.random()*5));
		
		// 올림, 반올림, 버림
		System.out.println("올림: " + Math.ceil(3.45));   //4.0
		System.out.println("올림: " + Math.ceil(3.55));   //4.0
		
		System.out.println("반올림: " + Math.round(3.45));  //3
		System.out.println("반올림: " + Math.round(3.55));  //4
		
		System.out.println("버림: " + Math.floor(3.45));  //3.0
		System.out.println("버림: " + Math.floor(3.55));  //3.0
	}
}
