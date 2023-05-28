package day19.com.ict.edu;

public class Ex02_Dog extends Thread{
//스레드 클래스에는 start와 run이 있음.
//실제 일하는 애는 run
	
	//이렇게 하면 메인 스타트가 스타트를 먼저 찾기 때문에 이건 메인이 함!
	//이럼 스레드 처리 한거 아님. 
	//여기에는 스타트 만들면 안됨.
//	public void start() {
//		for(int i = 0; i < 20; i++) {
//			System.out.println("멍! 멍~~!"+Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for(; ;) {
			System.out.println("멍! 멍~~!"+Thread.currentThread().getName());
		}
	}
}
