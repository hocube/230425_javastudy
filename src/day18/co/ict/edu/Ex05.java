package day18.co.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		//로또 : 1 ~ 45, 랜덤, 중복안됨, 6자리
		
		TreeSet<Integer> lotto = new TreeSet<>();
		
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
			//중복 체크 안해도 가능
			if(! lotto.add(su)) { //false가 나오면 중복 때문에 안들거 가진 건데 '!' 붙여서 true가 됨.
				    i--;		 //즉, '안들어 가지면!'이 된거
				    			 //i--;는 중복 나오면 앞으로 다시 돌아가서 그 자리에 다시 넣어야 하니깐.
			}
		}
		System.out.println(lotto);
	}
}
