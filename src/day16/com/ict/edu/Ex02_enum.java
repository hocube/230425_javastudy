package day16.com.ict.edu;

enum Type {
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02_enum {
	String name;
	int size;
	Type type;   //자료형을 enum으로 넣었음.

	public static void main(String[] args) {
		Ex02_enum shose = new Ex02_enum();
		shose.name = "나이키";
		shose.size = 270;
		shose.type = Type.RUNNING;   //상수일 땐 클래스.으로 넣어하는데 enum을 불러서 넣음

		System.out.println("신발 이름: " + shose.name);
		System.out.println("신발 사이즈: " + shose.size);
		System.out.println("신발 종류: " + shose.type);
										//Type.RUNNING
	}
}
