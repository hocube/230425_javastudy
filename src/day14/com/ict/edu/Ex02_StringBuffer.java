package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {
	public static void main(String[] args) {
		// 문자열을 추가할 때 사용 (메모리 주소가 변경되지 않는다)
		// 추가할 때 append() 사용
		// toString() => String 전환한다.
		
		StringBuffer sb = new StringBuffer("ictedu");
		
		//추가 (스트링버퍼로 변경 됨)
		sb.append(" 대한민국");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println();
		
		
		
		
		//StringTokenizer : 구분자를 이용해서 문자열 분리, split과 차이점은 배열의 크기를 지정 못 함.
		//					구분자가 없으면 (띄어쓰기, ',') 알아서 구분
		//nextToken()를 이용해서 문자열 분리 
		
		//split(String regex) : String[] 
		//split(String regex, int limit) : String[] 
		//regex => 구분자(나눌 기준), limit => 배열의 크기 (방의 갯수)
		
	  //현재 검사하는 애가 ↓ 여기 있음. 다음게 있으면 계속 뒤로 가면서 끄집어 냄.
		String str = "사과 바나나 망고 오렌지 수박";
		//구분자 없음 (띄어쓰기, 탭, 줄 바꾸기)
		StringTokenizer st = new StringTokenizer(str);   //쪼갤거야
		while (st.hasMoreElements()) { //Elements:요소 
									   //hasMoreElements: '다음 요소가 있니?' 라는 뜻
									   //있으면 true, 없으면 false
			String res = st.nextToken();  //있으면 다음꺼를 끄집어 내세요(추출)->'사과'가 나옴
			System.out.println(res);
		} //false가 나오면 그만 하고 나옴// 횟수를 모르니깐 for문으로 못 함.
		System.out.println();
		
		
		
		str = "사과,바나나,망고,오렌지,수박";
		//구분자 있음(,(컴마))
		//split과 다른 점은 크기 지정 못함.
		StringTokenizer st2 = new StringTokenizer(str, ",");
		while (st2.hasMoreElements()) { 
			String res = st2.nextToken();
			System.out.println(res);
		} 
		System.out.println();
		
		
		//추천
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
