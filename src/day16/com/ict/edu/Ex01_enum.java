package day16.com.ict.edu;

import java.util.Iterator;

public class Ex01_enum {
	// 열거형(enum) : 상수를 하나의 객체로 인식하고, 여러 개의 상수 객체들을 한 곳에
	//				모아둔 하나의 묶음
	
	int su = 12;
	static final int JAVA = 200;
	static final int HTML = 300;
	
	public void play() {
		//지역변수에서는 static 사용 불가
		//지역변수는 호출할 때 만들어 지는데 static은 미리 만들어 지니깐 오류.
		//static final int CSS = 500;
	}
	
	//열거형
	public enum Lesson{
		//상수 객체 (하나를 객체로 봄)
		JAVA, JSP, SPRING, ANDROID, HTML
	}
	
	public static void main(String[] args) {
		int num = 100;
		
		//지역변수는 static을 사용할 수 없다.
		//static final int JSP = 400;
		
		//static 메서드에서는 전역 변수 사용 불가
		//System.out.println(su);   
		
		//지역변수 사용가능 
		System.out.println(num);
		
		System.out.println(JAVA);
		System.out.println(HTML);
		
		//열거형 안에 있는 JAVA 추출
		//현재 JAVA랑 HTML 2개씩 있음(static 상수에도 있음)
		Lesson s1 = Lesson.JAVA;    //추출 됐음.
		System.out.println(s1);     //출력
		
		//한번에 다 추출 (배열로)
		Lesson[] items = Lesson.values();  //배열이니깐 for문으로 출력
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + ":" + items[i].ordinal());
														//ordinal() : 배열의 인덱스(index) 값
		}
		
	}
}
