package day19.com.ict.edu;

public class Ex04_Cat implements Runnable{
	@Override
	public void run() {
		while (true) {
			//3초간 대기 상태, 1000이 1초
			//sleep은 무조건 try catch 해야 함.
			try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("야옹~!");
		}
	}
}
