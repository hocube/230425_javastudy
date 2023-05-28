package day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());

		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();

		// 멀티 스레드 : 여러 개의 스레드를 만들어서 병렬 처리
		// 스레드 만드는 방법 : start()를 호출해서 run()으로 가면 스레드 생성 (일꾼 생성)
		// start()는 start()를 먼저 찾는다. 그리고 start()가 없으면 run()을 찾는다!
		
		dog.start();
		cat.start();
		System.out.println("main : " + Thread.currentThread().getName());
		
		//출력 순서는 알 수 없음
		//순서는 스케쥴러가 하는 것이기 때문에 
	}
}
