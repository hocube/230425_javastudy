package day18.co.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Ex09_Map {
	//Map 인터페이스 : Key와 Value가 1:1 매핑 구조를 가지고 있다.
	//			    Key는 중복될 수 없다. (기존 value가 삭제 된다(덮어쓰기))
	//				value는 중복 가능
	//				Key를 호출하면 Value가 나온다.
	//				Key를 별도로 관리 (Set으로 관리 => KeySet())
	//				add() 로 추가를 못 함.
	//				put(key, value)로 추가할 수 있다.
	//	 관련 클래스 : HashMap 
	
	public static void main(String[] args) {
		
		// 생성(key가 숫자인 경우, value는 문자열인 경우)
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(0,"한국");
		map1.put(1,"미국");
		map1.put(2,"영국");
		map1.put(8,"태국");
		map1.put(10,"중국");
		map1.put(3,"남아프리카공화국");
		
		System.out.println(map1);
		System.out.println();
		
		//중복
		map1.put(10, "대만");    	   //10 키값 중복이지만 오류는 없음.
		System.out.println(map1);  //중국이 대만으로 바뀜
		System.out.println();

		
		//하나씩 출력 get(key)
		System.out.println(map1.get(2));  //key를 호출하면 value가 나온다.
		System.out.println(map1.get(3));  //null; 없는걸 부르면 오류 나지 않고 엇다고 말함.
		//for문 사용 못 함. 0,1,2,3,4 이런식으로 나열된게 아니기 때문에 할 수 없다.
		System.out.println();
		
		//삭제 : remove(key) - key, value 다 삭제
		map1.remove(5);
		System.out.println(map1);
		System.out.println();
		
		//방법1
		//key를 set에서 관리하게 한다. keySet(); 메서드 
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));   //숫자만 출력
		}
		System.out.println();
		
		//방법2
		Iterator<Integer>it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map1.get(k));
		}
		System.out.println();
		
		
		
		//entrySet() 메서드는 Key, Value 값이 모두 필요한 경우 사용
		Set set1 = map1.entrySet();
		//System.out.println(set1);
		Iterator it2 = set1.iterator();
		
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}
