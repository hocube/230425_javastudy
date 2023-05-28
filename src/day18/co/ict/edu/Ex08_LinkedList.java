package day18.co.ict.edu;

import java.util.LinkedList;

public class Ex08_LinkedList {
	// Queue(큐) 인터페이스 : FIFO(Frist In First Out)
	// 먼저 들어온 정보가 먼저 나감
	// Queue를 구현한 클래스 : LinkedList
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		// 추가, 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("또치");
		linkedList.addLast("희동이");
		linkedList.offerLast("둘리"); // 중복 가능
		linkedList.add(3, "차두리");
		System.out.println(linkedList);

		// 둘리 있니?
		if (linkedList.contains("둘리")) {
			System.out.println(linkedList.indexOf("둘리")); // 둘리 두개 중 앞에꺼 나옴.
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
			
			// 치환
			linkedList.set(linkedList.lastIndexOf("둘리"), "공실이"); //마지막 둘리를 공실이로 바꾸기
		}
		System.out.println(linkedList);
		System.out.println();
		
		//삭제 : remove(Object o), removeFirst(), removeLast()
		linkedList.removeFirst();	  
		linkedList.removeLast();
		linkedList.remove("차두리");
		linkedList.remove();           //아무것도 안하면 맨 앞에 객체 삭제.
		System.out.println(linkedList);
		
		
		}
}
