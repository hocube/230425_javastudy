package day19.com.ict.edu;

//스레드(일꾼) : 프로세스(실행하고 있는 프로그램) 내에서 실행되는 세부 작업 단위
//멀티 스레드 : 하나의 프로세스에서 여러 개의 스레드가 병행적으로 처리되는 것
//싱글 스레드 : 하나의 프로세스에 하나의 스레드가 일처리하는 것(day01 ~ day18 까지 한건 싱글 스레드)

//자바에서 스레드 생성법 : 
//★자바에서는 start() 메서드를 호출하여 run() 메서드가 실행되면 그걸 '스레드 실행' 됐다고 함.
//1. Thread 클래스 상속 받기 : start(), run() 메서드가 모두 있다.
//2. Runnable 인터페이스 구현 : run()만 있다. 

//Thread 클래스 생성자 : Thread(), Thread(Runnable 인터페이스를 구현한 객체)
//					 Thread('스레드 이름(내맘대로)'), Thread(Runnable 인터페이스를 구현한 객체, '스레드 이름')

public class Ex01_Thread {
	public void play() {
		System.out.println("스레드 이름-2 : " + Thread.currentThread().getName());
		System.out.println("컴퓨터로 놀기");
		System.out.println("스레드 이름-3 : " + Thread.currentThread().getName());
	}
	
	public String sound() {
		System.out.println("스레드 이름-5 : " + Thread.currentThread().getName());
		return "음악듣기";
	}
	
	
	public static void main(String[] args) {
		//지금은 싱글스레드 이다. (즉, 하나의 스레드가 모든 일을 다 처리한다)
		//Thread.currentThread().getName: 현재 일하는 스레드 이름 출력 
		//숫자 순서대로 일 처리 함
		//main 메서드에서 일하는 스레드를 main 스레드라고 한다. (즉, main 메서드가 모든 일 처리 다 함=싱글 스레드)
		System.out.println("스레드 이름-1 : " + Thread.currentThread().getName());
		
		//생성
		Ex01_Thread test = new Ex01_Thread();
		
		test.play();
		System.out.println("스레드 이름-4 : " + Thread.currentThread().getName());
		
		String msg = test.sound();
		System.out.println("스레드 이름-6 : " + Thread.currentThread().getName());
		System.out.println(msg);
	}

}
