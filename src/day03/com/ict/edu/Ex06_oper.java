package day03.com.ict.edu;

public class Ex06_oper {
	public static void main(String[] args) {
		//대입연산 : =,  +=, -=, *=, /=, %/
		// A = B   -> 변수 A에 데이터 B를 저장
		// A += B  -> 변수 A가 가지고 있는 데이터와 B가 가지고 있는 데이터를 +(더한) 후 A에 저장하라
		
		int su1 = 7;
		
		su1 += 4; //su1 = su1 + 4.  su1 + 4를 해서 su1에 저장해라
		System.out.println("결과 : " + su1);
		
		su1 -= 4; //su1 = su1 - 4.  su1 - 4를 해서 su1에 저장해라
		System.out.println("결과 : " + su1);
 }
}
