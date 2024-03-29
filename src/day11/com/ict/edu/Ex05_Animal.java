package day11.com.ict.edu;

public class Ex05_Animal {
	// 생존 여부
	boolean live;
	
	// 나이
	int age;
	
	// 이름
	String name;
	
	
	//모두 k1으로 했지만 } 지나면 끝나기 때문에 없어져서
	//다 k1으로 써도 가능하다.
	
	// 생존여부를 변경하는 메서드
	public void setLive(boolean k1) {
		live = k1;
	}
	
	// 생존여부를 반환하는 메서드
	public boolean getLive() {
		return live;
	}

	// 나이를 변경하는 메서드
	public void setAge(int k1) {
		age = k1;
	}
	
	// 나이를 반환하는 메서드
	public int getAge() {
		return age;
	}
	
	// 이름을 변경하는 메서드
	public void setName(String k1) {
		name = k1;
	}
	
	// 이름을 반환하는 메서드
	public String getName() {
		return name;
	}
	
	
	
	
	// 이름, 나이, 생존여부를 한 번에 변경하자
	// 인자의 순서만 다르게 해도 얘네는 모두 다른 애들이다.
	public void play(String s1, int s2, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	}
	
	public void play(int s2, String s1, boolean s3) {
		name = s1;
		age = s2;
		live = s3;
	}
	
	public void play(boolean s3, int s2, String s1) {
		name = s1;
		age = s2;
		live = s3;
	}
	
	
	// 이름, 나이, 생존여부 한 번에 반환하자
	//자료형이 다 틀려서 이건 못함.
	
	
	// 이름, 나이, 생존여부 한 번에 출력하자
	public void prn() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if(live) {
			System.out.println("생존 여부: 살았음");
		}else {
			System.out.println("생존 여부: 죽었음");
		}
	}

	
}//class
