package day18.co.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {

//Set 인터페이스를 구현하는 클래스 : HashSet, TreeSet
		// 특징 : 중복 안됨, 특정 기준으로 정렬 할 수 없음.
		// (단, TreeSet은 항상 오름차순을 유지한다.)
		// 형식 : HashSet<제네릭 타입 = 객체 타입 = 클래스> 참조변수 = new HashSet<(제네릭 타입 = 객체 타입 =
		// 클래스)>();
		// (괄호 안에 생략 가능)
		// TreeSet<제네릭 타입 = 객체 타입 = 클래스> 참조변수 = new TreeSet<(제네릭 타입 = 객체 타입 = 클래스)>();
		// (괄호 안에 생략 가능)

		// 1. 컬렉션 생성 (랩퍼클래스 : 기본 자료형들을 클래스로 만들어주는 클래스)
		// 종류: Integer, Double, Character, String)
		HashSet<Integer> h1 = new HashSet<>(); // int 안되고 Integer 사용해야 함
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();

		System.out.println(h1); // [ ] 이렇게 출력되지만 배열은 아님.

		// 2. 컬렉션에 객체 넣기(add)
		h1.add(new Integer(14)); // new 붙이는게 정석
		h1.add(new Integer("16"));
		h1.add(20); // 오토박싱 : 기본 자료형 해당 객체로 만들어진다.
					// 오토 언박싱 : 해당 객체를 기본 자료형으로 되돌리는 것.

		System.out.println(h1); // [16, 14] 출력 / 정렬이 안되기 때문에 순서대로 안 나오고 마음대로 출력

		h2.add(new Double(30.1));
		h2.add(new Double("35.1"));
		// 위에 애들을 오토박싱 언박싱 해보기
		h2.add(38.2); // 오토박싱
		// h2.add(30); //프로모션 안됨. 무조건 제네릭 타입을 맞춰야 한다. double이니깐 double로!

		System.out.println(h2);

		// 중복 안됨
		h3.add(new Character('j'));
		h3.add('a');
		h3.add('v');
		h3.add('a'); // 중복 불가, 들어가지 않음.

		System.out.println(h3); // [a, v, j] 두번째 a 안들어 갔음.
		System.out.println();

		// 전체 내용 하나씩 꺼내보기
		// 방법1)
		System.out.println("하나씩 처리하기 (방법1: 개선된 for문)");
		// 우리 눈에는 [30.1, 38.2, 35.1] 이런식으로 결과가 보이지만 이건 인덱스 값 아님! h1[i]이런식으로 할 수 없음
		// 그래서 일반 for문 사용 불가. -> 개선된 for문 사용해야 함(for each 사용)
		for (Integer k : h1) {
			System.out.println(k); // 언박싱 되는 것
		}
		System.out.println();

		// 방법2)
		System.out.println("하나씩 처리하기 (방법2: iterator)");
		Iterator<Double> it = h2.iterator();
		while (it.hasNext()) { // while 컨트롤 스페이스바 했을 때 두번째꺼
			Double k = (Double) it.next();
			System.out.println(k);
		}
		System.out.println();

		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character k = (Character) it2.next();
			System.out.println(k);
		}

	}

}