package day18.co.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {

		// 1.
		// 컬렉션을 배열로 => toArray();
		// 배열을 컬렉션으로 => Arrays.asList();

		String[] str = { "java", "Java", "JAVA", "자바" };
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();

		for (String k : str) {
			set1.add(k);
		}
		System.out.println(set1);
		System.out.println();

		// set1의 모든 요소를 set2에 넣어주세요 (addAll());
		set2.addAll(set1);
		System.out.println("set2 = " + set2);
		System.out.println();
		
		
		// 2.
		// 삭제  : clear(), remove(Object o)
		// 비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));  //얘는 삭제가 되서 true
		System.out.println(set2.remove("jaVA"));  //얘는 없는 놈이라 삭제 못해서 false
		
		//중복 불가
		System.out.println(set2.add("JAVA"));  //아까 지웠던거 다시 넣기
		System.out.println(set2); //들어갔으니깐 true
		System.out.println(set2.add("JAVA"));  //같은거 한번 더 넣기
		System.out.println(set2); //이미 있는거 또 들어가서 false. 중복 불가
		
	}
}
