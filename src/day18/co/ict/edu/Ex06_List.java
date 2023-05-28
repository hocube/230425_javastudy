package day18.co.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06_List {
	//List 인터페이스 : 배열과 흡사한 구조
	//				 삽입, 삭제, 추가가 자유롭다.
	//				 크기를 미리 정하지 않아도 된다.
	//List 인터페이스를 구현하는 클래스 : Stack, ArrayList, Vector;

	//Stack : LIFO(Last In First Out)
	//		  마지막에 들어온 데이터가 먼저 나가는 형태
	//add, push, addElement => 추가
	//add(index, E) => 삽입
	//pop : 맨 위에 존재하는 객체를 반환하고 삭제 한다.
	//peek : 맨 위에 존재하는 객체를 반환. 삭제 안 함.
	//search : 검색 (오른쪽부터 시작되고 1부터 시작)
	//**indexOf : 검색 (왼쪽부터 시작되고 0부터 시작) 선택과 집중! 하나만 알면 되니깐 search보다는 얘를 알자!
	//elementAt(index) : 요소 반환
	//**get((index) : 요소 반환
	//firstElement() : 처음 요소 반환  
	//lastElement() : 마지막 요소 반환
	//setElement(Element, index) : 반환
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이콜");
		System.out.println(stack);  //원래는 제일 늦게 들어온 마이콜이 나가야하지만 
		System.out.println();
		
		//삽입
		stack.add(0, "고길동");   //내가 넣고 싶은거 넣을 수도 있음.
		stack.add(2, "희동이");   
		System.out.println(stack);  
		System.out.println();
		
		//마지막 객체 보기 : pop(삭제), peek(삭제 안함)
		//peek
		System.out.println(stack.peek());  //삭제 안됨.
		System.out.println(stack);
		System.out.println();
		
		//pop
		System.out.println(stack.pop());  //삭제 안됨.
		System.out.println(stack);
		System.out.println();
	
		//contains: 둘리를 가지고 있니?
		if(stack.contains("둘리")) { 
			//둘리 위치 찾기
		System.out.println(stack.indexOf("둘리"));  //왼쪽부터, 0부터, 배열식
		System.out.println(stack.search("둘리"));   //오른쪽부터, 1부터
		//둘 다 알 필요 없음. indexOf를 외우자
		
			//위치값을 이용해 객체 얻기
		System.out.println(stack.get(1));          //인덱스of에서 1이였으니깐
		System.out.println(stack.elementAt(1));
		//둘 다 알 필요 없음. get을 외우자
		System.out.println(stack.get(stack.indexOf("둘리")));
		}else {
			System.out.println("존재하지 않음");
		}
		System.out.println();
		
		
		//고길동 있니? -> 고길동을 도우너로 바꾸기
		if(stack.contains("고길동")) {
			//치환
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
		System.out.println(stack);
		System.out.println();
		
		
		//중복 가능
		stack.add("둘리");
		stack.add("고길동");
		System.out.println(stack);
		System.out.println();
		
		
		//하나씩 꺼내기 (배열, 왼쪽, 0부터)
		for (String k : stack) {
			System.out.println(k + "님");
		}
		System.out.println();
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k + "짱");
		}
		System.out.println();
		
		
		//스택 방식으로 (오른쪽)
		while (! stack.isEmpty()) { 
			String k = stack.pop();   //삭제 된다.
			System.out.println(k + ", 크기는 " + stack.size() + "이다.");
		}
		System.out.println();
		
	}

}
