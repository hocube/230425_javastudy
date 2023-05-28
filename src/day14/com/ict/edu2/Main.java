package day14.com.ict.edu2;

import day14.com.ict.edu3.DCa_Phone;
import day14.com.ict.edu3.MP3_Phone;

public class Main {
	public static void main(String[] args) {
		// 상속 안했을 때는 객체 생성해서 사용
		MP3_Phone mp3 = new MP3_Phone();
		mp3.call();
		mp3.sms();
		mp3.sound();
		System.out.println();

		DCa_Phone dca = new DCa_Phone();
		dca.call();
		dca.sms();
		dca.picture();
	}
}
