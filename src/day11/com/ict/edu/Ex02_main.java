package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		//생성자 만듦
		Ex02_method t1 = new Ex02_method();
		
		//메서드 실행 전
		System.out.println("===메서드 실행 전===");
		System.out.println("총점: " + t1.sum);
		System.out.println("평균: " + t1.avg);
		System.out.println("학점: " + t1.hak);
		//아직 실행 안 했기 때문에 원래 값이 나옴.
		/*  총점: 0
		 *	평균: 0.0
		 *	학점: 
		 */
		
		System.out.println("===메서드 실행===");
		//메서드 호출
		t1.getSum();  //일을 함.
		t1.getAvg();  //일을 함.
		t1.getHak();  //일을 함.
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
	}
}
