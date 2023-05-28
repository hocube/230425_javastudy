package day18.co.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {
	// List 인터페이스 : 배열과 흡사한 구조
	// 삽입, 삭제, 추가가 자유롭다.
	// 크기를 미리 정하지 않아도 된다.
	// List 인터페이스를 구현하는 클래스 : Stack, ArrayList, Vector;
	// ArrayList : 멀티스레드 동기화 지원 안함
	// Vector : 멀티스레드 동기화 지원 함
	// ArrayList, Vector 사용법은 같다.

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민"); // 중복 가능
		
		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add("손흥민"); // 중복 가능
		
		System.out.println(list);
		System.out.println();
		System.out.println(vector);
		System.out.println();
		
		
		//삽입 
		list.add(1,"차범근");
		vector.add(1,"차범근");
		
		System.out.println(list);
		System.out.println();
		System.out.println(vector);
		System.out.println();
		
		//검색)list는 search(), elementAt(), firstElement(), lastElement() 다 없음
		//indexOf()
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));  //손흥민 두개 있으니깐 위치 찍어봤더니 0 찍힘
			System.out.println(list.lastIndexOf("손흥민"));  //마지막 손흥민 찾아냄.
			
			//치환 가능
			list.set(list.lastIndexOf("손흥민"),"박지성"); //마지막 손흥민 찾아서 박지성으로 바꿔줘
		}
		System.out.println(list);
		System.out.println();
		
		
		//검색)vector는 elementAt(), firstElement(), lastElement() 가 있다.
		if(vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민"));  //손흥민 두개 있으니깐 위치 찍어봤더니 0 찍힘
			System.out.println(vector.lastIndexOf("손흥민"));  //마지막 손흥민 찾아냄.
			
			//치환 가능
			vector.set(vector.lastIndexOf("손흥민"),"차두리");
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println(vector);
		System.out.println();
		
		//삭제 : remove 
		list.remove("박지성");
		vector.remove("차두리");
		System.out.println(list);
		System.out.println(vector);
		
		//만약 겹치는거 삭제하면 마지막 손흥민만 삭제됨
		//list.remove("손흥민");
		//vector.remove("손흥민");
		
		//출력 : 개선된 for문, iterator 으로 하면 됨.
		for (String k : vector) {
			System.out.println(k + "골");
		}
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + "킥");
		}
			
		}

	}
